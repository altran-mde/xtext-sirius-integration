package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.internal.StringSemanticRegion;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.util.EcoreHelper;
import com.altran.general.integration.xtextsirius.util.StyledTextUtil;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor {
	private SemanticElementLocation semanticElementLocation;

	private final Collection<@NonNull String> editableFeatures;

	public XtextSiriusStyledTextCellEditorModel(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine, final Collection<@NonNull String> editableFeatures) {
		super(style, injector, multiLine);
		this.editableFeatures = editableFeatures;
	}

	@SuppressWarnings("restriction")
	@Override
	protected void doSetValue(final Object value) {
		final EObject element = getSemanticElement();
		
		if (element == null) {
			return;
		}
		
		// final INode node = NodeModelUtils.getNode(element);
		// if (node == null) {
		// return;
		// }
		//
		// final StringBuffer text = new
		// StringBuffer(node.getRootNode().getTotalLength());
		// final TextRegion textRegion =
		// StyledTextUtil.calculateAndAdjustEditorOffset(node, text,
		// isMultiLine());
		// super.doSetValue(text.toString());
		
		final Serializer serializer = (Serializer) getInjector().getInstance(ISerializer.class);

		StringBuffer allText;
		String text;
		TextRegion textRegion;

		final @Nullable EObject semanticElement = element;
		// if (semanticElement != null) {
		final ITextRegionAccess region = serializer.serializeToRegions(EcoreUtil.getRootContainer(semanticElement));
		
		final ITextRegionAccess textRegionAccess = region.regionForRootEObject().getTextRegionAccess();
		allText = new StringBuffer(region.regionForDocument().getText());
		
		final IEObjectRegion semanticRegion = region.regionForEObject(semanticElement);
		if (getEditableFeatures().isEmpty()) {
			text = StringUtils.normalizeSpace(semanticRegion.getText());
			textRegion = new TextRegion(semanticRegion.getOffset(), semanticRegion.getLength());
		} else {
			final EClass eClass = semanticElement.eClass();
			final List<ISemanticRegion> regions = getEditableFeatures().stream()
					.map(ef -> eClass.getEStructuralFeature(ef))
					.filter(Objects::nonNull)
					.flatMap(feature -> {
						if (feature instanceof EAttribute
								|| (feature instanceof EReference && !((EReference) feature).isContainment())) {
							return Stream.of(semanticRegion.getRegionFor().feature(feature));
						} else {
							final Object child = semanticElement.eGet(feature);
							if (child instanceof EObject) {
								return StreamSupport
										.stream(region.regionForEObject((EObject) child)
												.getAllSemanticRegions().spliterator(), false);
							} else {
								return Stream.of();
							}
						}
					})
					.collect(Collectors.toList());
			
			final int startOffset = regions.stream()
					.map(reg -> reg.getOffset())
					.min(Integer::compare)
					.get();
			
			final int endOffset = regions.stream()
					.map(reg -> {
						final ISemanticRegion nextHiddenRegion = reg.getNextSemanticRegion();
						if (nextHiddenRegion instanceof StringSemanticRegion) {
							return nextHiddenRegion.getEndOffset();
						}
						return reg.getEndOffset();
					})
					.max(Integer::compare)
					.get();
			
			text = region.regionForRootEObject().getTextRegionAccess().textForOffset(startOffset,
					endOffset - startOffset);
			textRegion = new TextRegion(startOffset, endOffset - startOffset);
		}
		
		System.out.println("allText1:\n" + allText);
		allText.insert(textRegion.getOffset(), "\n");
		textRegion = new TextRegion(textRegion.getOffset() + 1, textRegion.getLength());
		System.out.println("allText2:\n" + allText);
		StyledTextUtil.removeNewlinesIfSingleLine(allText, textRegion.getOffset(), textRegion.getLength(), false);
		
		System.out.println("allText:\n" + allText);
		System.out.println("text: " + text);
		System.out.println("textRegion: " + textRegion);
		// }

		super.doSetValue(allText.toString());

		this.semanticElementLocation = new SemanticElementLocation(element);

		getXtextAdapter().resetVisibleRegion();
		getXtextAdapter().setVisibleRegion(textRegion.getOffset(), textRegion.getLength());
	}
	
	protected @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}
	
	@Override
	public @Nullable Object getValueToCommit() {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final EObject element = location
					.resolve(getXtextAdapter().getXtextParseResult().getRootASTElement().eResource());
			if (element != null) {
				return EcoreHelper.proxify(element, EcoreUtil.getURI(getSemanticElement()));
			}
		}

		return null;
	}
	
	public Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
}

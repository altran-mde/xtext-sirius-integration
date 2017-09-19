package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;

import com.altran.general.integration.xtextsirius.util.ParentMap;
import com.altran.general.integration.xtextsirius.util.RequiredGrammarTerminalsPresentEnsurer;

public class AccessibleRequiredGrammarTerminalsPresentEnsurer extends RequiredGrammarTerminalsPresentEnsurer {
	
	public AccessibleRequiredGrammarTerminalsPresentEnsurer(final EObject element, final EStructuralFeature feature,
			final ITextRegionAccess rootRegion, final StringBuffer allText) {
		super(element, feature, rootRegion, allText);
	}
	
	@Override
	protected void collectBeforeAndAfter() {
		super.collectBeforeAndAfter();
	}

	@Override
	protected @NonNull String collectToTerminalText(@NonNull final List<@NonNull AbstractElement> grammarElements) {
		return super.collectToTerminalText(grammarElements);
	}
	
	@Override
	protected @NonNull List<@NonNull AbstractElement> findContainedElementPath(
			@NonNull final AbstractElement abstractElement,
			@NonNull final EStructuralFeature feature) {
		return super.findContainedElementPath(abstractElement, feature);
	}

	@Override
	protected @NonNull Set<@NonNull ISemanticRegion> findRegionsOfContainedElements() {
		return super.findRegionsOfContainedElements();
	}
	
	@Override
	protected String getWhitespace(final EObject grammarElement) {
		return super.getWhitespace(grammarElement);
	}

	public List<AbstractElement> getElementsBefore() {
		return this.elementsBefore;
	}
	
	public List<AbstractElement> getElementsAfter() {
		return this.elementsAfter;
	}
	
	public void setContainingGroup(final Group group) {
		this.containingGroup = group;
	}

	public void setContainedElement(final AbstractElement element) {
		this.containedElement = element;
	}
	
	public void setParentMap(final ParentMap map) {
		this.parentMap = map;
	}

	public void setElementRegion(final IEObjectRegion region) {
		this.elementRegion = region;
	}

	public void setContainedElementPath(final List<@NonNull AbstractElement> path) {
		this.containedElementPath = path;
	}

	public void setRootRegion(final ITextRegionAccess region) {
		this.rootRegion = region;
	}
	
	public void setAllText(final StringBuffer text) {
		this.allText = text;
	}

	public void setGrammarElement(final AbstractElement element) {
		this.grammarElement = element;
	}
}

package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeListener;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SiriusWrapLabel;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;
import org.yakindu.base.xtext.utils.gmf.figures.SyntaxColoringLabel;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusDirectEditManagerModel;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.value.XtextSiriusDirectEditManagerValue;
import com.google.inject.Injector;

public class ExtractedXtextSiriusEditPart extends XtextLabelEditPart implements IXtextSiriusAwareLabelEditPart {

	private final @NonNull GraphicalEditPart delegate;
	private final @NonNull IXtextDirectEditDescription description;
	private final @NonNull Injector injector;

	public ExtractedXtextSiriusEditPart(final @NonNull GraphicalEditPart delegate, final @NonNull Injector injector,
			final @NonNull IXtextDirectEditDescription description) {
		super((View) delegate.getModel());
		this.delegate = delegate;
		this.injector = injector;
		this.description = description;

		setModel(delegate.getModel());
	}

	/**
	 * This value should never be used. Instead, use {@link #getSemanticElement()}.
	 */
	@Override
	public String getEditText() {
		return "";
	}

	public DSemanticDecorator resolveSemanticElement() {
		return (DSemanticDecorator) super.resolveSemanticElement();
	}

	protected @NonNull String getValueFeature() {
		final DSemanticDecorator decorator = resolveSemanticElement();
		if (decorator instanceof DDiagramElement) {
			final RepresentationElementMapping mapping = ((DDiagramElement) decorator).getMapping();
			;
			if (mapping instanceof DiagramElementMapping) {
				final DirectEditLabel directEdit = ((DiagramElementMapping) mapping).getLabelDirectEdit();
				final InitialOperation initialOperation = directEdit.getInitialOperation();
				if (initialOperation != null) {
					final ModelOperation modelOperation = initialOperation.getFirstModelOperations();
					if (modelOperation instanceof SetValue) {
						return ((SetValue) modelOperation).getFeatureName();
					}
				}
			}
		}

		throw new IllegalStateException("Cannot find SetValue operation for directEdit " + this);
	}

	@Override
	protected DirectEditManager createDirectEditManager() {
		if (this.description instanceof IXtextDirectEditModelDescription) {
			return new XtextSiriusDirectEditManagerModel(this, this.injector,
					(@NonNull IXtextDirectEditModelDescription) this.description);
		} else if (this.description instanceof IXtextDirectEditValueDescription) {
			final EObject semanticElement = getSemanticElement();
			if (semanticElement != null) {
				return new XtextSiriusDirectEditManagerValue(this, this.injector,
						(@NonNull IXtextDirectEditValueDescription) this.description,
						semanticElement.eClass().getEStructuralFeature(getValueFeature()));
			}

			throw new IllegalStateException("Cannot directEdit a non-existing semanticElement");
		} else {
			return null;
		}
	}

	@Override
	protected void setContext(final Resource resource) {
		// we don't use this API
	}

	@Override
	protected void setLabelStyles() {
		getFigure().setRanges(new StyleRange[] {});
	}

	@Override
	public @Nullable EObject getSemanticElement() {
		return resolveSemanticElement().getTarget();
	}

	@Override
	public @NonNull EObject getClosestExistingSemanticElement() {
		return EditPartHelper.getInstance().findClosestExistingSemanticElementRecursive(resolveSemanticElement());
	}

	@Override
	public void refreshVisuals() {
		super.refreshVisuals();
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
	}

	// public SyntaxColoringLabel getFigure() {
	// return delegate.getFigure();
	// }

	public void addNodeListener(NodeListener listener) {
		delegate.addNodeListener(listener);
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
	}

	@Override
	public IFigure createFigure() {
		return super.createFigure();
	}

	@Override
	public void setFontColor(Color color) {
		super.setFontColor(color);
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Class adapter) {
		return delegate.getAdapter(adapter);
	}

	public List<?> getSourceConnections() {
		return delegate.getSourceConnections();
	}

	public List<?> getTargetConnections() {
		return delegate.getTargetConnections();
	}

	public IFigure getContentPane() {
		return delegate.getContentPane();
	}

	public void removeNodeListener(NodeListener listener) {
		delegate.removeNodeListener(listener);
	}

	public void activate() {
		delegate.activate();
	}

	public void setLayoutConstraint(EditPart child, IFigure figure, Object constraint) {
		delegate.setLayoutConstraint(child, figure, constraint);
	}

	public void addEditPartListener(EditPartListener listener) {
		delegate.addEditPartListener(listener);
	}

	public void addNotify() {
		delegate.addNotify();
	}

	public void deactivate() {
		delegate.deactivate();
	}

	public void eraseSourceFeedback(Request request) {
		delegate.eraseSourceFeedback(request);
	}

	public void eraseTargetFeedback(Request request) {
		delegate.eraseTargetFeedback(request);
	}

	public List<?> getChildren() {
		return delegate.getChildren();
	}

	public Command getCommand(Request request) {
		return delegate.getCommand(request);
	}

	public EditPolicy getEditPolicy(Object key) {
		return delegate.getEditPolicy(key);
	}

	public Object getModel() {
		return delegate.getModel();
	}

	public EditPart getParent() {
		return delegate.getParent();
	}

	public RootEditPart getRoot() {
		return delegate.getRoot();
	}

	public int getSelected() {
		return delegate.getSelected();
	}

	public EditPart getTargetEditPart(Request request) {
		return delegate.getTargetEditPart(request);
	}

	public EditPartViewer getViewer() {
		return delegate.getViewer();
	}

	public boolean hasFocus() {
		return delegate.hasFocus();
	}

	public void installEditPolicy(Object role, EditPolicy editPolicy) {
		delegate.installEditPolicy(role, editPolicy);
	}

	public boolean isActive() {
		return delegate.isActive();
	}

	public boolean isSelectable() {
		return delegate.isSelectable();
	}

	public void performRequest(Request request) {
		delegate.performRequest(request);
	}

	public void refresh() {
		delegate.refresh();
	}

	public void removeEditPartListener(EditPartListener listener) {
		delegate.removeEditPartListener(listener);
	}

	public void removeEditPolicy(Object role) {
		delegate.removeEditPolicy(role);
	}

	public void removeNotify() {
		delegate.removeNotify();
	}

	public void setFocus(boolean hasFocus) {
		delegate.setFocus(hasFocus);
	}

	public void setModel(Object model) {
		super.setModel(model);
		if (delegate != null) {
			delegate.setModel(model);
		}
	}

	public void setParent(EditPart parent) {
		delegate.setParent(parent);
	}

	public void setSelected(int value) {
		delegate.setSelected(value);
	}

	public void showSourceFeedback(Request request) {
		delegate.showSourceFeedback(request);
	}

	public void showTargetFeedback(Request request) {
		delegate.showTargetFeedback(request);
	}

	public boolean understandsRequest(Request request) {
		return delegate.understandsRequest(request);
	}
	
	private SyntaxColoringLabel wrappedFigure = null;
	
	@Override
	public SyntaxColoringLabel getFigure() {
		IFigure result = delegate.getFigure();
		
		if (result instanceof SyntaxColoringLabel) {
			return (SyntaxColoringLabel) result;
		} else if (result instanceof WrappingLabel) {
			if (this.wrappedFigure == null) {
				this.wrappedFigure = new SyntaxColoringLabelWrapper((WrappingLabel) result);
			}
			
			return this.wrappedFigure;
		} else if (result instanceof SiriusWrapLabel) {
			if (this.wrappedFigure == null) {
				this.wrappedFigure = new SyntaxColoringLabelSiriusWrapper((SiriusWrapLabel) result);
			}
			
			return this.wrappedFigure;
		}else {
			throw new IllegalStateException("Unknown type of figure: " + result);
		}
	}
	
//	public IFigure getFigureAlt() {
//		return delegate.getFigure();
//	}
//	
//	@Override
//	public void setLabelText(String text) {
//		IFigure figure = getFigureAlt();
//		
//		if (figure instanceof SyntaxColoringLabel) {
//			((SyntaxColoringLabel) figure).setText(text);
//		} else if (figure instanceof WrappingLabel) {
//			((WrappingLabel) figure).setText(text);
//		} else {
//			throw new UnsupportedOperationException("figure of unknown type: "+figure.getClass());
//		}
//	}
//	
//	@Override
//	protected void updateLabelText() {
//		setLabelText(getEditText());
//	}
//	
//	@Override
//	protected void setForegroundColor(Color color) {
//		getFigureAlt().setForegroundColor(color);
//	}
//
//
//    /**
//     * sets the visibility of this edit part
//     * @param vis the new value of the visibility
//     */
//    protected void setVisibility(boolean vis) {
//        if (!vis && getSelected() != SELECTED_NONE)
//            getViewer().deselect(this);
//        
//        IFigure _figure = getFigureAlt();
//        if (_figure.isVisible()==vis){
//            return;
//        }
//        
//        // if we are going to hide the node then connections coming to the
//        // node or outside it should be hidden as well
//        if (getFlag(FLAG__AUTO_CONNECTIONS_VISIBILITY)) {
//        	setConnectionsVisibility(vis);
//        }
//        _figure.setVisible(vis);
//        _figure.revalidate();
//    }
//
//    /**
//     * Sets the font to the label.
//     * This method could be overriden to change the font data of the font
//     * overrides typically look like this:
//     *      super.setFont(
//     *      new FontData(
//     *          fontData.getName(),
//     *          fontData.getHeight(),
//     *          fontData.getStyle() <| &> SWT.????));
//     * @param fontData the font data
//     */
//    protected void setFont(FontData fontData) {
//         if (cachedFontData != null && cachedFontData.equals(fontData)) {
//            // the font was previously set and has not changed; do nothing.
//            return;
//        }
//
//        try {
//            Font newFont = getResourceManager().createFont(
//                FontDescriptor.createFrom(fontData));
//            getFigure().setFont(newFont);
//            getFigure().repaint();
//
//            if (cachedFontData != null) {
//                getResourceManager().destroyFont(
//                    FontDescriptor.createFrom(cachedFontData));
//            }
//            cachedFontData = fontData;
//        } catch (DeviceResourceException e) {
//            Trace.catching(DiagramUIPlugin.getInstance(),
//                DiagramUIDebugOptions.EXCEPTIONS_CATCHING, getClass(),
//                "setFont", e); //$NON-NLS-1$
//            Log.error(DiagramUIPlugin.getInstance(),
//                DiagramUIStatusCodes.IGNORED_EXCEPTION_WARNING, "setFont", e); //$NON-NLS-1$
//        }
//    }
}

package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;

@SuppressWarnings("restriction")
public class XtextSiriusEdgeEditPart extends DEdgeEditPart {
//	public class XtextSiriusViewEdgeFigure extends ViewEdgeFigure {
//        private SiriusWrapLabelWithAttachment fFigureViewEdgeNameFigure;
//
//        private SiriusWrapLabelWithAttachment fFigureViewEdgeBeginNameFigure;
//
//        private SiriusWrapLabelWithAttachment fFigureViewEdgeEndNameFigure;
//        
//        private Polyline attachmentToEdgeNameFigure;
//
//        private Polyline attachmentToEdgeBeginNameFigure;
//
//        private Polyline attachmentToEdgeEndNameFigure;
//
//		private CenteringStyle centeringStyle;
//
//		public XtextSiriusViewEdgeFigure() {
//			// do NOT call super(), we want to create our own contents
//			createContents();
//		}
//		
//		protected void createContents() {
//            final EObject element = resolveSemanticElement();
//
//            // We must create the fFigureViewEdgeNameFigure to avoid NPE after
//            // (On some cases, like Undo of ContainerDrop operation, the element
//            // is DSemanticDiagram and not DEdge)
//            createCenterLabelFigure(element);
//            createBeginLabelFigure(element);
//            createEndLabelFigure(element);
//            initCentering(element);
//		}
//		
//        protected void initCentering(EObject element) {
//            if (element instanceof DEdge) {
//                EdgeStyle edgeStyle = ((DEdge) element).getOwnedStyle();
//                if (edgeStyle != null) {
//                    setCentering(edgeStyle.getCentered());
//                }
//            }
//
//        }
//
//        private void setCentering(CenteringStyle centering) {
//            this.centeringStyle = centering;
//        }
//
//        /**
//         * Get the centeringStyle value.
//         * 
//         * @return the {@link CenteringStyle}.
//         */
//        public CenteringStyle getCenteringStyle() {
//            return this.centeringStyle;
//        }
//        
//        /**
//         * @param element
//         */
//        private void createCenterLabelFigure(final EObject element) {
//            attachmentToEdgeNameFigure = addNewAttachmentFigure();
//
//            fFigureViewEdgeNameFigure = new SiriusWrapLabelWithAttachment(LabelViewConstants.MIDDLE_LOCATION, attachmentToEdgeNameFigure);
//            if (element instanceof DEdge) {
//                DEdge edge = (DEdge) element;
//                fFigureViewEdgeNameFigure.setText(edge.getName());
//                fFigureViewEdgeNameFigure.setVisible(!StringUtil.isEmpty(edge.getName()));
//            } else {
//                fFigureViewEdgeNameFigure.setVisible(false);
//            }
//            fFigureViewEdgeNameFigure.setLabelAlignment(PositionConstants.CENTER);
//            fFigureViewEdgeNameFigure.setTextWrap(true);
//            fFigureViewEdgeNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
//            this.add(fFigureViewEdgeNameFigure);
//
//        }
//
//        /**
//         * @param element
//         */
//        private void createBeginLabelFigure(final EObject element) {
//            attachmentToEdgeBeginNameFigure = addNewAttachmentFigure();
//
//            fFigureViewEdgeBeginNameFigure = new SiriusWrapLabelWithAttachment(LabelViewConstants.SOURCE_LOCATION, attachmentToEdgeBeginNameFigure);
//            if (element instanceof DEdge) {
//                DEdge edge = (DEdge) element;
//                fFigureViewEdgeBeginNameFigure.setText(edge.getBeginLabel());
//                fFigureViewEdgeBeginNameFigure.setVisible(!StringUtil.isEmpty(edge.getBeginLabel()));
//            } else {
//                fFigureViewEdgeBeginNameFigure.setVisible(false);
//            }
//            fFigureViewEdgeBeginNameFigure.setLabelAlignment(PositionConstants.LEFT);
//            fFigureViewEdgeBeginNameFigure.setTextWrap(true);
//            fFigureViewEdgeBeginNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
//            this.add(fFigureViewEdgeBeginNameFigure);
//
//        }
//
//        /**
//         * Create a new attachment figure, add it to the current figure and
//         * return it.
//         * 
//         * @return the new attachment figure.
//         */
//        private Polyline addNewAttachmentFigure() {
//            Polyline newAttachment = new Polyline();
//            newAttachment.setLineStyle(Graphics.LINE_DASHDOT);
//            newAttachment.setForegroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_LIST_SELECTION));
//            newAttachment.setVisible(false);
//            this.add(newAttachment);
//            return newAttachment;
//        }
//
//        /**
//         * @param element
//         */
//        private void createEndLabelFigure(final EObject element) {
//            attachmentToEdgeEndNameFigure = addNewAttachmentFigure();
//
//            fFigureViewEdgeEndNameFigure = new SiriusWrapLabelWithAttachment(LabelViewConstants.TARGET_LOCATION, attachmentToEdgeEndNameFigure);
//            if (element instanceof DEdge) {
//                DEdge edge = (DEdge) element;
//                fFigureViewEdgeEndNameFigure.setText(edge.getEndLabel());
//                fFigureViewEdgeEndNameFigure.setVisible(!StringUtil.isEmpty(edge.getEndLabel()));
//            } else {
//                fFigureViewEdgeEndNameFigure.setVisible(false);
//            }
//            fFigureViewEdgeEndNameFigure.setLabelAlignment(PositionConstants.CENTER);
//            fFigureViewEdgeEndNameFigure.setTextWrap(true);
//            fFigureViewEdgeEndNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
//            this.add(fFigureViewEdgeEndNameFigure);
//
//        }
//
//        @SuppressWarnings("deprecation")
//        @Override
//        public void layout() {
//            if (!isActive()) {
//                return;
//            }
//            final EObject element = resolveSemanticElement();
//            if (element != null && DEdge.class.isInstance(element)) {
//                final DEdge edge = (DEdge) element;
//                boolean needRefreshVisuals = false;
//                if (edge.getPath() != null && !edge.getPath().isEmpty()) {
//                    if (AbstractDiagramEdgeEditPart.invalidPath(AbstractDiagramEdgeEditPart.this, edge)) {
//                        if (getSelected() != EditPart.SELECTED_PRIMARY) {
//                            needRefreshVisuals = true;
//                        }
//                    }
//                }
//                if (needRefreshVisuals || edge.isIsMockEdge()) {
//                    refreshVisuals();
//                }
//
//                if (this.getBounds() != null && getSource() != null && getTarget() != null) {
//                    super.layout();
//                }
//
//                if (edge.getName() == null || StringUtil.isEmpty(edge.getName())) {
//                    fFigureViewEdgeNameFigure.setVisible(false);
//                }
//
//                if (edge.getName() != null && !StringUtil.isEmpty(edge.getName()) && !(new DDiagramElementQuery(edge).isLabelHidden()) && !fFigureViewEdgeNameFigure.isVisible()) {
//                    fFigureViewEdgeNameFigure.setVisible(true);
//                }
//                if (edge.getEndLabel() == null || StringUtil.isEmpty(edge.getEndLabel())) {
//                    fFigureViewEdgeEndNameFigure.setVisible(false);
//                }
//                if (edge.getEndLabel() != null && !StringUtil.isEmpty(edge.getEndLabel()) && !(new DDiagramElementQuery(edge).isLabelHidden()) && !fFigureViewEdgeEndNameFigure.isVisible()) {
//                    fFigureViewEdgeEndNameFigure.setVisible(true);
//                }
//                if (edge.getBeginLabel() == null || StringUtil.isEmpty(edge.getBeginLabel())) {
//                    fFigureViewEdgeBeginNameFigure.setVisible(false);
//                }
//                if (edge.getBeginLabel() != null && !StringUtil.isEmpty(edge.getBeginLabel()) && !(new DDiagramElementQuery(edge).isLabelHidden()) && !fFigureViewEdgeBeginNameFigure.isVisible()) {
//                    fFigureViewEdgeBeginNameFigure.setVisible(true);
//                }
//            }
//        }
//
//        /**
//         * Get the name figure.
//         * 
//         * @return the name figure
//         */
//        public SiriusWrapLabel getFigureViewEdgeNameFigure() {
//            return fFigureViewEdgeNameFigure;
//        }
//
//        /**
//         * Get the name figure.
//         * 
//         * @return the name figure
//         */
//        public SiriusWrapLabel getFigureViewBeginEdgeNameFigure() {
//            return fFigureViewEdgeBeginNameFigure;
//        }
//
//        /**
//         * Get the name figure.
//         * 
//         * @return the name figure
//         */
//        public SiriusWrapLabel getFigureViewEndEdgeNameFigure() {
//            return fFigureViewEdgeEndNameFigure;
//        }
//
//	}
	
	
	public XtextSiriusEdgeEditPart(final @NonNull View view) {
		super(view);
	}
	
	@Override
	protected Connection createConnectionFigure() {
		// TODO Auto-generated method stub
		return super.createConnectionFigure();
	}
	
}

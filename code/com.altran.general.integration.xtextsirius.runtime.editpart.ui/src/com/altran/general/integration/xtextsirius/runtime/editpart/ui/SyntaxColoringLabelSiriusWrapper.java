package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.CoordinateListener;
import org.eclipse.draw2d.EventDispatcher;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FocusEvent;
import org.eclipse.draw2d.FocusListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IClippingStrategy;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.draw2d.UpdateManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SiriusWrapLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.yakindu.base.xtext.utils.gmf.figures.SyntaxColoringLabel;

public class SyntaxColoringLabelSiriusWrapper extends SyntaxColoringLabel {
	private final SiriusWrapLabel delegate;

	public SyntaxColoringLabelSiriusWrapper(SiriusWrapLabel delegate) {
		super();
		this.delegate = delegate;
	}
	
	public void add(IFigure figure, Object constraint, int index) {
		delegate.add(figure, constraint, index);
	}

	public void addAncestorListener(AncestorListener ancestorListener) {
		delegate.addAncestorListener(ancestorListener);
	}

	public void addCoordinateListener(CoordinateListener listener) {
		delegate.addCoordinateListener(listener);
	}

	public void addFigureListener(FigureListener listener) {
		delegate.addFigureListener(listener);
	}

	public void addFocusListener(FocusListener listener) {
		delegate.addFocusListener(listener);
	}

	public void addKeyListener(KeyListener listener) {
		delegate.addKeyListener(listener);
	}

	public void addLayoutListener(LayoutListener listener) {
		delegate.addLayoutListener(listener);
	}

	public void addMouseListener(MouseListener listener) {
		delegate.addMouseListener(listener);
	}

	public void addMouseMotionListener(MouseMotionListener listener) {
		delegate.addMouseMotionListener(listener);
	}

	public void addNotify() {
		delegate.addNotify();
	}

	public void addPropertyChangeListener(String property, PropertyChangeListener listener) {
		delegate.addPropertyChangeListener(property, listener);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		delegate.addPropertyChangeListener(listener);
	}

	public IFigure findMouseEventTargetAt(int x, int y) {
		return delegate.findMouseEventTargetAt(x, y);
	}

	public Color getBackgroundColor() {
		return delegate.getBackgroundColor();
	}

	public boolean containsPoint(int x, int y) {
		return delegate.containsPoint(x, y);
	}

	public boolean equals(Object obj) {
		return delegate.equals(obj);
	}

	public void erase() {
		delegate.erase();
	}

	public IFigure findFigureAt(int x, int y, TreeSearch search) {
		return delegate.findFigureAt(x, y, search);
	}

	public Border getBorder() {
		return delegate.getBorder();
	}

	public Rectangle getBounds() {
		return delegate.getBounds();
	}

	public List getChildren() {
		return delegate.getChildren();
	}

	public Rectangle getClientArea(Rectangle rect) {
		return delegate.getClientArea(rect);
	}

	public IClippingStrategy getClippingStrategy() {
		return delegate.getClippingStrategy();
	}

	public Cursor getCursor() {
		return delegate.getCursor();
	}

	public Font getFont() {
		return delegate.getFont();
	}

	public Color getForegroundColor() {
		return delegate.getForegroundColor();
	}

	public Insets getInsets() {
		return delegate.getInsets();
	}

	public LayoutManager getLayoutManager() {
		return delegate.getLayoutManager();
	}

	public Color getLocalBackgroundColor() {
		return delegate.getLocalBackgroundColor();
	}

	public Color getLocalForegroundColor() {
		return delegate.getLocalForegroundColor();
	}

	public IFigure getParent() {
		return delegate.getParent();
	}

	public Image getIcon() {
		return delegate.getIcon();
	}

	public IFigure getToolTip() {
		return delegate.getToolTip();
	}

	public Image getIcon(int index) {
		return delegate.getIcon(index);
	}

	public UpdateManager getUpdateManager() {
		return delegate.getUpdateManager();
	}

	public void handleFocusGained(FocusEvent event) {
		delegate.handleFocusGained(event);
	}

	public void handleFocusLost(FocusEvent event) {
		delegate.handleFocusLost(event);
	}

	public int getIconAlignment() {
		return delegate.getIconAlignment();
	}

	public void handleKeyPressed(KeyEvent event) {
		delegate.handleKeyPressed(event);
	}

	public Rectangle getIconBounds() {
		return delegate.getIconBounds();
	}

	public void handleKeyReleased(KeyEvent event) {
		delegate.handleKeyReleased(event);
	}

	public void handleMouseDoubleClicked(MouseEvent event) {
		delegate.handleMouseDoubleClicked(event);
	}

	public int getIconTextGap() {
		return delegate.getIconTextGap();
	}

	public Dimension getMinimumSize(int w, int h) {
		return delegate.getMinimumSize(w, h);
	}

	public void handleMouseDragged(MouseEvent event) {
		delegate.handleMouseDragged(event);
	}

	public void handleMouseEntered(MouseEvent event) {
		delegate.handleMouseEntered(event);
	}

	public void handleMouseExited(MouseEvent event) {
		delegate.handleMouseExited(event);
	}

	public Dimension getPreferredSize(int wHint, int hHint) {
		return delegate.getPreferredSize(wHint, hHint);
	}

	public void handleMouseHover(MouseEvent event) {
		delegate.handleMouseHover(event);
	}

	public void handleMouseMoved(MouseEvent event) {
		delegate.handleMouseMoved(event);
	}

	public void handleMousePressed(MouseEvent event) {
		delegate.handleMousePressed(event);
	}

	public Dimension getMaximumSize() {
		return delegate.getMaximumSize();
	}

	public String getSubStringText() {
		return delegate.getSubStringText();
	}

	public void handleMouseReleased(MouseEvent event) {
		delegate.handleMouseReleased(event);
	}

	public boolean isCoordinateSystem() {
		return delegate.isCoordinateSystem();
	}

	public boolean isFocusTraversable() {
		return delegate.isFocusTraversable();
	}

	public boolean isOpaque() {
		return delegate.isOpaque();
	}

	public String getText() {
		return delegate.getText();
	}

	public int getTextAlignment() {
		return delegate.getTextAlignment();
	}

	public Rectangle getTextBounds() {
		return delegate.getTextBounds();
	}

	public int getTextPlacement() {
		return delegate.getTextPlacement();
	}

	public boolean hasFocus() {
		return delegate.hasFocus();
	}

	public int hashCode() {
		return delegate.hashCode();
	}

	public EventDispatcher internalGetEventDispatcher() {
		return delegate.internalGetEventDispatcher();
	}

	public boolean intersects(Rectangle rect) {
		return delegate.intersects(rect);
	}

	public void invalidateTree() {
		delegate.invalidateTree();
	}

	public boolean isEnabled() {
		return delegate.isEnabled();
	}

	public boolean isMirrored() {
		return delegate.isMirrored();
	}

	public boolean isRequestFocusEnabled() {
		return delegate.isRequestFocusEnabled();
	}

	public boolean isShowing() {
		return delegate.isShowing();
	}

	public boolean isVisible() {
		return delegate.isVisible();
	}

	public void paint(Graphics graphics) {
		delegate.paint(graphics);
	}

	public void remove(IFigure figure) {
		delegate.remove(figure);
	}

	public void invalidate() {
		delegate.invalidate();
	}

	public boolean isTextTruncated() {
		return delegate.isTextTruncated();
	}

	public void removeAll() {
		delegate.removeAll();
	}

	public void removeAncestorListener(AncestorListener listener) {
		delegate.removeAncestorListener(listener);
	}

	public void paintFigure(Graphics graphics) {
		delegate.paintFigure(graphics);
	}

	public void removeCoordinateListener(CoordinateListener listener) {
		delegate.removeCoordinateListener(listener);
	}

	public void removeFigureListener(FigureListener listener) {
		delegate.removeFigureListener(listener);
	}

	public void removeFocusListener(FocusListener listener) {
		delegate.removeFocusListener(listener);
	}

	public void removeKeyListener(KeyListener listener) {
		delegate.removeKeyListener(listener);
	}

	public void removeLayoutListener(LayoutListener listener) {
		delegate.removeLayoutListener(listener);
	}

	public void removeMouseListener(MouseListener listener) {
		delegate.removeMouseListener(listener);
	}

	public void removeMouseMotionListener(MouseMotionListener listener) {
		delegate.removeMouseMotionListener(listener);
	}

	public void removeNotify() {
		delegate.removeNotify();
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		delegate.removePropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(String property, PropertyChangeListener listener) {
		delegate.removePropertyChangeListener(property, listener);
	}

	public void repaint(int x, int y, int w, int h) {
		delegate.repaint(x, y, w, h);
	}

	public void repaint() {
		delegate.repaint();
	}

	public void revalidate() {
		delegate.revalidate();
	}

	public void setBackgroundColor(Color bg) {
		delegate.setBackgroundColor(bg);
	}

	public void setBorder(Border border) {
		delegate.setBorder(border);
	}

	public void setBounds(Rectangle rect) {
		delegate.setBounds(rect);
	}

	public void setIcon(Image image) {
		delegate.setIcon(image);
	}

	public void setIcon(Image image, int index) {
		delegate.setIcon(image, index);
	}

	public void setIconAlignment(int align) {
		delegate.setIconAlignment(align);
	}

	public void setConstraint(IFigure child, Object constraint) {
		delegate.setConstraint(child, constraint);
	}

	public void setClippingStrategy(IClippingStrategy clippingStrategy) {
		delegate.setClippingStrategy(clippingStrategy);
	}

	public void setCursor(Cursor cursor) {
		delegate.setCursor(cursor);
	}

	public void setLabelAlignment(int align) {
		delegate.setLabelAlignment(align);
	}

	public void setEnabled(boolean value) {
		delegate.setEnabled(value);
	}

	public void setFocusTraversable(boolean focusTraversable) {
		delegate.setFocusTraversable(focusTraversable);
	}

	public void setFont(Font f) {
		delegate.setFont(f);
	}

	public void setText(String s) {
		delegate.setText(s);
	}

	public void setForegroundColor(Color fg) {
		delegate.setForegroundColor(fg);
	}

	public void setTextAlignment(int align) {
		delegate.setTextAlignment(align);
	}

	public void setLayoutManager(LayoutManager manager) {
		delegate.setLayoutManager(manager);
	}

	public void setLocation(Point p) {
		delegate.setLocation(p);
	}

	public void setTextPlacement(int where) {
		delegate.setTextPlacement(where);
	}

	public void setMaximumSize(Dimension d) {
		delegate.setMaximumSize(d);
	}

	public void setMinimumSize(Dimension d) {
		delegate.setMinimumSize(d);
	}

	public void setOpaque(boolean opaque) {
		delegate.setOpaque(opaque);
	}

	public void setTextUnderline(boolean b) {
		delegate.setTextUnderline(b);
	}

	public void setParent(IFigure p) {
		delegate.setParent(p);
	}

	public boolean isTextUnderlined() {
		return delegate.isTextUnderlined();
	}

	public void setPreferredSize(Dimension size) {
		delegate.setPreferredSize(size);
	}

	public void setTextStrikeThrough(boolean b) {
		delegate.setTextStrikeThrough(b);
	}

	public boolean isTextStrikedThrough() {
		return delegate.isTextStrikedThrough();
	}

	public void setRequestFocusEnabled(boolean requestFocusEnabled) {
		delegate.setRequestFocusEnabled(requestFocusEnabled);
	}

	public void setTextWrap(boolean b) {
		delegate.setTextWrap(b);
	}

	public void setSize(int w, int h) {
		delegate.setSize(w, h);
	}

	public boolean isTextWrapped() {
		return delegate.isTextWrapped();
	}

	public void setTextWrapWidth(int i) {
		delegate.setTextWrapWidth(i);
	}

	public void setToolTip(IFigure f) {
		delegate.setToolTip(f);
	}

	public void setValid(boolean value) {
		delegate.setValid(value);
	}

	public void setTextWrapAlignment(int i) {
		delegate.setTextWrapAlignment(i);
	}

	public void setVisible(boolean visible) {
		delegate.setVisible(visible);
	}

	public int getTextWrapAlignment() {
		return delegate.getTextWrapAlignment();
	}

	public boolean isSelected() {
		return delegate.isSelected();
	}

	public String toString() {
		return delegate.toString();
	}

	public void translateFromParent(Translatable t) {
		delegate.translateFromParent(t);
	}

	public void translateToParent(Translatable t) {
		delegate.translateToParent(t);
	}

	public void validate() {
		delegate.validate();
	}

	public void setSelected(boolean b) {
		delegate.setSelected(b);
	}

	public void setFocus(boolean b) {
		delegate.setFocus(b);
	}

	public int getLabelAlignment2() {
		return delegate.getLabelAlignment2();
	}
}

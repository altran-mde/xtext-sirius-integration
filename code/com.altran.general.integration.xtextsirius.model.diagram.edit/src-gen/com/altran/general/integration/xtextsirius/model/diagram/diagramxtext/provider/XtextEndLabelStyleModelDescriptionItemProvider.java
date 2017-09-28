/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.diagram.description.style.provider.EndLabelStyleDescriptionItemProvider;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * This is the item provider adapter for a
 * {@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextEndLabelStyleModelDescription}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XtextEndLabelStyleModelDescriptionItemProvider
		extends EndLabelStyleDescriptionItemProvider
		implements
		IItemStyledLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextEndLabelStyleModelDescriptionItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
		if (this.itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInjectorIdPropertyDescriptor(object);
			addMultiLinePropertyDescriptor(object);
			addEditableFeaturesPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Injector Id feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addInjectorIdPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IXtextDescription_injectorId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IXtextDescription_injectorId_feature",
								"_UI_IXtextDescription_type"),
						XtextsiriusPackage.Literals.IXTEXT_DESCRIPTION__INJECTOR_ID,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Multi Line feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addMultiLinePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IXtextDirectEditDescription_multiLine_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IXtextDirectEditDescription_multiLine_feature",
						"_UI_IXtextDirectEditDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Editable Features feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEditableFeaturesPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IXtextDirectEditModelDescription_editableFeatures_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IXtextDirectEditModelDescription_editableFeatures_feature",
								"_UI_IXtextDirectEditModelDescription_type"),
						DiagramxtextPackage.Literals.IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This returns XtextEndLabelStyleModelDescription.gif. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextEndLabelStyleModelDescription"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		return ((StyledString) getStyledText(object)).getString();
	}

	/**
	 * This returns the label styled text for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getStyledText(final Object object) {
		final XtextEndLabelStyleModelDescription xtextEndLabelStyleModelDescription = (XtextEndLabelStyleModelDescription) object;
		return new StyledString(getString("_UI_XtextEndLabelStyleModelDescription_type"),
				StyledString.Style.QUALIFIER_STYLER).append(" ")
						.append(Integer.toString(xtextEndLabelStyleModelDescription.getLabelSize()));
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(XtextEndLabelStyleModelDescription.class)) {
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__INJECTOR_ID:
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__MULTI_LINE:
			case DiagramxtextPackage.XTEXT_END_LABEL_STYLE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
	}

}

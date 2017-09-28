/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension;

/**
 * This is the item provider adapter for a
 * {@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextRepresentationExtension}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XtextRepresentationExtensionItemProvider
		extends ItemProviderAdapter
		implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemStyledLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextRepresentationExtensionItemProvider(final AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addViewpointURIPropertyDescriptor(object);
			addRepresentationNamePropertyDescriptor(object);
			addMetamodelPropertyDescriptor(object);
			addLalalaPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RepresentationExtensionDescription_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RepresentationExtensionDescription_name_feature",
						"_UI_RepresentationExtensionDescription_type"),
				DescriptionPackage.Literals.REPRESENTATION_EXTENSION_DESCRIPTION__NAME,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_GeneralPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Viewpoint URI feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addViewpointURIPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepresentationExtensionDescription_viewpointURI_feature"),
						getString("_UI_RepresentationExtensionDescription_viewpointURI_description"),
						DescriptionPackage.Literals.REPRESENTATION_EXTENSION_DESCRIPTION__VIEWPOINT_URI,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_GeneralPropertyCategory"),
						null));
	}

	/**
	 * This adds a property descriptor for the Representation Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addRepresentationNamePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepresentationExtensionDescription_representationName_feature"),
						getString("_UI_RepresentationExtensionDescription_representationName_description"),
						DescriptionPackage.Literals.REPRESENTATION_EXTENSION_DESCRIPTION__REPRESENTATION_NAME,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_GeneralPropertyCategory"),
						null));
	}

	/**
	 * This adds a property descriptor for the Metamodel feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addMetamodelPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepresentationExtensionDescription_metamodel_feature"),
						getString("_UI_RepresentationExtensionDescription_metamodel_description"),
						DescriptionPackage.Literals.REPRESENTATION_EXTENSION_DESCRIPTION__METAMODEL,
						true,
						false,
						true,
						null,
						getString("_UI_AdvancedPropertyCategory"),
						null));
	}

	/**
	 * This adds a property descriptor for the Lalala feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addLalalaPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_XtextRepresentationExtension_lalala_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_XtextRepresentationExtension_lalala_feature",
						"_UI_XtextRepresentationExtension_type"),
				ViewpointxtextPackage.Literals.XTEXT_REPRESENTATION_EXTENSION__LALALA,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This returns XtextRepresentationExtension.gif. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextRepresentationExtension"));
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
		final String label = ((XtextRepresentationExtension) object).getName();
		final StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_XtextRepresentationExtension_type"), StyledString.Style.QUALIFIER_STYLER);
		} else {
			styledLabel.append(getString("_UI_XtextRepresentationExtension_type"), StyledString.Style.QUALIFIER_STYLER)
					.append(" " + label);
		}
		return styledLabel;
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

		switch (notification.getFeatureID(XtextRepresentationExtension.class)) {
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__NAME:
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__VIEWPOINT_URI:
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__REPRESENTATION_NAME:
			case ViewpointxtextPackage.XTEXT_REPRESENTATION_EXTENSION__LALALA:
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

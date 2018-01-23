/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.sirius.properties.provider.TextDescriptionItemProvider;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * This is the item provider adapter for a
 * {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XtextSingleLineModelDescriptionItemProvider extends TextDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextSingleLineModelDescriptionItemProvider(final AdapterFactory adapterFactory) {
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
	 * This adds a property descriptor for the Editable Features feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEditableFeaturesPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IXtextModelDescription_editableFeatures_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IXtextModelDescription_editableFeatures_feature",
						"_UI_IXtextModelDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This returns XtextSingleLineModelDescription.gif. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextSingleLineModelDescription"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
	public String getText(final Object object) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
		final String label = ((XtextSingleLineModelDescription) object).getInjectorId();
=======
	public String getText(Object object) {
		String label = ((XtextSingleLineModelDescription) object).getIdentifier();
>>>>>>> preliminary fix for using guava v16
=======
	public String getText(final Object object) {
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
		final String label = ((XtextSingleLineModelDescription) object).getIdentifier();
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		final String label = ((XtextSingleLineModelDescription) object).getInjectorId();
>>>>>>> updated to Oxygen.2
=======
		final String label = ((XtextSingleLineModelDescription) object).getIdentifier();
>>>>>>> fixed invalid import in generated files
		return label == null || label.length() == 0 ? getString("_UI_XtextSingleLineModelDescription_type")
				: getString("_UI_XtextSingleLineModelDescription_type") + " " + label;
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

		switch (notification.getFeatureID(XtextSingleLineModelDescription.class)) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__INJECTOR_ID:
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_MODEL_DESCRIPTION__EDITABLE_FEATURES:
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
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
=======
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;
=======
=======
>>>>>>> fixed invalid import in generated files
	public String getCreateChildText(final Object owner, final Object feature, final Object child,
			final Collection<?> selection) {
		final Object childFeature = feature;
		final Object childObject = child;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> fixed invalid import in generated files

		final boolean qualify = childFeature == PropertiesPackage.Literals.TEXT_DESCRIPTION__INITIAL_OPERATION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> preliminary fix for using guava v16
=======
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
	}

}

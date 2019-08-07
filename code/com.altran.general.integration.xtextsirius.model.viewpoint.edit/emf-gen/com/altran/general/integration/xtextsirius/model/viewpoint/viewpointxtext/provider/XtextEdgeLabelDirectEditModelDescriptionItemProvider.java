/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.provider.XtextDirectEditModelDescriptionItemProvider;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;

/**
 * This is the item provider adapter for a
 * {@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XtextEdgeLabelDirectEditModelDescriptionItemProvider extends XtextDirectEditModelDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextEdgeLabelDirectEditModelDescriptionItemProvider(final AdapterFactory adapterFactory) {
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
			
			addEdgeLabelMappingsPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Edge Label Mappings feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEdgeLabelMappingsPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IXtextEdgeLabelDirectEditDescription_edgeLabelMappings_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IXtextEdgeLabelDirectEditDescription_edgeLabelMappings_feature",
								"_UI_IXtextEdgeLabelDirectEditDescription_type"),
						ViewpointxtextPackage.Literals.IXTEXT_EDGE_LABEL_DIRECT_EDIT_DESCRIPTION__EDGE_LABEL_MAPPINGS,
						true,
						false,
						true,
						null,
						null,
						null));
	}
	
	/**
	 * This returns XtextEdgeLabelDirectEditModelDescription.gif. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/XtextEdgeLabelDirectEditModelDescription"));
	}
	
	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((XtextEdgeLabelDirectEditModelDescription) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_XtextEdgeLabelDirectEditModelDescription_type")
				: getString("_UI_XtextEdgeLabelDirectEditModelDescription_type") + " " + label;
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
	
}

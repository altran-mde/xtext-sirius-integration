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

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.provider.DiagramxtextEditPlugin;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.provider.XtextsiriusEditPlugin;

/**
 * This is the central singleton for the Viewpoint-xtext edit plugin. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public final class ViewpointxtextEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	public static final ViewpointxtextEditPlugin INSTANCE = new ViewpointxtextEditPlugin();
	
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	private static Implementation plugin;
	
	/**
	 * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ViewpointxtextEditPlugin() {
		super(new ResourceLocator[] {
				DiagramUIPlugin.INSTANCE,
				DiagramxtextEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
				SiriusEditPlugin.INSTANCE,
				XtextsiriusEditPlugin.INSTANCE,
		});
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public Implementation() {
			super();
			
			// Remember the static instance.
			//
			plugin = this;
		}
	}
	
}

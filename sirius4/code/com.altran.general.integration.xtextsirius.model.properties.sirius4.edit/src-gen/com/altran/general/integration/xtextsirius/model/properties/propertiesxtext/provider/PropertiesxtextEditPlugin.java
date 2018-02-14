/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.sirius.properties.provider.PropertiesEditPlugin;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.provider.XtextsiriusEditPlugin;

/**
 * This is the central singleton for the Properties-xtext edit plugin. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public final class PropertiesxtextEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	public static final PropertiesxtextEditPlugin INSTANCE = new PropertiesxtextEditPlugin();

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesxtextEditPlugin() {
<<<<<<< b7f31d8da2d0f8863339344fb2e4db4be675bd51
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
		super(new ResourceLocator[] {
				PropertiesEditPlugin.INSTANCE,
				XtextsiriusEditPlugin.INSTANCE,
				SiriusEditPlugin.INSTANCE,
		});
=======
		super(new ResourceLocator[] { PropertiesEditPlugin.INSTANCE, XtextsiriusEditPlugin.INSTANCE,
				SiriusEditPlugin.INSTANCE, });
>>>>>>> preliminary fix for using guava v16
=======
		super(new ResourceLocator[] {
				XtextsiriusEditPlugin.INSTANCE,
		});
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		super(new ResourceLocator[] { PropertiesEditPlugin.INSTANCE, XtextsiriusEditPlugin.INSTANCE,
				SiriusEditPlugin.INSTANCE, });
>>>>>>> intermediate commit: non-working start of delegate implmenetation
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
		 * Creates an instance.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

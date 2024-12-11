/*
 * generated by Xtext 2.14.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.edit.ide

import com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEditRuntimeModule
import com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEditStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RefLangEditIdeSetup extends RefLangEditStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RefLangEditRuntimeModule, new RefLangEditIdeModule))
	}
	
}
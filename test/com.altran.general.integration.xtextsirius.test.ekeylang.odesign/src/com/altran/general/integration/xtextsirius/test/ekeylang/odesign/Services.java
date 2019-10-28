package com.altran.general.integration.xtextsirius.test.ekeylang.odesign;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * The services class used by VSM.
 */
public class Services {
	
	/**
	 * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
	 */
	public URI uri(final EObject self) {
		return EcoreUtil.getURI(self);
	}
}

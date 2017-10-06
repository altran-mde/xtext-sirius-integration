package com.altran.general.integration.xtextsirius.runtime.converter.sirius4.ui;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ui.properties.api.AbstractDescriptionConverter;
import org.eclipse.sirius.ui.properties.api.DescriptionCache;

import com.altran.general.integration.xtextsirius.runtime.converter.ICompatibleDescriptionConverter;

public abstract class AbstractDescriptionConverter4 extends AbstractDescriptionConverter {
	
	private final ICompatibleDescriptionConverter delegate;
	
	public AbstractDescriptionConverter4(final ICompatibleDescriptionConverter delegate) {
		super();
		this.delegate = delegate;
	}
	
	@Override
	public boolean canHandle(final EObject description) {
		return this.delegate.canHandle(description);
	}
	
	@Override
	public EObject convert(final EObject description, final Map<String, Object> parameters,
			final DescriptionCache cache) {
		return this.delegate.convert(
				description,
				parameters,
				(input, output) -> cache.put(input, output),
				idEl -> idEl.getIdentifier(),
				initOp -> getExpressionForOperation(initOp));
	}
	
}

package com.altran.general.integration.xtextsirius.runtime.converter.sirius5;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.core.api.AbstractDescriptionConverter;
import org.eclipse.sirius.properties.core.api.TransformationCache;

import com.altran.general.integration.xtextsirius.runtime.converter.ICompatibleDescriptionConverter;

public abstract class AbstractDescriptionConverter5 extends AbstractDescriptionConverter {

	private final ICompatibleDescriptionConverter delegate;

	public AbstractDescriptionConverter5(final ICompatibleDescriptionConverter delegate) {
		super();
		this.delegate = delegate;
	}

	@Override
	public boolean canHandle(final EObject description) {
		return this.delegate.canHandle(description);
	}

	@Override
	public EObject convert(final EObject description, final Map<String, Object> parameters,
			final TransformationCache cache) {
		return this.delegate.convert(
				description,
				parameters,
				(input, output) -> cache.put(input, output),
				idEl -> idEl.getName(),
				initOp -> getExpressionForOperation(initOp));
	}

}

package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.google.inject.Injector;

public class XtextSiriusValueDescriptor extends AXtextSiriusDescriptor {

	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;
//	private final EStructuralFeature valueFeature;

	public XtextSiriusValueDescriptor(final @NonNull Injector injector, final boolean multiLine, final @NonNull String prefixText, final @NonNull String suffixText/*, final @NonNull EStructuralFeature valueFeature*/) {
		super(injector, multiLine);
		this.prefixTextExpression = prefixText;
		this.suffixTextExpression = suffixText;
//		this.valueFeature = valueFeature;
	}
	
	public XtextSiriusValueDescriptor(final @NonNull Injector injector, final @NonNull IXtextDirectEditValueDescription description) {
		super(injector, description);
		this.prefixTextExpression = description.getPrefixTextExpression();
		this.suffixTextExpression = description.getSuffixTextExpression();
//		this.valueFeature = description.
	}

	public @NonNull String getPrefixTextExpression() {
		return prefixTextExpression;
	}

	public @NonNull String getSuffixTextExpression() {
		return suffixTextExpression;
	}

//	public @NonNull EStructuralFeature getValueFeature() {
//		return valueFeature;
//	}

}

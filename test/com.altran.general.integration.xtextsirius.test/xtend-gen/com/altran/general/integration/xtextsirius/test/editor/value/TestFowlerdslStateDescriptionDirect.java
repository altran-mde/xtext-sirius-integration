package com.altran.general.integration.xtextsirius.test.editor.value;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.test.editor.value.TestFowlerdslStateDescription;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TestFowlerdslStateDescriptionDirect extends TestFowlerdslStateDescription {
  @Override
  public ModelEntryPoint createModelEntryPoint(final EObject container) {
    String _featureName = this.getFeatureName();
    return new ModelEntryPoint(container, _featureName);
  }
}

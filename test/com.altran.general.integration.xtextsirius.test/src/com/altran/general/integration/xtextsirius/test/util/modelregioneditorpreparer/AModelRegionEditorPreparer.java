/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.ARegion;
import com.google.inject.Injector;

@SuppressWarnings({ "restriction" })
public abstract class AModelRegionEditorPreparer extends ARegion {
	protected class XtextSiriusModelDescriptorAdapter implements IXtextSiriusModelDescriptor {
		@Override
		public boolean isMultiLine() {
			return false;
		}
		
		@Override
		public @NonNull String getSuffixTerminalsExpression() {
			return "";
		}
		
		@Override
		public @NonNull Set<@NonNull String> getSelectedFeatures() {
			return Collections.emptySet();
		}
		
		@Override
		public @NonNull String getPrefixTerminalsExpression() {
			return "";
		}
		
		@Override
		public @NonNull Set<@NonNull String> getIgnoredNestedFeatures() {
			return Collections.emptySet();
		}
		
		@Override
		public @NonNull Set<@NonNull String> getEditableFeatures() {
			return Collections.emptySet();
		}
		
		@Override
		public @NonNull Injector getInjector() {
			return AModelRegionEditorPreparer.this.getInjector();
		}
		
		@Override
		public boolean isCancelOnValidationError() {
			return false;
		}
	}
	
	protected IXtextSiriusModelDescriptor descriptor() {
		return new XtextSiriusModelDescriptorAdapter();
	}
	
	protected AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter multilineDescriptor() {
		return new AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter() {
			@Override
			public boolean isMultiLine() {
				return true;
			}
		};
	}
	
	protected AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter multilineEditableFeatureDescriptor(
			final Set<String> editableFeaturesSet) {
		return new AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter() {
			@Override
			public boolean isMultiLine() {
				return true;
			}
			
			@Override
			public Set<String> getEditableFeatures() {
				return editableFeaturesSet;
			}
		};
	}
	
	protected AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter multilineSelectedFeatureDescriptor(
			final Set<String> selectedFeaturesSet) {
		return new AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter() {
			@Override
			public boolean isMultiLine() {
				return true;
			}
			
			@Override
			public Set<String> getSelectedFeatures() {
				return selectedFeaturesSet;
			}
		};
	}
	
	protected AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter editableFeatureDescriptor(
			final Set<String> editableFeaturesSet) {
		return new AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter() {
			@Override
			public Set<String> getEditableFeatures() {
				return editableFeaturesSet;
			}
		};
	}
	
	protected AccessibleModelRegionEditorPreparer getFakePreparer() {
		return new AccessibleModelRegionEditorPreparer(new XtextSiriusModelDescriptorAdapter(),
				AFowlerdslDefaultModelTest.statemachineFactory.createEvent());
	}
	
	protected String resolveRegion(final ITextRegionAccess rootRegion, final TextRegion region) {
		return rootRegion.regionForDocument().getText().substring(region.getOffset(),
				region.getOffset() + region.getLength());
	}
	
	
	protected ModelRegionEditorPreparer createPreparer(final IXtextSiriusModelDescriptor descriptor,
			final EObject semanticElement) {
		return new ModelRegionEditorPreparer(descriptor,
				new MinimalModelAdjuster().adjust(new ModelEntryPoint(semanticElement)));
	}
}

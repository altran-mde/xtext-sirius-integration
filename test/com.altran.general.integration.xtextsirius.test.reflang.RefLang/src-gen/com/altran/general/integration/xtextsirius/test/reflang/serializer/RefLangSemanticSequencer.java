/*
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.serializer;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Leaf;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference3;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.SubContainer;
import com.altran.general.integration.xtextsirius.test.reflang.services.RefLangGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RefLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RefLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RefLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RefLangPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case RefLangPackage.LEAF:
				sequence_Leaf_References_References2_References3(context, (Leaf) semanticObject); 
				return; 
			case RefLangPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case RefLangPackage.REFERENCE3:
				sequence_Reference3(context, (Reference3) semanticObject); 
				return; 
			case RefLangPackage.SUB_CONTAINER:
				sequence_References_References2_References3_SubContainer(context, (SubContainer) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     contents+=IContainerContent+
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IContainerContent returns Leaf
	 *     Leaf returns Leaf
	 *
	 * Constraint:
	 *     (name=ID references+=Reference* references2+=Reference* references3+=Reference3*)
	 */
	protected void sequence_Leaf_References_References2_References3(ISerializationContext context, Leaf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Reference3 returns Reference3
	 *
	 * Constraint:
	 *     target3=[IContainerContent|QID]
	 */
	protected void sequence_Reference3(ISerializationContext context, Reference3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RefLangPackage.Literals.REFERENCE3__TARGET3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RefLangPackage.Literals.REFERENCE3__TARGET3));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReference3Access().getTarget3IContainerContentQIDParserRuleCall_1_0_1(), semanticObject.eGet(RefLangPackage.Literals.REFERENCE3__TARGET3, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (target=[IContainerContent|QID] target2=[IContainerContent|QID]?)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IContainerContent returns SubContainer
	 *     SubContainer returns SubContainer
	 *
	 * Constraint:
	 *     (name=ID subContents+=IContainerContent* references+=Reference* references2+=Reference* references3+=Reference3*)
	 */
	protected void sequence_References_References2_References3_SubContainer(ISerializationContext context, SubContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

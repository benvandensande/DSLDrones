/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class MyLanguageProposalProvider extends AbstractMyLanguageProposalProvider {
	
	override void complete_PositiveDouble(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("0","Natural number" , null, context))
	}
	
	override void complete_DOUBLE(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("0.0","DOUBLE" , null, context))
	}
	
	override void complete_METER(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("meter(0)","m" , null, context))
	}
	
	override void complete_CENTIMETER(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("centimeter(0)","cm" , null, context))
	}
	
	override void complete_MILLIMETER(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("millimeter(0)","mm" , null, context))
	}
	
	override void complete_KILOMETER(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("kilometer(0)","km" , null, context))
	}
	
	override void complete_MISSIONSTATUS(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("ACTIVE","active" , null, context))
		acceptor.accept(createCompletionProposal("UNACTIVE","unactive" , null, context))
		acceptor.accept(createCompletionProposal("PAUSED","paused" , null, context))
	}
	
	override void complete_COLLISIONRISKLEVEL(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("SAFE","Safe" , null, context))
		acceptor.accept(createCompletionProposal("WARNING","Warning" , null, context))
		acceptor.accept(createCompletionProposal("CRITICAL","Critical" , null, context))
	}
	
	override void complete_MISSIONRISKLEVEL(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("SAFE","Safe" , null, context))
		acceptor.accept(createCompletionProposal("UNSAFE","Unsafe" , null, context))
	}
	
	
	override void complete_NotificationSent(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("Notification status is sent","Notification" , null, context))
	}
	
	override void complete_DistanceToLocationSent(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("0 0 0","Location" , null, context))
	}
	
	override void complete_COMPSTATUS(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("ACTIVE","active" , null, context))
		acceptor.accept(createCompletionProposal("FAILING","failing" , null, context))
		acceptor.accept(createCompletionProposal("REDUNDANT","redundant" , null, context))
	}
}
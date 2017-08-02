/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.xtext.example.mydsl.ui.contentassist.AbstractMyLanguageProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class MyLanguageProposalProvider extends AbstractMyLanguageProposalProvider {
  @Override
  public void complete_PositiveDouble(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("0", "Natural number", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_DOUBLE(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("0.0", "DOUBLE", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_METER(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("meter(0)", "m", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_CENTIMETER(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("centimeter(0)", "cm", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_MILLIMETER(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("millimeter(0)", "mm", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_KILOMETER(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("kilometer(0)", "km", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_MISSIONSTATUS(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("ACTIVE", "active", null, context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("UNACTIVE", "unactive", null, context);
    acceptor.accept(_createCompletionProposal_1);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("PAUSED", "paused", null, context);
    acceptor.accept(_createCompletionProposal_2);
  }
  
  @Override
  public void complete_COLLISIONRISKLEVEL(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("SAFE", "Safe", null, context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("WARNING", "Warning", null, context);
    acceptor.accept(_createCompletionProposal_1);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("CRITICAL", "Critical", null, context);
    acceptor.accept(_createCompletionProposal_2);
  }
  
  @Override
  public void complete_MISSIONRISKLEVEL(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("SAFE", "Safe", null, context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("UNSAFE", "Unsafe", null, context);
    acceptor.accept(_createCompletionProposal_1);
  }
  
  @Override
  public void complete_NotificationSent(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("Notification status is sent", "Notification", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_DistanceToLocationSent(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("0 0 0", "Location", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_COMPSTATUS(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("ACTIVE", "active", null, context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("FAILING", "failing", null, context);
    acceptor.accept(_createCompletionProposal_1);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("REDUNDANT", "redundant", null, context);
    acceptor.accept(_createCompletionProposal_2);
  }
}

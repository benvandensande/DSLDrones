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
  public void complete_DOUBLE(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("0.0", "DOUBLE", null, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_DistanceUnit(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("kilometer", "km", null, context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("meter", "m", null, context);
    acceptor.accept(_createCompletionProposal_1);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("centimeter", "cm", null, context);
    acceptor.accept(_createCompletionProposal_2);
    ICompletionProposal _createCompletionProposal_3 = this.createCompletionProposal("millimeter", "mm", null, context);
    acceptor.accept(_createCompletionProposal_3);
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
  public void complete_COMPONENT(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("motor", "Component - motor", null, context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("sonar", "Component - sonar", null, context);
    acceptor.accept(_createCompletionProposal_1);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("barometer", "Component - barometer", null, context);
    acceptor.accept(_createCompletionProposal_2);
    ICompletionProposal _createCompletionProposal_3 = this.createCompletionProposal("GPS", "Component - GPS", null, context);
    acceptor.accept(_createCompletionProposal_3);
    ICompletionProposal _createCompletionProposal_4 = this.createCompletionProposal("scanner", "Component - scanner", null, context);
    acceptor.accept(_createCompletionProposal_4);
    ICompletionProposal _createCompletionProposal_5 = this.createCompletionProposal("battery", "Component - battery", null, context);
    acceptor.accept(_createCompletionProposal_5);
    ICompletionProposal _createCompletionProposal_6 = this.createCompletionProposal("camera", "Component - camera", null, context);
    acceptor.accept(_createCompletionProposal_6);
    ICompletionProposal _createCompletionProposal_7 = this.createCompletionProposal("autopilot", "Component - autopilot", null, context);
    acceptor.accept(_createCompletionProposal_7);
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
}
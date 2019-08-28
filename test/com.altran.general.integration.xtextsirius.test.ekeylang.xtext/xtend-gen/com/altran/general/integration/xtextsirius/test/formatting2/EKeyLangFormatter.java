/**
 * generated by Xtext 2.18.0.M3
 */
package com.altran.general.integration.xtextsirius.test.formatting2;

import com.altran.general.integration.xtextsirius.test.EKeyLang.Container;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Group;
import com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.services.EKeyLangGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EKeyLangFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private EKeyLangGrammarAccess _eKeyLangGrammarAccess;
  
  protected void _format(final Container container, @Extension final IFormattableDocument document) {
    EList<IContainerContent> _contents = container.getContents();
    for (final IContainerContent iContainerContent : _contents) {
      document.<IContainerContent>format(iContainerContent);
    }
  }
  
  protected void _format(final Group group, @Extension final IFormattableDocument document) {
    EList<IContainerContent> _leafs = group.getLeafs();
    for (final IContainerContent leaf : _leafs) {
      document.<IContainerContent>format(leaf);
    }
  }
  
  public void format(final Object group, final IFormattableDocument document) {
    if (group instanceof Group) {
      _format((Group)group, document);
      return;
    } else if (group instanceof XtextResource) {
      _format((XtextResource)group, document);
      return;
    } else if (group instanceof Container) {
      _format((Container)group, document);
      return;
    } else if (group instanceof EObject) {
      _format((EObject)group, document);
      return;
    } else if (group == null) {
      _format((Void)null, document);
      return;
    } else if (group != null) {
      _format(group, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(group, document).toString());
    }
  }
}

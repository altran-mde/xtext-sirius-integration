/**
 * generated by Xtext 2.12.0
 */
package nl.altran.example.xtext.html;

import nl.altran.example.xtext.html.HtmlLangStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class HtmlLangStandaloneSetup extends HtmlLangStandaloneSetupGenerated {
  public static void doSetup() {
    new HtmlLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
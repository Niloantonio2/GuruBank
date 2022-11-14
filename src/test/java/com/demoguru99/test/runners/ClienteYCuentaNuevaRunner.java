package com.demoguru99.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**Esta clase es donde se ejecuta todo, Conecta el feature con el Step definitions**/
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ClienteYCuentaNueva.feature",
        glue = "com.demoguru99.test.stepsdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class ClienteYCuentaNuevaRunner {
}

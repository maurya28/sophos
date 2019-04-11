package co.com.google.qa.miprimerserenity.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)// runwith indica quien va correr el test   
@CucumberOptions( features="src/test/resources/features",
        glue = { "co.com.google.qa.miprimerserenity.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class MiPrimerSerenityRunner {

}

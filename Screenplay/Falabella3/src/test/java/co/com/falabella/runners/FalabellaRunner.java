package co.com.falabella.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = {
		"co.com.falabella.stepsdefinitions" }, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
				"html:target/cucumber", "json:target/cucumber/cucumber.json" })

public class FalabellaRunner {

}

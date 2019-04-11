package co.com.google.qa.miprimerserenity.stepsdefinitions;

import co.com.google.qa.miprimerserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MiPrimerSerenityStepDefinitions {

	@Steps
	EndUserStep user;

	@Given("^El usuario esta en el sitio de google$")
	public void elUsuarioEstaEnElSitioDeGoogle() {
		// Write code here that turns the phrase above into concrete actions
		user.isTheHomePage();
	}

	@When("^Busca la palabra \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void buscaLaPalabraCompuesta(String palabra1, String palabra2) {
		// Write code here that turns the phrase above into concrete actions
		user.looksFor(palabra1 + " " + palabra2);
	}

	@Then("^Verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void verificaQueLaPalabraEsteEnLosResultados(String arg1) {
		// Write code here that turns the phrase above into concrete actions

	}
}

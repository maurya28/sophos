package co.com.google.qa.miprimerserenity.stepsdefinitions;

import co.com.google.qa.miprimerserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MiPrimerSerenityStepDefinition {
	
	@Steps
	EndUserStep user;
	
	@Given("^El usuario esta en el sitio de google$")
	public void elUsuarioEstaEnElSitioDeGoogle() {
	    // Write code here that turns the phrase above into concrete actions		
	    user.is_the_home_page();
	}

	@When("^Busca la palabra \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void buscaLaPalabraCompuesta(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
		user.looks_for(arg1+" "+arg2);
	    
	}

	@Then("^Verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void verificaQueLaPalabraEsteEnLosResultados(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}

package co.com.google.qa.miprimerscreenplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.WebDriver;

import co.com.google.qa.miprimerscreenplay.questions.ThePhrase;
import co.com.google.qa.miprimerscreenplay.tasks.LookUpPhrase;
import co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class MiPrimerScreenplayStepDefinitions {
	public static final int CURRENT_PHRASE = 0;
	GoogleHomePage googleHomePage;

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor usuario = Actor.named("Joseph");

	@Before
	public void actorCanBrowseTheWeb() {
		usuario.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^el usuario esta en el sitio de google$")
	public void elUsuarioEstaEnElSitioDeGoogle() {
		// Write code here that turns the phrase above into concrete actions
		usuario.wasAbleTo(Open.browserOn().the(googleHomePage));
	}

	@When("^Busca la palabra \"([^\"]*)\"$")
	public void buscaLaPalabra(String palabra) {
		// Write code here that turns the phrase above into concrete actions
		usuario.attemptsTo(LookUpPhrase.composedOfTheWords(palabra));
	}

	@Then("^Verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void verificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado) {
		// Write code here that turns the phrase above into concrete actions
		usuario.should(seeThat(ThePhrase.searched(), is(resultadoEsperado)));
	}

}

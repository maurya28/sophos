package co.com.google.qa.miprimerscreenplay.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import static org.hamcrest.core.Is.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.google.qa.miprimerscreenplay.questions.ThePhrase;
import co.com.google.qa.miprimerscreenplay.tasks.LookUpPhrase;
import co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage;
import co.com.google.qa.miprimerscreenplay.exceptions.PhraseNotFound;
import co.com.google.qa.miprimerscreenplay.models.Phrase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
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

	@When("^el busca la frase compuesta$")
	public void elBuscaLaFraseCompuesta(List<Phrase> phrases) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		usuario.attemptsTo(LookUpPhrase.composedOfTheWords(phrases.get(CURRENT_PHRASE)));

	}
	
	

	@Then("^Verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void verificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado) {
		// Write code here that turns the phrase above into concrete actions
		usuario.should(seeThat(ThePhrase.searched(), is(resultadoEsperado)).orComplainWith(PhraseNotFound.class, PhraseNotFound.PHARSE_NOT_FOUND));
	}

}

package co.com.falabella.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.falabella.exceptions.NameNotFound;
import co.com.falabella.exceptions.QuantityNotFound;
import co.com.falabella.models.Product;
import co.com.falabella.tasks.AddProduct;
import co.com.falabella.tasks.SearchProduct;
import co.com.falabella.tasks.SelectProduct;
import co.com.falabella.tasks.TheSelectedProduct;
import co.com.falabella.userinterfaces.FalabellaHomePage;
import co.com.falabella.userinterfaces.FalabellaResultPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;


public class FalabellaStepDefinitions {

	public static final int CURRENT_PRODUCT = 0;
	FalabellaHomePage falabellaHomePage;
	FalabellaResultPage falabellaResultPage;

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor user = Actor.named("Mariana");

	@Before
	public void actorCanBrowseTheWeb() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^User is in the falabellas site$")
	public void userIsInTheFalabellasSite() {
		// Write code here that turns the phrase above into concrete actions
		user.wasAbleTo(Open.browserOn().the(falabellaHomePage));
	}

	@When("^The user searches the product$")
	public void theUserSearchesTheProduct(List<Product> product) {
		
		user.attemptsTo(SearchProduct.InFalabella(product.get(CURRENT_PRODUCT)));
	}

	@When("^selects the product$")
	public void selectsTheProduct() {
		user.attemptsTo(SelectProduct.InFalabellaResultPage());
	}

	@When("^add the product to the shopping cart$")
	public void addTheProductToTheShoppingCart() {
		// Write code here that turns the phrase above into concrete actions
		user.attemptsTo(AddProduct.ToShoppingCart());
	}

	@Then("^The user verifies that the product of the shopping cart is the same one that was selected$")
	public void theUserVerifiesThatTheProductOfTheShoppingCartIsTheSameOneThatWasSelected(List<String> product) {
		// Write code here that turns the phrase above into concrete actions
		user.should(seeThat(TheSelectedProduct.InTheShoppingCart(), containsString(product.get(0))).orComplainWith(NameNotFound.class, NameNotFound.NAME_NOT_FOUND));
		user.should(seeThat(TheSelectedquantity.InTheShoppingCart(), containsString(product.get(1))).orComplainWith(QuantityNotFound.class, QuantityNotFound.QUANTITY_NOT_FOUND));
	}

}

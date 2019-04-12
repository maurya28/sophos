package co.com.falabella.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static co.com.falabella.userinterfaces.SelectedProductPage.NAME_XPATH;
import static co.com.falabella.userinterfaces.SelectedProductPage.QUANTITY_XPATH;
import static co.com.falabella.userinterfaces.ShoppingCartPage.NAME_XPATH2;
import static co.com.falabella.userinterfaces.ShoppingCartPage.QUANTITY_XPATH2;
import static co.com.falabella.userinterfaces.FalabellaHomePage.SEARCH_BAR_XPATH;
import static co.com.falabella.userinterfaces.FalabellaResultPage.ALERT_XPATH;
import static co.com.falabella.userinterfaces.FalabellaResultPage.SELECT_PRODUCT_XPATH;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.falabella.exceptions.NameNotFound;
import co.com.falabella.exceptions.QuantityNotFound;
import co.com.falabella.models.Product;
import co.com.falabella.questions.TheSelectedProduct;
import co.com.falabella.questions.TheSelectedquantity;
import co.com.falabella.tasks.AddProduct;
import co.com.falabella.tasks.SearchProduct;
import co.com.falabella.tasks.SelectProduct;
import co.com.falabella.userinterfaces.FalabellaHomePage;
import co.com.falabella.userinterfaces.FalabellaResultPage;
import co.com.falabella.utils.Highlight;
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
	Highlight highlight;

	@Before
	public void actorCanBrowseTheWeb() {
		user.can(BrowseTheWeb.with(hisBrowser));
		highlight = new Highlight(hisBrowser);		
	}

	@Given("^User is in the falabellas site$")
	public void userIsInTheFalabellasSite() {
		// Write code here that turns the phrase above into concrete actions
		user.wasAbleTo(Open.browserOn().the(falabellaHomePage));
	}

	@When("^Mariana searches the product$")
	public void marianaSearchesTheProduct(List<Product> product) {
		highlight.highlightElement(hisBrowser.findElement(SEARCH_BAR_XPATH));
		user.attemptsTo(SearchProduct.InFalabella(product.get(CURRENT_PRODUCT)));
	}

	@When("^She selects the product$")
	public void sheSelectsTheProduct() {
		highlight.highlightElement(hisBrowser.findElement(ALERT_XPATH));
		highlight.highlightElement(hisBrowser.findElement(SELECT_PRODUCT_XPATH));
		user.attemptsTo(SelectProduct.InFalabellaResultPage());
		highlight.highlightElement(hisBrowser.findElement(NAME_XPATH));
		highlight.highlightElement(hisBrowser.findElement(QUANTITY_XPATH));
	}

	@When("^She add the product to the shopping cart$")
	public void sheAddTheProductToTheShoppingCart() {
		// Write code here that turns the phrase above into concrete actions
		user.attemptsTo(AddProduct.ToShoppingCart());
		highlight.highlightElement(hisBrowser.findElement(NAME_XPATH2));
		highlight.highlightElement(hisBrowser.findElement(QUANTITY_XPATH2));
	}

	@Then("^She verifies that the product of the shopping cart is the same one that was selected$")
	public void sheVerifiesThatTheProductOfTheShoppingCartIsTheSameOneThatWasSelected(List<String> product) {
		// Write code here that turns the phrase above into concrete actions
		user.should(seeThat(TheSelectedProduct.InTheShoppingCart(), containsString(product.get(0)))
				.orComplainWith(NameNotFound.class, NameNotFound.NAME_NOT_FOUND));
		user.should(seeThat(TheSelectedquantity.InTheShoppingCart(), containsString(product.get(1)))
				.orComplainWith(QuantityNotFound.class, QuantityNotFound.QUANTITY_NOT_FOUND));
	}

}

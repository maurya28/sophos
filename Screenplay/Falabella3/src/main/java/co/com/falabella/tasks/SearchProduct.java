package co.com.falabella.tasks;

import static co.com.falabella.userinterfaces.FalabellaHomePage.SEARCH_BAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;


import org.openqa.selenium.Keys;

import co.com.falabella.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProduct implements Task {

	private String product;

	public SearchProduct(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(product).into(SEARCH_BAR).thenHit(Keys.ENTER));

	}
public static SearchProduct InFalabella(Product product) {
		return instrumented(SearchProduct.class, product.getProduct());
			
	}

}

package co.com.falabella.questions;

import co.com.falabella.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheSelectedquantity implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return ShoppingCartPage.QUANTITY_NAME.resolveFor(actor).getText();
	}

	public static Question<String> InTheShoppingCart() {
		// TODO Auto-generated method stub
		return new TheSelectedquantity();
	}
}

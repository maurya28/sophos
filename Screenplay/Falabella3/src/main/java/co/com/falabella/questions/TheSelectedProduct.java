package co.com.falabella.questions;

import co.com.falabella.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheSelectedProduct implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		System.out.println("holi:"+ShoppingCartPage.PRODUCT_NAME.resolveFor(actor).getText());
		ShoppingCartPage.MODAL.resolveFor(actor).waitUntilVisible();
		return ShoppingCartPage.PRODUCT_NAME.resolveFor(actor).getText();
	}

	public static Question<String> InTheShoppingCart() {
		// TODO Auto-generated method stub
		return new TheSelectedProduct();
	}


}

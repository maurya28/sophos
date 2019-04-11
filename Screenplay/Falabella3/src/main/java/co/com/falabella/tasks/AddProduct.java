package co.com.falabella.tasks;

import static co.com.falabella.userinterfaces.SelectedProductPage.ADD_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {
	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(ADD_CART));
	}
	
public static AddProduct ToShoppingCart() {
		
		return instrumented(AddProduct.class);
			
	}

}

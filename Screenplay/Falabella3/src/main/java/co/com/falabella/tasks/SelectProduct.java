package co.com.falabella.tasks;

import static co.com.falabella.userinterfaces.FalabellaResultPage.ALERT;
import static co.com.falabella.userinterfaces.FalabellaResultPage.SELECT_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(ALERT), Click.on(SELECT_PRODUCT));

	}

	public static SelectProduct InFalabellaResultPage() {

		return instrumented(SelectProduct.class);

	}

}

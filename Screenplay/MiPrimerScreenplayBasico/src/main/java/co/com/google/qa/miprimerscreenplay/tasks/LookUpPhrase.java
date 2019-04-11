package co.com.google.qa.miprimerscreenplay.tasks;

import static co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage.SEARCH_BAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


public class LookUpPhrase implements Task{
	
	private String palabra;
	
	public LookUpPhrase(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(palabra).into(SEARCH_BAR).thenHit(Keys.ENTER)
				);
		
	}
	
public static LookUpPhrase composedOfTheWords(String palabra) {
		
		return instrumented(LookUpPhrase.class,palabra);
			
	}
	

}

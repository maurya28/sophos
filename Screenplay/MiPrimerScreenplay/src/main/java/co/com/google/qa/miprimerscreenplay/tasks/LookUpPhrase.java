package co.com.google.qa.miprimerscreenplay.tasks;

import static co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage.SEARCH_BAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.google.qa.miprimerscreenplay.models.Phrase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


public class LookUpPhrase implements Task{
	
	private String phrase;
	
	public LookUpPhrase(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(phrase).into(SEARCH_BAR).thenHit(Keys.ENTER)
				);
		
	}
	
public static LookUpPhrase composedOfTheWords(Phrase phrase) {
		
		return instrumented(LookUpPhrase.class, phrase.getpalabra() +" "+ phrase.getpalabraDos());
			
	}
	

}

package co.com.google.qa.miprimerscreenplay.questions;


import co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class ThePhrase implements Question<String>  {
	
	public ThePhrase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		return GoogleResultPage.SEARCH_BAR.resolveFor(actor).waitUntilClickable().getValue();
	}
	
	public static ThePhrase searched() {
		return new ThePhrase();
	}
	
	


}

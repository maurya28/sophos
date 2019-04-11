package co.com.google.qa.miprimerserenity.steps;

import co.com.google.qa.miprimerserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class EndUserStep {

	GoogleHomePage googleHomePage;

	@Step ("Abrir Pagina")
	public void isTheHomePage() {
		googleHomePage.open();
	}

	@Step ("Ingresar palabra y dar enter")
	public void enters(String keyword) {
		googleHomePage.enterKeywords(keyword);
	}

	@Step
	public void startsSearch() {
		googleHomePage.lookupTerms();

	}

	@Step
	public void looksFor(String term) {
		enters(term);
		startsSearch();

	}

}

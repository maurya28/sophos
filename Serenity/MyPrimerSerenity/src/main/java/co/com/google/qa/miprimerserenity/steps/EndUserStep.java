package co.com.google.qa.miprimerserenity.steps;

import co.com.google.qa.miprimerserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class EndUserStep {

	GoogleHomePage googleHomePage;

	@Step ("Abrir Pagina")
	public void is_the_home_page() {
		googleHomePage.open();
	}

	@Step ("Ingresar palabra y dar enter")
	public void enters(String keyword) {
		googleHomePage.enter_keywords(keyword);
	}

	@Step
	public void startsSearch() {
		googleHomePage.lookup_terms();

	}

	@Step
	public void looks_for(String term) {
		enters(term);
		startsSearch();

	}

}

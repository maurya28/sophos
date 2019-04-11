package co.com.google.qa.miprimerserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")

public class GoogleHomePage extends PageObject {

	@FindBy(name = "q")
	private WebElementFacade searchTerms;// debe ser un objeto que extienda de webDriver
	// la linea anterior le asigna el findBy A searchTerms

	@FindBy(name = "btnk")
	private WebElementFacade lookupButton;

	public void enter_keywords(String keyword) {
		searchTerms.typeAndEnter(keyword);
	}

	public void lookup_terms() {
		// lookupButton.waitUntilClickable().click();
	}

}

package co.com.falabella.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http:/www.falabella.com.co")
public class FalabellaHomePage extends PageObject {

	public static final Target SEARCH_BAR = Target.the("la barra de busqueda").located(By.name("Ntt"));
}

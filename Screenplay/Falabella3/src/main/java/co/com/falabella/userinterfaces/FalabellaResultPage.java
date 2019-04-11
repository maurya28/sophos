package co.com.falabella.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FalabellaResultPage extends PageObject {

	public static final Target SELECT_PRODUCT = Target.the("Seleccionar producto").located(By.xpath(
			"//body/div[@class='site-wrapper']/main[@id='main']/div[@id='fbra_browseProductList']/div[@class='fb-filters']/div[@class='content-plp-app']/section[@class='plp-main-section']/div[@id='all-pods']/div[1]/div[3]/a[1]/div[2]"));
	public static final Target ALERT = Target.the("alerta").located(By.xpath("//*[@id=\"acc-alert-deny\"]"));
}

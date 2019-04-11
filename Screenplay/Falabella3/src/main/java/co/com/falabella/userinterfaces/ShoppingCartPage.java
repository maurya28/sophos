package co.com.falabella.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {
	public static final Target MODAL = Target.the("detectar modal")
			.located(By.xpath("//div[@class='fb-overlay__inject']//div[@id='fb-modal-add']"));
	public static final Target PRODUCT_NAME = Target.the("nombre del producto")
			.located(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/h4[1]"));
	public static final Target QUANTITY_NAME = Target.the("cantidad del producto").located(By.xpath(
			"//div[@class='fb-overlay__inject']//h3[@class='fb-added-to-basket__basket-title'][contains(text(),'Sub-total')]"));
}

package co.com.falabella.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectedProductPage extends PageObject {
	public static final Target PRODUCT_NAME = Target.the("nombre del prodcuto").located(By.xpath("//*[@id=\\\"fbra_browseMainProduct\\\"]/div/div/div[2]/div/div[1]/h1"));
	public static final Target QUANTITY_NAME = Target.the("cantidad del producto").located(By.name("quantity1"));
	public static final Target ADD_CART = Target.the("agregar al carrito").located(By.xpath("//button[@type='submit'][contains(text(),'Agregar a la bolsa')]"));
	public static By NAME_XPATH = By.xpath("//h1[@class='fb-product-cta__title']");
	public static By QUANTITY_XPATH =By.name("quantity1");
}

package co.com.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatosCarritos {
	private WebDriver driver;
	private Screenshot Screen ;
	private String Producto = "Huawei P20";
	private By NombreProductoCarritoxpath = By.xpath(
			"//div[@class='fb-overlay__inject']//h4[@class='fb-added-to-basket__product-title'][contains(text(),'"
					+ Producto + "')]");
	private By CantidadCarritoProductoxpath = By.xpath(
			"//div[@class='fb-overlay__inject']//h3[@class='fb-added-to-basket__basket-title'][contains(text(),'Sub-total')]");

	public DatosCarritos(WebDriver driver,Screenshot Screen) {
		this.driver = driver;
		this.Screen=Screen;
	}

	public String GuardarNombreProducto() {
		String nombreCarrito = driver.findElement(NombreProductoCarritoxpath).getText().toLowerCase().trim();

		System.out.println("el nombre del articulo es: " + nombreCarrito);
		return nombreCarrito;
	}

	public String GuardarCantidadProducto() {

		String cantidadCarrito = driver.findElement(CantidadCarritoProductoxpath).getText();

		System.out.println("la cantidad del articulo es: " + cantidadCarrito);
		return cantidadCarrito;

	}

	public void pintarNombreProducto() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(NombreProductoCarritoxpath);
		pintar.highlightElement(driver, elemento);
	}

	public void pintarCantidadProducto() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(CantidadCarritoProductoxpath);
		pintar.highlightElement(driver, elemento);
	}

	public void evidencia() {
		Screen.pantallazo(driver);

	}
}

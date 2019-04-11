package co.com.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CapturarDatos {

	private WebDriver driver;
	private Screenshot Screen ;
	private By NombreProductoSeleccionadoxpath = By.xpath("//h1[@class='fb-product-cta__title']");
	private By NombreProductoSeleccionadoPintarxpath = By.xpath("//h1[@class='fb-product-cta__title']");
	private String CantidadSeleccionadoProductoname = "quantity1";

	public CapturarDatos(WebDriver driver,Screenshot Screen) {
		this.driver = driver;
		this.Screen=Screen;
	}

	public String GuardarNombreProducto() {
		String nombreSeleccionado = driver.findElement(NombreProductoSeleccionadoxpath).getText().toLowerCase().trim();
		System.out.println("el nombre del articulo es: " + nombreSeleccionado);
		return nombreSeleccionado;
	}

	public String GuardarCantidadProducto() {

		String cantidadSeleccionada = driver.findElement(By.name(CantidadSeleccionadoProductoname)).getAttribute("Value");
		System.out.println("la cantidad del articulo es: " + cantidadSeleccionada);
		return cantidadSeleccionada;
	}

	public void evidencia() {
		Screen.pantallazo(driver);
	}

	public void pintarNombreProducto() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(NombreProductoSeleccionadoPintarxpath);
		pintar.highlightElement(driver, elemento);
	}

	public void pintarCantidadProducto() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(By.name(CantidadSeleccionadoProductoname));
		pintar.highlightElement(driver, elemento);
	}
}

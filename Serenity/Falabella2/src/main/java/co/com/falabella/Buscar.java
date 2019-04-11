package co.com.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buscar {

	private WebDriver driver;
	private Screenshot Screen;
	private String producto = "Huawei P20";
	private By busquedaname = By.name("Ntt");

	public Buscar(WebDriver driver,Screenshot Screen) {
		this.driver = driver;
		this.Screen=Screen;
	}

	public void BuscarProducto() {
		driver.findElement(busquedaname).sendKeys(producto);

	}

	public void EnterBuscaqueda() {
		driver.findElement(busquedaname).submit();
	}

	public void evidencia() {
		Screen.pantallazo(driver);

	}

	public void pintar() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(busquedaname);
		pintar.highlightElement(driver, elemento);

	}

}

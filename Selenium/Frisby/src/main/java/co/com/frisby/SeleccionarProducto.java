package co.com.frisby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleccionarProducto {

	private WebDriver driver;
	private Screenshot Screen;
	private By seleccionar = By.xpath(
			"//body[@class='container-parallax']/div[@class='container-page']/div[@class='container']/div[@class='row']/div[@class='col-md-12 col-content-right']/div[@class='inner-contentright']/section[@class='rec-container rec-container-inte']/div[2]/div[1]/div[1]");

	public SeleccionarProducto(WebDriver driver, Screenshot Screen) {
		this.driver = driver;
		this.Screen = Screen;
	}

	public void seleccionarProducto() {
		driver.findElement(seleccionar).click();
	}

	public void evidencia() {
		Screen.pantallazo(driver);

	}

	public void pintar() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(seleccionar);
		pintar.highlightElement(driver, elemento);

	}

}

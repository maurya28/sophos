package co.com.frisby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PedirEnLinea {

	private WebDriver driver;
	private Screenshot Screen;
	private By seleccionar = By.xpath("//div[@class='main-header']//li[1]");
	
	public PedirEnLinea(WebDriver driver, Screenshot Screen) {
		this.driver = driver;
		this.Screen = Screen;
	}

	public void seleccionarPedirEnLinea() {
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

package co.com.frisby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModoEntrega {

	private WebDriver driver;
	private Screenshot Screen;
	private WebDriverWait wait;
	private By entregaModal= By.xpath("//div[@class='modalUb']");
	private By seleccionar = By.xpath("//div[@class='boxprodu location-check li-check']//div[@class='rec-box']");

	public ModoEntrega(WebDriver driver, Screenshot Screen) {
		this.driver = driver;
		this.Screen = Screen;
		wait = new WebDriverWait(driver, 10);
	}
	public void seleccionarDomicilio() {
		driver.findElement(seleccionar).click();
	}

	public void DetectorModal() {
		// detectar el modal
		wait.until(ExpectedConditions.elementToBeClickable(entregaModal));

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

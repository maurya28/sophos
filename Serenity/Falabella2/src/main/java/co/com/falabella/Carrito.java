package co.com.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Carrito {
	private WebDriver driver;
	private Screenshot Screen;
	private By AgregarCarritoxpath = By.xpath("//button[@type='submit'][contains(text(),'Agregar a la bolsa')]");
	private By CarritoModalxpath = By.xpath("//div[@class='fb-overlay__inject']//div[@id='fb-modal-add']");
	private WebDriverWait wait;

	public Carrito(WebDriver driver,Screenshot Screen) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		this.Screen=Screen;
	}

	public void AgregarCarrito() {

		// agregar al carrito
		driver.findElement(AgregarCarritoxpath).click();

	}

	public void DetectorModal() {
		// detectar el modal
		wait.until(ExpectedConditions.elementToBeClickable(CarritoModalxpath));

	}

	public void MoverScroll() {
		// mover scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0,400)");

	}

	public void evidencia() {
		Screen.pantallazo(driver);

	}

	public void pintar() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(AgregarCarritoxpath);
		pintar.highlightElement(driver, elemento);

	}

}

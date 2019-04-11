package co.com.falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleccionarProducto {

	private WebDriver driver;
	private Screenshot Screen ;
	private By ProductoSeleccionadoxpath = By.xpath(
			"//body/div[@class='site-wrapper']/main[@id='main']/div[@id='fbra_browseProductList']/div[@class='fb-filters']/div[@class='content-plp-app']/section[@class='plp-main-section']/div[@id='all-pods']/div[1]/div[3]/a[1]/div[2]");
	private By Alertaxpath = By.xpath("//*[@id=\"acc-alert-deny\"]");

	public SeleccionarProducto(WebDriver driver,Screenshot Screen) {
		this.driver = driver;
		this.Screen=Screen;
	}

	public void seleccionar() {
		driver.findElement(ProductoSeleccionadoxpath).click();
	}

	public void CerrarAlerta() {
		// no,gracias alerta
		driver.findElement(Alertaxpath).click();

	}

	public void evidencia() {
		Screen.pantallazo(driver);
	}

	public void MoverScroll() {
		// mover scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0,400)");

	}

	public void pintarProducto() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(ProductoSeleccionadoxpath);
		pintar.highlightElement(driver, elemento);

	}

	public void pintarAlerta() {
		highlight pintar = new highlight();
		WebElement elemento = driver.findElement(Alertaxpath);
		pintar.highlightElement(driver, elemento);

	}

}

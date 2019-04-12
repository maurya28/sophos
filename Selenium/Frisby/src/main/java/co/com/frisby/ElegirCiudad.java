package co.com.frisby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElegirCiudad {
	
	private WebDriver driver;
	private Screenshot Screen;
	private By seleccionar= By.xpath("//span[@class='select2-selection__arrow']");
	private By buscarCiudad= By.xpath("//input[@type='search']");
	private String ciudad = "Mede";
	private By seleccionarResultado= By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
	private WebDriverWait wait;
	private By ciudadModal= By.xpath("//div[@class='modalUb']");
	
	
	public ElegirCiudad(WebDriver driver,Screenshot Screen) {
		this.driver = driver;
		this.Screen=Screen;
		wait = new WebDriverWait(driver, 10);
	}
	
	public void seleccionarFlecha() {
		driver.findElement(seleccionar).click();
	}
	
	public void escribirCiudad() {
		driver.findElement(buscarCiudad).sendKeys(ciudad);
	}
	
	public void seleccionarCiudad() {
		driver.findElement(seleccionarResultado).click();
	}
	
	public void DetectorModal() {
		// detectar el modal
		wait.until(ExpectedConditions.elementToBeClickable(ciudadModal));

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

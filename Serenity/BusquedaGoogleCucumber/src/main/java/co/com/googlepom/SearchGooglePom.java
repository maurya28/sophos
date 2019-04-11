package co.com.googlepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidadesdesarrollo.BasePage;

public class SearchGooglePom {
	private WebDriver driver;
	private BasePage basePage;
	private By txtBuscar = By.xpath("//input[@title='Buscar']");
	private By btnBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']");
	private String nombre="Busqueda";

	public SearchGooglePom(WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(this.driver);
	}

	public void escribirElTextoABuscar(String cadenaBuscar) {
		basePage.writeText(txtBuscar, cadenaBuscar);

	}

	public void darClickBotonBuscar() {
		basePage.click(btnBuscar);
	}
	
	public void evidencia() throws Exception {
		basePage.getEvidence(nombre);
	}
}

package co.com.google.qa.googlesearchwhitdata.stepsdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.googlepom.SearchGooglePom;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilidadesdesarrollo.Screenshot;

public class GoogleSearchWithDataStepDefinitions {

	WebDriver driver;
	private SearchGooglePom SearchGooglePom;
	private Screenshot Screenshot;
	private Scenario scenario;
	private String driverNavegador = "webdriver.chrome.driver";
	private String carpetaNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	
	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}


	@Given("El usuario esta en el sitio de google")
	public void elUsuarioEstaEnElSitioDeGoogle() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("El usuario abre el navegador");

		System.setProperty(driverNavegador, carpetaNavegador);
		driver = new ChromeDriver();
		SearchGooglePom = new SearchGooglePom(driver);
		Screenshot = new Screenshot(driver, scenario);

		System.out.println("El usuario abre la pagina de inicio google");

		driver.get("https://www.google.com.co");
		driver.manage().window().maximize();

	}

	@When("Busca la palabra {string}")
	public void buscaLaPalabra(String palabra) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de búsqueda el usuario escribe la palabra: " + palabra);
		SearchGooglePom.escribirElTextoABuscar(palabra);

		System.out.println("Da click en botón buscar");
		SearchGooglePom.darClickBotonBuscar();

	}

	@Then("Verifica que la palabra {string} este en los resultados")
	public void verificaQueLaPalabraEsteEnLosResultados(String palabra) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("El usuario captura los resultados de la búsqueda");
		Screenshot.tomarEvidencia(palabra);
		System.out.println("El usuario verifica que la búsqueda sea exitosa");
		assertTrue(driver.getPageSource().contains(palabra));

	}

	@After()
	public void cerrarNavegador() {
		driver.quit();
	}

}

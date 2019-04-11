package co.com.google.qa.busquedagooglecucumber.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.googlepom.SearchGooglePom;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilidadesdesarrollo.Screenshot;

public class BusquedaGoogleStepDefinitions {
	WebDriver driver;
	private SearchGooglePom SearchGooglePom;
	private Screenshot Screenshot;
	private Scenario scenario;
	private String cadenaBuscar = "Cucumber java serenity";
	private String driverNavegador = "webdriver.chrome.driver";
	private String carpetaNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	// By txtBuscar = By.xpath("//input[@title='Buscar']");
	// By btnBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar
	// con Google']");

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("User is on google home page")
	public void user_is_on_google_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("El usuario abre el navegador");

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty(driverNavegador, carpetaNavegador);
		driver = new ChromeDriver();
		SearchGooglePom = new SearchGooglePom(driver);
		Screenshot = new Screenshot(driver, scenario);

		System.out.println("El usuario abre la pagina de inicio google");
		driver.get("https://www.google.com.co");
		driver.manage().window().maximize();

	}

	@When("He does the search")
	public void he_does_the_search() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de búsqueda el usuario escribe una palabra");
		// driver.findElement(txtBuscar).sendKeys("Cucumber java serenity");
		SearchGooglePom.escribirElTextoABuscar(cadenaBuscar);

		System.out.println("Da click en botón buscar");
		// driver.findElement(btnBuscar).submit();
		SearchGooglePom.darClickBotonBuscar();

	}

	@Then("He validates that the result is successful")
	public void he_validates_that_the_result_is_successful() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("El usuario captura los resultados de la búsqueda");
		Screenshot.tomarEvidencia("Busqueda");
		System.out.println("El usuario verifica que la búsqueda sea exitosa");
		driver.quit();

	}

}

package co.com.frisby;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrisbyUnitTest {

	WebDriver driver;
	Screenshot Screen = new Screenshot();
	private String url="https://frisby.com.co/";
	private String driverNavegador = "webdriver.chrome.driver";
	private String carpetaNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	ElegirCiudad elegirCiudad;
	ModoEntrega modoEntrega;
	PedirEnLinea pedir;
	SeleccionarProducto seleccionarProducto;
	@Before
	public void setUp() throws Exception {
		System.setProperty(driverNavegador, carpetaNavegador);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(url);
		
		elegirCiudad = new ElegirCiudad(driver, Screen);
		elegirCiudad.DetectorModal();
		elegirCiudad.pintar();
		elegirCiudad.seleccionarFlecha();
		elegirCiudad.evidencia();
		elegirCiudad.escribirCiudad();
		elegirCiudad.evidencia();
		elegirCiudad.seleccionarCiudad();
		
		
		modoEntrega=new ModoEntrega(driver, Screen);
		//modoEntrega.pintar();
		modoEntrega.DetectorModal();
		modoEntrega.evidencia();
		modoEntrega.seleccionarDomicilio();
		
		pedir = new PedirEnLinea(driver, Screen);
		//pedir.pintar();
		pedir.evidencia();
		pedir.seleccionarPedirEnLinea();
		
		seleccionarProducto= new SeleccionarProducto(driver, Screen);
		seleccionarProducto.pintar();
		seleccionarProducto.evidencia();
		seleccionarProducto.seleccionarProducto();
		
	}

}

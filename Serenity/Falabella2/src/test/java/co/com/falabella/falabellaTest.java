
package co.com.falabella;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class falabellaTest {

	WebDriver driver;
	Validacion val = new Validacion();
	Screenshot Screen = new Screenshot();
	private String nombreSeleccionado;
	private String cantidadSeleccionada;
	private String nombreCarrito;
	private String cantidadCarrito;
	private String url="https:www.falabella.com.co";
	String driverNavegador = "webdriver.chrome.driver";
	String carpetaNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	

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
		Screen.pantallazo(driver);

		Buscar buscar = new Buscar(driver,Screen);
		buscar.pintar();
		buscar.BuscarProducto();
		buscar.evidencia();
		buscar.EnterBuscaqueda();
		buscar.evidencia();

		SeleccionarProducto Seleccionar = new SeleccionarProducto(driver,Screen);
		Seleccionar.pintarAlerta();
		Seleccionar.MoverScroll();
		Seleccionar.evidencia();
		Seleccionar.CerrarAlerta();
		Seleccionar.seleccionar();

		CapturarDatos CapturaDatos = new CapturarDatos(driver,Screen);
		nombreSeleccionado = CapturaDatos.GuardarNombreProducto();
		CapturaDatos.pintarNombreProducto();
		cantidadSeleccionada = CapturaDatos.GuardarCantidadProducto();
		CapturaDatos.pintarCantidadProducto();
		CapturaDatos.evidencia();
		
		System.out.println("entre1");
		Carrito carrito = new Carrito(driver,Screen);
		System.out.println("Cree el objeto carrito");
		carrito.MoverScroll();
		carrito.evidencia();
		carrito.pintar();
		carrito.evidencia();
		carrito.AgregarCarrito();
		carrito.DetectorModal();
		carrito.evidencia();

		DatosCarritos Datoscarrito = new DatosCarritos(driver,Screen);
		nombreCarrito = Datoscarrito.GuardarNombreProducto();
		Datoscarrito.pintarNombreProducto();
		cantidadCarrito = Datoscarrito.GuardarCantidadProducto();
		Datoscarrito.pintarCantidadProducto();
		Datoscarrito.evidencia();

		assertTrue("Lo Seleccionado coincide con lo esperado",
				val.validacion(nombreSeleccionado, cantidadSeleccionada, nombreCarrito, cantidadCarrito));

	}

}

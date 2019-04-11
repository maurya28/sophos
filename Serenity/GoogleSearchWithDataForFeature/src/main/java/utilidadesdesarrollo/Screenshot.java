package utilidadesdesarrollo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class Screenshot {

	private WebDriver driver;
	private Scenario scenario;
	

	public Screenshot(WebDriver driver,Scenario scenario) {
		this.driver=driver;
		this.scenario = scenario;
	}

	public void tomarEvidencia(String nombre) {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		try {
			FileUtils.copyFile(src, new File(
					"C:\\Selenium\\BusquedaGoogle\\"+nombre+".png"));
			scenario.embed(screenshot, "image/png");
		} catch (Exception e) {
			System.out.println("Exception while taking ScreenShot " + e.getMessage());
		}
	}
}

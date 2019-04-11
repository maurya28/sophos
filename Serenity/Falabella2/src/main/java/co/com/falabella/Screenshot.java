package co.com.falabella;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private int num = 1;
	private String direccionCarpeta="C:\\Selenium\\Falabella2\\pantalla";
	private String tipoArchivo= ".png";

	public void pantallazo(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(direccionCarpeta + num +tipoArchivo));
			num++;
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

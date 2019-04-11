package MiPrimerScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;//dominio inverso para saber quien es el dueño



public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.uy");
		driver.findElement(By.name("q")).sendKeys("Selenium get Screenshot java ");
		driver.findElement(By.name("btnK")).submit();*/
		
		//driver.close();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.uy");
		driver.findElement(By.name("q")).sendKeys("Selenium get Screenshot");
		driver.findElement(By.name("btnK")).submit();
		
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src, new File("C:\\Selenium\\MiPrimerSelenium\\error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
		driver.quit();
		
	}

}

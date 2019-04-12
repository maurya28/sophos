package co.com.falabella.utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {

	WebDriver driver;
	
	public Highlight(WebDriver driver) {
		this.driver = driver;
	}	
	
	public  void highlightElement(WebElement elemento) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid blue'", elemento);
		}
}

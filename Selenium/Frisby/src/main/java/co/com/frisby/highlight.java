package co.com.frisby;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class highlight {

	public void highlightElement(WebDriver driver, WebElement elemento) {

		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid blue'", elemento);
		}

	}
}

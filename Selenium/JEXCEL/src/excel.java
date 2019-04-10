
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import jxl.Cell;
import jxl.read.biff.BiffException;

public class excel {

	public static void main(String[] args) throws Exception {
		String filePath = "C:\\Users\\SEMILLERO8\\Documents\\Datos.xls";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
			ReadExcel me = new ReadExcel(filePath);
		
			int sheet = 0,col = 0; 
			int size = me.getColSize(sheet,col);
			System.out.println(size);
			for(int i = 0; i < size ; i++) { 
			  Cell c = me.getCell(sheet,col,i); 
			  driver.get("https://www.google.com");
			  String value = c.getContents();		
			  driver.findElement(By.name("q")).sendKeys(value);
			  System.out.println("buscando "+value);
			  driver.findElement(By.name("btnK")).submit(); 
			  WebDriverWait wait = new WebDriverWait(driver,5); 
			  try {
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.
				  xpath("//h1[contains(text(),'Resultados de búsqueda')]"))); 
				  System.out.println("Resultados encontrados"); 
				  me.write(sheet, 1, i, "Encontrado");
			  } catch(Exception e) { 
				  System.out.println("Sin resultados");
				  me.write(sheet, 1, i, "Sin resultados");
			  } 
			 }
			
			  me.guardar();
			  me.close();
			  driver.close();
		} catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();	
		}	
      		
	}
}


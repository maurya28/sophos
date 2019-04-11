package com.sophos.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Cell;
import jxl.read.biff.BiffException;

public class PruebaUnitariaJexcel {
	WebDriver driver;
	private String driverNavegador = "webdriver.chrome.driver";
	private String carpetaNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	private String url="https://www.google.com";
	private By txtBuscar = By.name("q");
	private By btnBuscar = By.name("btnK");
	private By resultadosBusqueda = By.xpath("//h1[contains(text(),'Resultados de búsqueda')]");
	


	@Before
	public void setUp() throws Exception {
		System.setProperty(driverNavegador,carpetaNavegador);
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		String filePath = "C:\\Users\\SEMILLERO8\\Documents\\Datos.xls";
		try {
			ReadExcel me = new ReadExcel(filePath);
		
			int sheet = 0,col = 0; 
			int size = me.getColSize(sheet,col);
			System.out.println(size);
			for(int i = 0; i < size ; i++) { 
			  Cell c = me.getCell(sheet,col,i); 
			  driver.get(url);
			  String value = c.getContents();		
			  driver.findElement(txtBuscar).sendKeys(value);
			  System.out.println("buscando "+value);
			  driver.findElement(btnBuscar).submit(); 
			  WebDriverWait wait = new WebDriverWait(driver,5); 
			  try {
				  wait.until(ExpectedConditions.visibilityOfElementLocated(resultadosBusqueda)); 
				  System.out.println("Resultados encontrados"); 
				  me.write(sheet, 1, i, "Encontrado");
			  } catch(Exception e) { 
				  System.out.println("Sin resultados");
				  me.write(sheet, 1, i, "Sin resultados");
			  } 
			 }
			
			  me.guardar();
			  me.close();
			
		} catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();	
		}
	}

}

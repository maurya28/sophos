package com.sophos.test;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;

public class ReadExcel {
	private static String EXCEL_FILE_LOCATION;
	private Workbook workbook = null;
	WritableWorkbook copy = null;
	

	public ReadExcel(String filePath) throws Exception {
		// TODO Auto-generated constructor stub
		EXCEL_FILE_LOCATION = filePath;
		try {
			this.workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			copy = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION), workbook);
		} catch (Exception e) {
			throw e;
        }
	}


	public void write(int sheet,int col,int row,String s) throws Exception{
		WritableSheet sheet2 = copy.getSheet(sheet); 
		Label label = new Label(col, row, s);
		sheet2.addCell(label);			
	}
	
	public void guardar() throws IOException {
		copy.write(); 
	}
	
	public void close() throws WriteException, IOException {
		workbook.close();
		copy.close();
	}

	
	public Workbook getWorkbook() {
		return this.workbook;
	}
	
	public Sheet getSheet(int idx) {
		return this.workbook.getSheet(idx);
	}
	
	public Cell getCell(int sheet,int col,int row) {
		return this.workbook.getSheet(sheet).getCell(col,row);
	}
	
	public Cell getCell(Sheet sheet,int col,int row) {
		return sheet.getCell(col,row);
    }
	
	public int getColSize(int sheet,int col) {
		return workbook.getSheet(sheet).getColumn(col).length;
	}
	
}
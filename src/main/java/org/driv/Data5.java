package org.driv;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;




public class Data5 {
	public static void main(String[] args) throws IOException {
		File  f = new File("C:\\Users\\kavin\\eclipse-workspace\\Datadriven5\\Excel\\datadriven5.xls");
		HSSFWorkbook w = new HSSFWorkbook();
		HSSFSheet newsheet = w.createSheet("datadriven5");
		newsheet.createRow(0);
	newsheet.getRow(0).createCell(0).setCellValue("Selenium");
	newsheet.getRow(0).createCell(1).setCellValue("appium");
	newsheet.getRow(0).createCell(2).setCellValue("cucumber");
	newsheet.getRow(0).createCell(3).setCellValue("java");
	
	
		
		newsheet.createRow(1);
		
		newsheet.getRow(1).createCell(0).setCellValue("datadriven");
		newsheet.getRow(1).createCell(1).setCellValue("junit");
		
		newsheet.getRow(1).createCell(2).setCellValue("POM");
		newsheet.getRow(1).createCell(3).setCellValue("TestNG");
		FileOutputStream fos = new FileOutputStream(f);
	    w.write(fos);
		
	}
	}
	

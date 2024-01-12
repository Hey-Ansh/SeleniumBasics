package com.microsoft.ExcelUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
public class ExcelReader {
public static void main(String[] args) throws IOException 
{
	
	FileInputStream fis=new FileInputStream(new File("./data/testdata.xlsx"));
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet= wb.getSheet("Sheet1");
	
	String info= sheet.getRow(0).getCell(1).getStringCellValue();
	System.out.println(info);
	
}
}

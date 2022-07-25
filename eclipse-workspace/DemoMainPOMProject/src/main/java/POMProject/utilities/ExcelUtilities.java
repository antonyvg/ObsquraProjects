package POMProject.utilities;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtilities {
	
	public static String excelStringFinder(int row,int col) throws IOException
	{
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources"+"\\Excel\\JavaExcelRead.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
	    Sheet sh=w.getSheet("Sheet1");
	    return sh.getRow(row).getCell(col).getStringCellValue();
		
	}
	
	public static int excelIntFinder(int row,int col) throws IOException
	{
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources"+"\\Excel\\JavaExcelRead.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
	    Sheet sh=w.getSheet("Sheet1");
		return(int)sh.getRow(row).getCell(col).getNumericCellValue();
	}

}

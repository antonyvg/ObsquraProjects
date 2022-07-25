package Sample;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExcelMercury {
	
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  String path="C:\\Users\\admin\\Desktop\\Book1.xlsx";
	  FileInputStream f=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(f);
	  XSSFSheet sheet=wb.getSheet("Sheet2");
	  
	  int row=sheet.getLastRowNum();
	  System.out.println("row count is " +row);
	  int col=sheet.getRow(0).getLastCellNum();
	  System.out.println("colounm count is "+col);
	  
	  for(int i=0;i<row+1;i++)
	  {
		  XSSFRow row1=sheet.getRow(i);

			  String user=row1.getCell(0).toString();
			//  int user=(int)row1.getCell(0).getNumericCellValue();
			  
			 // String pass=row1.getCell(1).toString();
			  String pass=row1.getCell(1).getStringCellValue();
			  
			  
			  
			  
		  
		  driver.findElement(By.name("userName")).sendKeys(String.valueOf(user));
		  Thread.sleep(1000);
		  driver.findElement(By.name("password")).sendKeys(pass);
		  Thread.sleep(1000);
		  driver.findElement(By.name("submit")).click();
	 
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/");
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

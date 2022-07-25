package Samples;

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

public class NewTest {
	
WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  String path="C:\\Users\\admin\\Desktop\\Book1.xlsx";
	  FileInputStream f=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(f);
	  XSSFSheet sh=wb.getSheet("Sheet3");
	  int rowcon=sh.getLastRowNum();
	  int colcon=sh.getRow(0).getLastCellNum();
	  
	  for(int i=1;i<rowcon;i++)
	  {
		  XSSFRow r=sh.getRow(i);
		  
		  String user=r.getCell(0).getStringCellValue();
		  int pass=(int)r.getCell(1).getNumericCellValue();
		  
		  driver.findElement(By.name("userName")).sendKeys(user);
		  driver.findElement(By.name("password")).sendKeys(String.valueOf(pass));
		  driver.findElement(By.name("submit")).click();
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}

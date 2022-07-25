package Sample;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Ebay {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  String path="C:\\Users\\admin\\Desktop\\Book1.xlsx";
	  FileInputStream f=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(f);
	  XSSFSheet sheet=wb.getSheet("ebay");
	  
	  int row=sheet.getLastRowNum();
	  int col=sheet.getRow(0).getLastCellNum();
	  
	  for(int i=0;i<row+1;i++)
	  {
		  XSSFRow row1=sheet.getRow(i);
		  
		  String user=row1.getCell(0).getStringCellValue();
		  String pass=row1.getCell(1).getStringCellValue();
		  
		  
		  driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		  driver.findElement(By.xpath("//input[@name='login_profile']")).sendKeys(user);
		  driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(pass);
		  driver.findElement(By.xpath("//button[@name='login']")).click();
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.bethlehemmatrimonial.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

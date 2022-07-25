package Samples;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Drops {
	
	WebDriver driver;
  @Test(priority = 0)
  public void f() throws Exception {
	  
	  WebElement a=driver.findElement(By.xpath("//select[@name='g']"));
	  Select drop1=new Select(a);
	  drop1.selectByIndex(1);
	  Thread.sleep(3000);
  }
  @Test(priority = 1)
  public void f2() throws Exception  {
	  
	 driver.findElement(By.xpath("//li[@class='buy-tickets']//following::li[@class='buy-tickets']")).click();
	 Thread.sleep(3000);
	 
	 String path="C:\\Users\\admin\\Desktop\\Book1.xlsx";
	 FileInputStream f=new FileInputStream(path);
	 
	 XSSFWorkbook wb=new XSSFWorkbook(f);
	 XSSFSheet sh=wb.getSheet("Sheet3");
	 
	 int ro=sh.getLastRowNum();
	 int co=sh.getRow(0).getLastCellNum();
	 for(int i=1;i<ro+1;i++)
	 {
		 XSSFRow r1=sh.getRow(i);
		 
		 String us=r1.getCell(0).toString();
		 String pass=r1.getCell(1).toString();
		 
		 
		WebElement a=driver.findElement(By.id("profile-id"));
		a.clear();
		a.sendKeys(us);
		 
		 WebElement b=driver.findElement(By.id("login-password"));
		 b.clear();
		 b.sendKeys(pass);
		 
		 
		 Thread.sleep(3000);
		 driver.findElement(By.name("login")).submit();
		 
		 
	 }
	 
	 
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.bethlehemmatrimonial.com/");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

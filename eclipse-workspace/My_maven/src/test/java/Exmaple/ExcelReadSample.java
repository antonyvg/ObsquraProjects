package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelReadSample {
	
	WebDriver driver;
	
	
  @Test(dataProvider = "dp")
  public void login(String n, String s) throws InterruptedException {
	  WebElement username=driver.findElement(By.name("userName"));
	  username.sendKeys(n);
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys(s);
	  WebElement button=driver.findElement(By.name("submit"));
	  button.click();
	  Thread.sleep(5000);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  Thread.sleep(5000);
  }

  


  @DataProvider
  public Object[][] dp() throws IOException, BiffException   {
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\JavaExcelRead1.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("antony");
	  int r=s.getRows();
	  System.out.println(r);
	  int c=s.getColumns();
	  System.out.println(c);
	  String input[][]=new String[r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			 
			  Cell cc=s.getCell(j,i);
			  input[i][j]=cc.getContents();
		  
		  
	  }
			  
	  }
	  
	  return input;
	  
	  
    
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

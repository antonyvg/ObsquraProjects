package TestPapers;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class ExcelRed {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  
	  WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
	  user.sendKeys(n);
	  WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	  pass.sendKeys(s);
	  WebElement sub=driver.findElement(By.xpath("//input[@name='submit']"));
	  sub.click();
  }

  @DataProvider
  public Object[][] dp() throws IOException, BiffException {
	  
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\JavaExcelRead1.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet1");
	  int r=s.getRows();
	  System.out.println(r);
	  int c=s.getColumns();
	  System.out.println(c);
	  
	  String input[][]=new String [r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  Cell cc=s.getCell(j, i);
			  input[i][j]=cc.getContents();
		  }
	  }
	  return input;
	  
	  
	  
    
  }
  @BeforeMethod
  public void c()
  {
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

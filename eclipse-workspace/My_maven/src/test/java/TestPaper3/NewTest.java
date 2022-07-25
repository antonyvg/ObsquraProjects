package TestPaper3;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String first, String last,String email,String tele,String pass1,String pass2) throws AWTException, InterruptedException {
	  
	  
	  
	  WebElement fr=driver.findElement(By.xpath("//input[@name='fname']"));
	  fr.sendKeys(first);
	  
	  WebElement ls=driver.findElement(By.xpath("//input[@name='lname']"));
	  ls.sendKeys(last);
	  
	  WebElement mail=driver.findElement(By.xpath("//input[@name='email']"));
	  mail.sendKeys(email);
	  
	  WebElement ph=driver.findElement(By.xpath("//input[@name='phone']"));
	  ph.sendKeys(tele);
	  
	  WebElement ps1=driver.findElement(By.xpath("//input[@name='password1']"));
	  ps1.sendKeys(pass1);
	  
	  WebElement ps2=driver.findElement(By.xpath("//input[@name='password2']"));
	  ps2.sendKeys(pass2);
	  
	  WebElement sub=driver.findElement(By.xpath("//button[text()='Sign Up']"));
	  sub.click();
	  
	  Thread.sleep(5000);
	  
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  
	  String p=driver.getWindowHandle();
	  Set<String>l=driver.getWindowHandles();
	  System.out.println(l);
	  Iterator<String>i=l.iterator();
	  while(i.hasNext())
	  {
		  String c=i.next();
		  if(!(p.equals(c)))
		  {
			  driver.switchTo().window(c);
			 driver.get("http://www.google.com");
			  Thread.sleep(5000);
		  }
	  }
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

//  @AfterMethod
//  public void afterMethod(ITestResult r) {
//	  if(ITestResult.SUCCESS==r.getStatus())
//	  {
//		 java.io.File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 FileUtils.copyInputStreamToFile(f, new File("D://"+r.getName()+".jpeg"));
//		  
//	  }
//  }


  @DataProvider
  public Object[][] dp() throws BiffException, IOException {
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\JavaExcelRead1.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet2");
	  int r=s.getRows();
	  System.out.println("rows are" +r);
	  int c=s.getColumns();
	  System.out.println("colunms are "+c);
	  String input[][]=new String[r][c];
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
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
	  if(browser.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  }
	 if(browser.equals("edge"))
	 {
		 System.setProperty("webdriver.edge.driver", "D:\\Automation drivers\\msedgedriver.exe");
		 driver=new EdgeDriver();
	 }
	  if(browser.equals("gecko"))
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\Automation drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  driver.get("http://groceryapp.uniqassosiates.com/sign-up");
	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}

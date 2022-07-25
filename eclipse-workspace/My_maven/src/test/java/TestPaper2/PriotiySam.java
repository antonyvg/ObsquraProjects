package TestPaper2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PriotiySam {
	WebDriver driver;
  @Test(priority = 1)
  public void screenshot1() {
	  String a=driver.getCurrentUrl();
	  System.out.println(a);
	  
	  SoftAssert s=new SoftAssert();
	 String b="https://demo.guru99.com/test/newtours/";
	  s.assertEquals(a, b);
	  System.out.println("pass");
	  
	  s.assertAll();
	  
  }
  @Test(priority = 2)
  public void screenshot2() throws InterruptedException, AWTException {
	  WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
	  a.sendKeys("tutorial");
	  Thread.sleep(5000);
	  
	  
	 
	 WebElement b=driver.findElement(By.xpath("//input[@name='password']"));
	  b.sendKeys("tutorial");
	  Thread.sleep(5000);
	  
	
	  
	  Robot r1=new Robot();
	  WebElement c=driver.findElement(By.xpath("//input[@name='submit']"));
	  r1.keyPress(KeyEvent.VK_ENTER);
	  r1.keyRelease(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(3000);
	  
	  
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D:\\Screenshot\\New folder\\"+r.getName()+".jpeg"));
	  }
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D:\\Screenshot\\New folder\\"+r.getName()+".jpeg"));
	  }
	  
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

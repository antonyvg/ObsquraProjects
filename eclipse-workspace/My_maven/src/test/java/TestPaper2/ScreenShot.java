package TestPaper2;

import org.testng.annotations.Test;

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

public class ScreenShot {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  WebElement x=driver.findElement(By.name("userName"));
	  Thread.sleep(1000);
	  x.sendKeys("tutorial");
	  Thread.sleep(1000);
	  WebElement y=driver.findElement(By.name("password"));
	  y.sendKeys("tutorial123");
	  Thread.sleep(1000);
	  WebElement z=driver.findElement(By.name("submit"));
	  
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D:\\Screenshot"+r.getName()+".jpeg"));
		  
		  
	  }
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D:\\Screenshot"+r.getName()+".jpeg"));
		  
		  
	  }
	  
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/"); 		
	  Thread.sleep(5000);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

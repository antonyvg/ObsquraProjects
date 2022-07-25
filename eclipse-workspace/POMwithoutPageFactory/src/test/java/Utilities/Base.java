package Utilities;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import jxl.read.biff.File;

import org.testng.annotations.AfterTest;

public class Base {
	
	public WebDriver driver;
  
//  @AfterMethod
//  public void afterMethod(ITestResult r) {
//	  if(ITestResult.SUCCESS==r.getStatus())
//	  {
//		 File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(f, new File("D://"+r.getName()+".jpeg"));	 
//	  }
//	  
//	  
//  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver  = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

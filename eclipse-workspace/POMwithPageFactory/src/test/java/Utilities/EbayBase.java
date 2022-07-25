package Utilities;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EbayBase {
	public WebDriver driver;
 
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  
	  File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  FileUtils.copyFile(f, new File("D:\\Screenshot\\"+r.getName()+".jpeg"));
	  
	  
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

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

public class ScreenShot1 {
	
	WebDriver driver;
	


	  @Test
  public void sample() throws InterruptedException, AWTException {
	  WebElement a=driver.findElement(By.xpath("//input[@name='q']"));
	  a.click();
	  a.sendKeys("yahoo11");
	  Thread.sleep(5000);
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(5000);
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		File f=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:"+r.getName()+".jpeg"));
	  }
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		File f=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:"+r.getName()+".jpeg"));
	  }
	  
  }
  
	

@BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

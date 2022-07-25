package TestPaper3;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EbaySample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
 WebElement a=driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//child::a[text()='Fashion']"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(a);
	  act.perform();
	  
	  Thread.sleep(5000);
	  
WebElement b=driver.findElement(By.xpath("//a[text()='Mens sunglasses']"));
	  
	  Actions act1=new Actions(driver);
	  act1.doubleClick();
	  act1.perform();
	  
	  Thread.sleep(5000);
	  
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(5000);
	  JavascriptExecutor js1= (JavascriptExecutor)driver;
	  js1.executeScript("window.scrollBy(0,-2000)");
	  Thread.sleep(5000);
	  
  
  
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException  {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("\\D://"+r.getName()+".jpeg"));
	  }
	  
	 

  }

@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

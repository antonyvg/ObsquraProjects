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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WaitScrollScrenSamp {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
    {
	 
	 // WebElement x=driver.findElement(By.xpath("//a[@href='/crime/news/palakkad-elappully-sdpi-worker-murder-case-1.7436629']//child::h2[1]"));
	  WebElement x=driver.findElement(By.xpath("//a[@href='/crime/news/palakkad-elappully-sdpi-worker-murder-case-1.7436629']//child::h2[1]"));
		/*
		 * WebDriverWait w=new WebDriverWait(driver, 30);
		 * w.until(ExpectedConditions.visibilityOf(x));
		 */
	  Thread.sleep(3000);
	  x.submit();
	  
	 
	  
	  
	  
	  
//  WebElement a=driver.findElement(By.xpath("(//a[@href='/in-depth'])[1]"));
//  a.click();
//  Thread.sleep(5000);
  
	 
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException, InterruptedException {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D://"+r.getName()+".jpeg"));
		  Thread.sleep(5000);
		  
		 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  System.out.println("pass");
	  }
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D://"+r.getName()+".jpeg"));
		  Thread.sleep(5000);
		 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  System.out.println("fail");
	  }	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.mathrubhumi.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
			  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

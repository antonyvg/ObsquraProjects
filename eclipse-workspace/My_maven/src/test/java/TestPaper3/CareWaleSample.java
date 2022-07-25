package TestPaper3;

import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CareWaleSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,4000)");
	  Thread.sleep(5000);
	 // driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  js.executeScript("window.scrollBy(0,-4000)");
	 // driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  Thread.sleep(5000);
	  WebElement a=driver.findElement(By.xpath("//h3[text()='Top SUVs in India']"));
	  WebDriverWait w=new WebDriverWait(driver, 50);
	  w.until(ExpectedConditions.elementToBeClickable(a));
	  a.click();
	  Thread.sleep(5000);
	  
	  js.executeScript("window.scrollBy(0,3000)");
	  Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0,-3000)");
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.xpath("//a[@href='/tata-cars/']"));
	  
	  js.executeScript("arguments[0].scrollIntoView();",b);
	  Actions act=new Actions(driver);
	  act.doubleClick(b);
	  Thread.sleep(5000);
	 
	  /*WebDriverWait w1=new WebDriverWait(driver, 50);
	  w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tata-cars/']")));*/
	  
	  
	  System.out.println("found item");
	  
			  
	  
	  
	  
	  
  }
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.carwale.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  		
	  		
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package TestPaper2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScrollEamp {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,4000)");
	  Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0,-4000)");
	  Thread.sleep(5000);
	  
	  
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(5000);
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.mathrubhumi.com");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

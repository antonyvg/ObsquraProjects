package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class XpathExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
	  a.sendKeys("antony");
	  Thread.sleep(5000);
	  a.click();
	  
	  WebElement b=driver.findElement(By.xpath("//input[@name='password']"));
	  b.sendKeys("antony");
	  Thread.sleep(5000);
	  b.click();
	  
	  WebElement c=driver.findElement(By.xpath("//input[@name='submit']"));
	  c.click();
	  Thread.sleep(5000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/");
	 
	  
	  Thread.sleep(5000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

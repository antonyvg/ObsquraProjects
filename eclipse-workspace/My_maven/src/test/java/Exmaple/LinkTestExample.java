package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LinkTestExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement x=driver.findElement(By.linkText("REGISTER"));
	  x.click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  WebElement y=driver.findElement(By.linkText("Home"));
	  y.click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement x=driver.findElement(By.xpath("//a[text()='Agile Project']"));
	  /*x.click();
	  Thread.sleep(5000);*/
	  Actions act1=new Actions(driver);
	  act1.contextClick();
	  act1.perform();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html#google_vignette");
	  
	 	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

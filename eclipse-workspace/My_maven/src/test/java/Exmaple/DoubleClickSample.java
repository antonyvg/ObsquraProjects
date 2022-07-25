package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DoubleClickSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//a[text()='SUPPORT']"));
	 // WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
	 
	  Actions a1=new Actions(driver);
	 
	  /*a1.keyDown(Keys.SHIFT);
	  a.sendKeys("antony");
	  a1.keyUp(Keys.SHIFT);
	  Thread.sleep(5000);*/
	 
	 a1.doubleClick(a);
	  a1.perform();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

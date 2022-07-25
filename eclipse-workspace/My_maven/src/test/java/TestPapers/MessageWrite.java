package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MessageWrite {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.id("single-input-field"));
	  a.sendKeys("hi i am antony");
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.id("button-one"));
	  b.click();
	  Thread.sleep(500);
	  
	  WebElement c=driver.findElement(By.id("value-a"));
	  c.sendKeys("10");
	  Thread.sleep(500);
	  
	  WebElement d=driver.findElement(By.id("value-b"));
	  d.sendKeys("20");
	  Thread.sleep(5000);
	  
	  WebElement e=driver.findElement(By.id("button-two"));
	  e.click();
	  Thread.sleep(10000);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  Thread.sleep(10000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package TestPaper2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class KeyBoardSample {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  
	  
	  WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
	  a.click();
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_SHIFT);
	  r.keyPress(KeyEvent.VK_A);
	  r.keyRelease(KeyEvent.VK_A);
	  
	  r.keyPress(KeyEvent.VK_B);
	  r.keyRelease(KeyEvent.VK_B);
	  
	  r.keyPress(KeyEvent.VK_C);
	  r.keyRelease(KeyEvent.VK_C);
	  r.keyRelease(KeyEvent.VK_SHIFT);
	  
	  
	  Thread.sleep(5000);
	  
	  
	 
	 WebElement b=driver.findElement(By.xpath("//input[@name='password']"));
	  b.sendKeys("antony");
	  Thread.sleep(5000);
	  
	
	  
	  Robot r1=new Robot();
	  WebElement c=driver.findElement(By.xpath("//input[@name='submit']"));
	  r1.keyPress(KeyEvent.VK_ENTER);
	  r1.keyPress(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(10000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

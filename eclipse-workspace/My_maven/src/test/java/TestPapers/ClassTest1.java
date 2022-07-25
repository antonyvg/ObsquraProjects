package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ClassTest1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  WebElement a=driver.findElement(By.xpath("//input[@name='cusid']"));
	  a.sendKeys("12345");
	  Thread.sleep(5000);
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(5000);
	  
	  Alert r1=driver.switchTo().alert();
	  r1.accept();
	  Thread.sleep(300);
	  
	  Alert r2=driver.switchTo().alert();
	  r2.accept();
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php#");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

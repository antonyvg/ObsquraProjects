package TestPaper2;

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

public class keyBoardSample1 {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//input[@name='cusid']"));
	  a.click();
	 // a.sendKeys("123");
	  Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_1);
	  r.keyRelease(KeyEvent.VK_1);
	  r.keyPress(KeyEvent.VK_2);
	  r.keyRelease(KeyEvent.VK_2);
	  r.keyPress(KeyEvent.VK_3);
	  r.keyRelease(KeyEvent.VK_3);
	 
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(5000);
	  
	/*  WebElement b=driver.findElement(By.xpath("//input[@name='submit']"));
	  b.click();*/
	  
	  Alert a1=driver.switchTo().alert();
	  a1.accept();
	  Thread.sleep(1000);
	  a1.accept();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php#");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

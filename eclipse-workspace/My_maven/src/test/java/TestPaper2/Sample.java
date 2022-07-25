package TestPaper2;

import org.testng.annotations.Test;
import org.w3c.dom.Element;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Sample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  WebElement a=driver.findElement(By.xpath("//select[@name='fromPort']"));
	 
	/* a.click();
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 Thread.sleep(1000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 Thread.sleep(1000);

	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 Thread.sleep(1000);

	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(5000);*/
	  
	 
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

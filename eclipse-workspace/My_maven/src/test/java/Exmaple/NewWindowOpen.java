package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewWindowOpen {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException { 
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  Thread.sleep(5000);
	  String p=driver.getWindowHandle();
	  Set<String>l=driver.getWindowHandles();
	  System.out.println(l);
	  Iterator<String>i=l.iterator();
	  while(i.hasNext())
	  {
		  String c=i.next();
		  if(!(p.equals(c)))
		  {
			  driver.switchTo().window(c);
			 driver.get("http://www.google.com");
			  Thread.sleep(5000);
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

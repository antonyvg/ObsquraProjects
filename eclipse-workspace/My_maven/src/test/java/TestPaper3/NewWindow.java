package TestPaper3;

import org.testng.annotations.Test;
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

public class NewWindow {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  Thread.sleep(5000);
	  
	  String p=driver.getWindowHandle();
	  System.out.println(p);
	  Set<String> s=driver.getWindowHandles();
	  System.out.println(s);
	  
	  Iterator<String>i=s.iterator();
	  while(i.hasNext())
	  {
		  String c=i.next();
		  if(!(p.equals(c)))
		  {
			  driver.switchTo().window(c);
			  driver.get("https://www.youtube.com/");
			  driver.switchTo().defaultContent();
			  Thread.sleep(5000);
			  
			  
			  		
		  }
		
	  }
	  
	  
		  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.mathrubhumi.com/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

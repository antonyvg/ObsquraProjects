
package Exmaple;

import org.testng.annotations.Test;
import org.testng.internal.Arguments;
import org.testng.annotations.BeforeTest;
import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ScrollMovemntSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	 /* WebElement a=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	  a.click();
	  Actions a1=new Actions(driver);
	  a1.doubleClick(a);
	  Thread.sleep(5000);
	  
WebElement b=driver.findElement(By.xpath("//a[text()='Scrollbar Demo']"));
	  b.click();
	  Actions a2=new Actions(driver);
	  a2.doubleClick(b);
	  Thread.sleep(5000);*/
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  js.executeScript("window.scrollBy(0,1000)");
	  Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0,-1000)");
	  Thread.sleep(5000);
	  
	  
//	  WebElement b=driver.findElement(By.xpath("//a[@href='http://businesstravel.about.com/mbody.htm?PM=78_101_T&cob=home']"));
//	 js.executeScript("arguments[0].scrollIntoView();",b);
	 
	//b.click();
	  Thread.sleep(5000);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WaitExample {
	WebDriver driver;
  @Test
  public void f() {
	  Actions a1=new Actions(driver);
	 // driver.switchTo().frame(0);
	  
	  WebDriverWait w=new WebDriverWait(driver, 20);
	 w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
	  
	  
	  WebElement a=driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement b=driver.findElement(By.xpath("//div[@id='droppable']"));
	  
	  
	  a1.dragAndDrop(a, b);
	  a1.build().perform();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

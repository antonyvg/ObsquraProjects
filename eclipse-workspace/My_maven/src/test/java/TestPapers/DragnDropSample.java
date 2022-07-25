package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragnDropSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Actions a1=new Actions(driver);
	  driver.switchTo().frame(0);
	  
	  WebElement a=driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement b=driver.findElement(By.xpath("//div[@id='droppable']"));
	  
	  
	  a1.dragAndDrop(a, b);
	  a1.build().perform();
	  Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}


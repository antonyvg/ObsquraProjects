package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SelectColourTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement a=driver.findElement(By.linkText("Select Input"));
	  a.click();
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.id("single-input-field"));
	  Select dropdown1=new Select(b);
	  dropdown1.selectByIndex(1);
	  Thread.sleep(5000);
	  
	  WebElement c=driver.findElement(By.id("multi-select-field"));
	  Select dropdown2=new Select(c);
	  dropdown2.selectByIndex(2);
	  Thread.sleep(5000);
	  
	  WebElement d=driver.findElement(By.id("button-first"));
	  d.click();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  Thread.sleep(10000);
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

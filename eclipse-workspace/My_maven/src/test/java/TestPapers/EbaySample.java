package TestPapers;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class EbaySample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  WebElement a=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	  
	 
	  a.sendKeys("fruits");
	  String b=a.getAttribute("value");
	  System.out.println(b);
	  
	 
	  
	  
	  
	  //Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://www.ebay.com");
	  //Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

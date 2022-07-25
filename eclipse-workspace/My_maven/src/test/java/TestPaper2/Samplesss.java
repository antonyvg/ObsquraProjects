package TestPaper2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.common.Assert;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Samplesss {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement a=driver.findElement(By.xpath("//input[@name=\"q\"]"));
	  a.sendKeys("antony");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  
	  String b=a.getAttribute("value");
	  System.out.println(b);
	  
	  org.testng.Assert.assertEquals(b, "antony");
	  System.out.println("pass");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

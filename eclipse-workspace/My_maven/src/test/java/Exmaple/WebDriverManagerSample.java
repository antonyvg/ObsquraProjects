package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebDriverManagerSample {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
	  a.sendKeys("tutorils");
	  Thread.sleep(5000);
	  a.click();
	  
	  WebElement b=driver.findElement(By.xpath("//input[@name='password']"));
	  b.sendKeys("tutorils");
	  Thread.sleep(5000);
	  b.click();
	  
	  WebElement c=driver.findElement(By.xpath("//input[@name='submit']"));
	  c.click();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  String det=System.getProperty("user.dir");
	  System.out.println(det);
	  
	  driver.get("https://demo.guru99.com/test/newtours/");
	  
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	 
	 
	  
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package Exmaple;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SoftAssertExample {

	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement x=driver.findElement(By.name("userName"));
	  Thread.sleep(1000);
	  x.sendKeys("tutorial");
	  Thread.sleep(1000);
	  WebElement y=driver.findElement(By.name("password"));
	  y.sendKeys("tutorial");
	  Thread.sleep(1000);
	  WebElement z=driver.findElement(By.name("submit"));
	  Thread.sleep(1000);
	  z.click();
	  String b=driver.getCurrentUrl();
	  System.out.println(b);
	 
	  
	  
	 
	  SoftAssert s=new SoftAssert();
	 
	 s.assertEquals(b, "https://demo.guru99.com/test/newtours/");
	 System.out.println("its fail");
	 
	 s.assertNull(driver);
	 System.out.println("again fail");
	 
	 s.assertAll();
	 
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  String a=driver.getCurrentUrl();
	  System.out.println(a);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}

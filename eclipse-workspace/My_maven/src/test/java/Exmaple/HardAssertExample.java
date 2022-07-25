package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssertExample {
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
	  Thread.sleep(1000);
	  String b=driver.getCurrentUrl();
	  System.out.println(b);
	 Assert.assertEquals(b, "https://demo.guru99.com/test/newtours/login_sucess.php");
	 System.out.println("check");
	 Assert.assertNotNull(driver);
	  //Assert.assertNull(driver);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/"); 		
	  Thread.sleep(5000);
	  String c=driver.getCurrentUrl();
	  System.out.println(c);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

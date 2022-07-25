package Exmaple;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertSample2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.navigate().to("http://www.yahoo.com");
	  Thread.sleep(1000);
	  String b=driver.getCurrentUrl();
	  System.out.println(b);
	  
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(b, "http://www.google.com");
	  System.out.println("fail");
	  s.assertNull(driver);
	  System.out.println("fail 1");
	  s.assertAll();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  Thread.sleep(1000);
	  String a=driver.getCurrentUrl();
	  System.out.println(a);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

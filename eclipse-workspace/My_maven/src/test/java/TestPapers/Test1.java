package TestPapers;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Test1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement x=driver.findElement(By.name("userName"));
	  x.sendKeys("tutorial");
	  Thread.sleep(5000);
	  String c=x.getAttribute("userName");
	  System.out.println(c);
	  String d=x.getTagName();
	  System.out.println(d);
	  WebElement y=driver.findElement(By.name("password"));
	  y.sendKeys("tutorial");
	  Thread.sleep(5000);
	  WebElement z=driver.findElement(By.name("submit"));
	  z.click();
	  Thread.sleep(5000);
	  String a=driver.getCurrentUrl();
	  System.out.println(a);
	  Assert.assertEquals(a, "https://demo.guru99.com/test/newtours/login_sucess.php");
	  System.out.println("pass");
	 /* Assert.assertNull(driver);
	  System.out.println("fail");*/
	  Assert.assertNotNull(driver);
	  System.out.println("pass again");
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

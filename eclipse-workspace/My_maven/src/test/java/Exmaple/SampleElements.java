package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SampleElements {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement x=driver.findElement(By.name("login_profile"));
	  x.sendKeys("antony");
	  Thread.sleep(5000);
	  String a=x.getTagName();
	  System.out.println(a);
	  String b=x.getAttribute("name");
	  System.out.println(b);
	  WebElement y=driver.findElement(By.name("login_password"));
	  y.sendKeys("12345");
	  Thread.sleep(5000);
	  WebElement z=driver.findElement(By.name("login"));
	  z.click();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.bethlehemmatrimonial.com/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

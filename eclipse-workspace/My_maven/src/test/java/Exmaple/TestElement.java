package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestElement {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement x=driver.findElement(By.name("userName"));
	  x.sendKeys("antony");
	  Thread.sleep(5000);
	  x.clear();
	  Thread.sleep(5000);
	  x.sendKeys("thomas");
	  Thread.sleep(5000);
	  String a=x.getTagName();
	  System.out.println(a);
	  String b=x.getAttribute("userName");
	  System.out.println(b);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

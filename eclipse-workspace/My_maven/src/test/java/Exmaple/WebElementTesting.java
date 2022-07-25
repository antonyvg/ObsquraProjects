package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebElementTesting {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  WebElement x=driver.findElement(By.name("userName"));
	  x.sendKeys("tug");
	  Thread.sleep(5000);
	  x.clear();
	  Thread.sleep(1000);
	  x.sendKeys("tutorial");
	  Thread.sleep(1000);
	  String a=x.getTagName();
	  System.out.println(a);
	  WebElement y=driver.findElement(By.name("password"));
	  y.sendKeys("tutorial");
	  Thread.sleep(1000);
	  String b=y.getAttribute("name");
	  System.out.println(b);
	  WebElement z=driver.findElement(By.name("submit"));
	 // z.click();
	 String c=z.getAttribute("name");
	 System.out.println(c);
	  Thread.sleep(1000);
	  
	  
	  		
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
  public void afterTest()
  {
	  driver.close();
  }

}

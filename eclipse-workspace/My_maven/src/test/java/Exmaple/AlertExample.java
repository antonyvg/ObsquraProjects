package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement a=driver.findElement(By.xpath("//input[@name='cusid']"));
	  a.click();
	  a.sendKeys("123");
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.xpath("//input[@name='submit']"));
	  b.click();
	  Thread.sleep(5000);
	  
	  Alert obj1=driver.switchTo().alert();
	  obj1.dismiss();
	  Thread.sleep(5000);
	  
	  WebElement c=driver.findElement(By.xpath("//input[@name='res']"));
	  c.click();
	  Thread.sleep(5000);
	  
	  WebElement d=driver.findElement(By.xpath("//input[@name='cusid']"));
	  d.click();
	  d.sendKeys("12345");
	  Thread.sleep(5000);
	  
	  WebElement e=driver.findElement(By.xpath("//input[@name='submit']"));
	  e.click();
	  Thread.sleep(5000);
	  
	  Alert obj2=driver.switchTo().alert();
	  String x=obj2.getText();
	  System.out.println(x);
	  obj2.accept();
	  Thread.sleep(300);
	  
	  
	  
	  Alert obj3=driver.switchTo().alert();
	  String y=obj3.getText();
	  System.out.println(y);
	  obj3.accept();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PartialLinkTestExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement x=driver.findElement(By.partialLinkText("Telecom"));
	  String ab=x.getText();
	  System.out.println(ab);
	  x.click();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  WebElement y=driver.findElement(By.partialLinkText("Payment Gateway"));
	  y.click();
	  Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

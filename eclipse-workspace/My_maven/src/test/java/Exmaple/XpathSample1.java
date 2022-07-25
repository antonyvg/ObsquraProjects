package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class XpathSample1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//a[text()='Cruises']"));
	  a.click();
	  Thread.sleep(3000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  //System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  Thread.sleep(5000);
	  String s=driver.getCurrentUrl();
	  System.out.println(s);
	  int a=s.length();
	  System.out.println(a);
	  driver.navigate().to("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

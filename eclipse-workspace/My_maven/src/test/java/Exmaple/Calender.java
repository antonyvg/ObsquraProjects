package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Calender {
	
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://qalegend.com/crm/index.php?route=quote/add");
	  Thread.sleep(10000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

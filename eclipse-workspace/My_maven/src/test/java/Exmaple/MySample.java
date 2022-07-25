package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MySample {
	
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.mathrubhumi.com/");
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}

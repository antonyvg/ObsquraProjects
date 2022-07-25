package TestPaper2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String name, String pass) {
	  
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(name);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	  driver.findElement(By.xpath("//input[@name='submit']")).submit();
  }

  @DataProvider
  public Object[][] dp() {
	  
    Object[][] data=new Object[1][2];
    
    data[0][0]="antony";
    data[0][1]="antony";
    
	return data;
    
    
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

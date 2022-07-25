package TestPaper2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParameterExample {
	WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public void login(String username,String password) {
	  
	  WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));
	a.sendKeys(username);
	WebElement b=driver.findElement(By.name("password"));
	  b.sendKeys(password);
	  WebElement button=driver.findElement(By.name("submit"));
	  button.click();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

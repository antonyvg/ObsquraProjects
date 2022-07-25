package Exmaple;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParameterExamp {
	WebDriver driver;
  @Test
  @Parameters({"susername","spassword"})
  public void login(String susername,String spassword) {
	  WebElement username=driver.findElement(By.name("userName"));
	  username.sendKeys(susername);
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys(spassword);
	  WebElement button=driver.findElement(By.name("submit"));
	  button.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDownExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  List<WebElement>radio1=driver.findElements(By.name("tripType"));
	  radio1.get(1).click();
	  List<WebElement>radio2=driver.findElements(By.name("servClass"));
	  radio2.get(1).click();
	  WebElement x=driver.findElement(By.name("passCount"));
	  Select dropdown=new Select(x);
	  dropdown.selectByIndex(2);
	//  dropdown.deselectAll();
	  Thread.sleep(5000);
	  WebElement y=driver.findElement(By.name("fromPort"));
	  Select dropdown1=new Select(y);
	  dropdown1.selectByIndex(3);
	  Thread.sleep(5000);
	  WebElement z=driver.findElement(By.name("fromMonth"));
	  Select dropdown2=new Select(z);
	  dropdown2.selectByValue("5");
	  Thread.sleep(5000);
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  //System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

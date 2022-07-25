package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropListTesting {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  

	  
	  
	  WebElement element = driver.findElement(By.name("fromPort"));
	  Select select = new Select(element);
	  List<WebElement> list = select.getOptions();
	  int size=list.size();
	  System.out.println(size);
	  for(int i=0; i<list.size(); i++)        
	      {
	          System.out.println(list.get(i).getText());
	        select.selectByVisibleText("Sydney");
	          
	      }
	  Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
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

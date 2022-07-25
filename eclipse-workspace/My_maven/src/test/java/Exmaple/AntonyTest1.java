package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AntonyTest1 
{WebDriver driver;
  @Test
  public void f() throws InterruptedException {
		/*
		 * WebElement x=driver.findElement(By.xpath("//input[@id='inputSearch']"));
		 * x.sendKeys("12345");
		 */
	 // x.click();
	  Thread.sleep(5000);
	  WebElement y=driver.findElement(By.id("inputSearch"));
	  y.sendKeys("12345");
	 boolean w=y.isEnabled();
	 System.out.println(w);
	  Thread.sleep(5000);
	  y.submit();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.chavaramatrimony.com/");
	  Thread.sleep(5000);
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  //driver.close();
	  
  }

}

package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragDropSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement a=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	  WebElement b=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	  
	  WebElement c=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	  WebElement d=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	  
	  
	  Actions a1=new Actions(driver);
	  a1.dragAndDrop(a, b);
	  Thread.sleep(5000);
	  a1.dragAndDrop(c, d);
	  Thread.sleep(5000);
	  a1.build().perform();
	  Thread.sleep(5000);
	  
	  
	  
	  
	  
	 
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  //System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html#google_vignette");
	  driver.manage().window().maximize();
	  String ab=driver.getWindowHandle();
	  System.out.println(ab);
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

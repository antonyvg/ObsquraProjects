package Samples;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Myntra {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement men=driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(men).perform();
	  //Thread.sleep(3000);
	  String tit=driver.getTitle();
	  System.out.println(tit);
	  Assert.assertTrue(tit.contains("Men"));
	  
	  WebElement shirt=driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
	  Actions act1=new Actions(driver);
	  act1.doubleClick(shirt).perform();
	  String tit2=driver.getTitle();
	  System.out.println(tit2);
	  //Thread.sleep(3000);
	  
	 Assert.assertTrue(tit2.contains("Men"));
	 System.out.println("pass");
	 
	 
	
	 WebElement sor1=driver.findElement(By.xpath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']"));
	      
	 Actions act2=new Actions(driver);
	act2.doubleClick(sor1).perform();
	
	WebElement sam=driver.findElement(By.xpath("//label[text()='Popularity']"));
	Actions act3=new Actions(driver);
	act3.doubleClick(sam).perform();
	Thread.sleep(3000);
	
	 
}
	 
	  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.myntra.com/");
	  driver.manage().window().maximize();
	 // Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

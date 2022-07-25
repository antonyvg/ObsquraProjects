package TestPaper3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.InputStream;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SacnSample {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
	  user.sendKeys("admin");
	  
	  
	  
	  WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	  pass.sendKeys("12345678");
	  Thread.sleep(5000);
	  
	  
	  
	  WebElement ans=driver.findElement(By.xpath("//input[@id='lgn-bot']"));
	  ans.click();
//	 Scanner s=new Scanner(System.in);
//	 s.nextInt();
	  Thread.sleep(3000);
	 
	  
	  
	  WebElement sub=driver.findElement(By.xpath("//button[@id='lgn-submit']"));
	  sub.click();
	 
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://qalegend.com/crm/index.php?route=login");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package TestPapers;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CheckBoxExample {
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.linkText("Checkbox Demo"));
	  a.click();
	  Thread.sleep(5000);
	  
//	  List<WebElement>radio1=driver.findElements(By.id("gridCheck"));
//	  radio1.get(0).click();
//	  Thread.sleep(5000);
	  
	  //List<WebElement>radio2=driver.findElements(By.id("check-box-one"));
	  driver.findElements(By.id("check-box-one")).get(0).click();
	  driver.findElements(By.id("gridCheck")).get(0).click();
	  driver.findElements(By.id("check-box-three")).get(0).click();
	  
	 
	  
	  
	 // driver.findElements(By.id("check-box-one")).get(3).click();
	  //radio2.get(0).click();
	  Thread.sleep(5000);
	  
//	 List<WebElement>radio3=driver.findElements(By.id("check-box-three"));
//	 radio3.get(0).click();
//	 Thread.sleep(5000);
	 
	 WebElement b=driver.findElement(By.id("button-two"));
	 b.click();
	 Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  //System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  Thread.sleep(10000);
	  
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

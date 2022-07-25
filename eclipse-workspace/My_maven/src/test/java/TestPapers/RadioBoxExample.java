package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RadioBoxExample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.linkText("Radio Buttons Demo"));
	  a.click();
	  Thread.sleep(5000);
	  
	  List<WebElement>radio1=driver.findElements(By.name("inlineRadioOptions"));
	  radio1.get(0).click();
	  Thread.sleep(5000);
	  
	  WebElement c=driver.findElement(By.id("button-one"));
	  c.click();
	  Thread.sleep(5000);
	  
	  List<WebElement>radio2=driver.findElements(By.name("student-gender"));
	  radio2.get(1).click();
	  Thread.sleep(5000);
	  
	  List<WebElement>radio3=driver.findElements(By.name("student-age"));
	  radio3.get(2).click();
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.id("button-two"));
	  b.click();
	  Thread.sleep(1000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  Thread.sleep(10000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

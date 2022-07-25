package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BethlehamSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement a=driver.findElement(By.name("g"));
	  Select dropdown1=new Select(a);
	  dropdown1.selectByIndex(1);
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.name("af"));
	  Select dropdown2=new Select(b);
	  dropdown2.selectByValue("28");
	  Thread.sleep(5000);
	  
	  WebElement c=driver.findElement(By.name("at"));
	  Select dropdown3=new Select(c);
	  dropdown3.selectByValue("33");
	  Thread.sleep(5000);
	  
	 
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.bethlehemmatrimonial.com/");
	  Thread.sleep(1000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

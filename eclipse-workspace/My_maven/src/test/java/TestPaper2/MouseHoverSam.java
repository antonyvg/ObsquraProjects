package TestPaper2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseHoverSam {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement a=driver.findElement(By.xpath("(//a[text()='Health & Beauty'])[1]"));
	 WebElement b=driver.findElement(By.xpath("(//a[text()='Home & Garden'])[1]"));
	 
	 Actions a1=new Actions(driver);
	 a1.moveToElement(a).perform();
	 Thread.sleep(5000);
	 a1.moveToElement(b).perform();
	 Thread.sleep(5000);
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

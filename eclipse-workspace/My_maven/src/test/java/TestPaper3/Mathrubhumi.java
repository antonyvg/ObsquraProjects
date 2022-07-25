package TestPaper3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Mathrubhumi {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement ad=driver.findElement(By.xpath("//div[@class='title']"));
	  WebDriverWait w=new WebDriverWait(driver, 50);
	  w.until(ExpectedConditions.elementToBeClickable(ad));
	  
	  
	  ad.click();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.mathrubhumi.com/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

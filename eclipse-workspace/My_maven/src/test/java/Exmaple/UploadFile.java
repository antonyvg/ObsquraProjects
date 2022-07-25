package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class UploadFile {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	 a.sendKeys("D:\\ucte erattupetta (1).JPG");
	 Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(10000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

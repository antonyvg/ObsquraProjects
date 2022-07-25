package TestPaper2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DoubleClickSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
	  WebElement b=driver.findElement(By.xpath("//button[@id='normal-btn-danger']"));
	  
	  Actions a1=new Actions(driver);
	  a1.doubleClick(a);
	  a1.doubleClick(b);
	  a1.build().perform();
	  Thread.sleep(5000);
	  
	 
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
	  driver.manage().window().maximize();
	  String as=System.getProperty("user.dir");
	  System.out.println(as);
	  Thread.sleep(10000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

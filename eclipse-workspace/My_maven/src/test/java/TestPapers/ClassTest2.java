package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ClassTest2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	 WebElement a=driver.findElement(By.xpath("//option[@value='PHP']"));
	  
	  Actions a1=new Actions(driver);
	  a1.doubleClick(a);
	 
	  Thread.sleep(10000);
	  
	  WebElement b=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	  
	  
	  //Actions a2=new Actions(driver);
	  a1.doubleClick(b);
	  a1.build().perform();
	  
	  Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/jquery-dual-list.php");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

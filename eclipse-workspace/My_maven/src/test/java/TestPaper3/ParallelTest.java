package TestPaper3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ParallelTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement username=driver.findElement(By.name("userName"));
	  username.sendKeys("antony");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("antony");
	  WebElement button=driver.findElement(By.name("submit"));
	  button.click();
	  
  }
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
	  if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	   if(browser.equals("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "D:\\Automation drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
	   if(browser.equals("gecko"))
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\Automation drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

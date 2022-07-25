package TestPaper2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragDropSample {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement a=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	  WebElement b=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	  
	  Actions a1=new Actions(driver);
	  a1.dragAndDrop(a, b);
	  Thread.sleep(300);
	  a1.perform();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/drag-drop.php");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

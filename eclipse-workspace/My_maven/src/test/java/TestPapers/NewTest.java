package TestPapers;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.switchTo().frame(0);
	  WebElement a=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	  WebElement c=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	  
	 Actions act=new Actions(driver);
	 act.dragAndDrop(a, c);
	 act.build().perform();
	
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	 
	 driver.switchTo().defaultContent();
	 
	 WebElement b=driver.findElement(By.xpath("//a[text()='Themes']"));
	 b.click();
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	 
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

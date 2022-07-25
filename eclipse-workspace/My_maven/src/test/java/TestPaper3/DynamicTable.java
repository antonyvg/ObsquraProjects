package TestPaper3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DynamicTable {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  List<WebElement> a=driver.findElements(By.xpath("//div[@class=\"stocknews__innerlist stocknews__innerlist1\"]//parent::div[@id=\"table1\"]//ul"));
	  
//	  int size=a.size();
//	  System.out.println(size);
	  System.out.println("its find");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//	  
	  for(WebElement aa:a)
	  {
		 String sam=aa.getText();
		 System.out.println(sam);
		 
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.5paisa.com/share-market-today");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

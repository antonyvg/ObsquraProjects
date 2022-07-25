package TestPapers;

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

public class TableHandle {
	WebDriver driver;
  @Test
  public void f() {
	  
	  List<WebElement> col= driver.findElements(By.xpath("//table[@class=\"dataTable\"]//th"));
	  int size1=col.size();
	  System.out.println(size1);
	  
	  for(WebElement ee:col)
	  {
		  String ee1=ee.getText();
		 System.out.println(ee1);
	  }
	  
	  List<WebElement> row= driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
	  int size2=row.size();
	  System.out.println(size2);
	  
	  for(WebElement rr:row)
	  {
		  String rr1=rr.getText();
		 System.out.println(rr1);
		 System.out.println();
		 
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/web-table-element.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

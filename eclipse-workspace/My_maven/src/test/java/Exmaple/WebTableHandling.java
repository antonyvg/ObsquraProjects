package Exmaple;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebTableHandling {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> c=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table//tr//th"));
	  int coloum=c.size();
	  System.out.println(coloum);
	  
	  List<WebElement> r=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	  int row=r.size();
	  System.out.println(row);
	  
	  for(int i=0;i<row;i++)
	  {
		  List<WebElement>curentrow=r.get(i).findElements(By.tagName("td"));
		  for(int j=0;j<coloum;j++)
		  {
			  String s=curentrow.get(j).getText();
			  System.out.println(s);
			  
		  }
		  System.out.println();
		  System.out.println("..........");
	  }
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/web-table-element.php");
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

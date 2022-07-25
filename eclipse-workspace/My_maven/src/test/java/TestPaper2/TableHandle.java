package TestPaper2;

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
	  
	  WebElement table=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
	  
	  List<WebElement> row=driver.findElements(By.tagName("tr"));
	  for(int i=0;i<row.size();i++)
	  {
		  List<WebElement> col=row.get(i).findElements(By.tagName("td"));
		  for(int j=0;j<col.size();j++)
		  {
			  System.out.println(col.get(j).getText());
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/web-table-element.php#");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package TestPapers;

import org.testng.annotations.Test;
import org.w3c.dom.Element;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class XpathLooping {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  List<WebElement>radio1=driver.findElements(By.xpath("//input[@type='radio']"));
	  	radio1.get(1).click();
	  Thread.sleep(5000);
	  
	 WebElement b=driver.findElement(By.xpath("//select[@name='fromPort']"));
	 Select d1=new Select(b);
	 d1.selectByIndex(2);
	 Thread.sleep(5000);
	 
	Select d2=new Select(b);
	List<WebElement>a=d2.getOptions();
	int s=a.size();
	for(int i=0;i<s;i++)
	{
		String y=a.get(i).getText();
		System.out.println(y);
	}
	
	
	WebElement c=driver.findElement(By.xpath("//select[@name='toMonth']"));
	Select x=new Select(c);
	x.selectByIndex(2);
	
	Select y=new Select(c);
	List<WebElement>alldata=y.getOptions();
	int size=alldata.size();
	for(int j=0;j<size;j++)
	{
		String z=alldata.get(j).getText();
		System.out.println(z);
	}
	
	
	
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

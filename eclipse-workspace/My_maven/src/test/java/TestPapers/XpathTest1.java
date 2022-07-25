package TestPapers;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class XpathTest1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//input[@type='text']"));
	  a.sendKeys("tutorials");
	  Thread.sleep(3000);
	  
	  WebElement b=driver.findElement(By.xpath("//input[@type='password']"));
	  b.sendKeys("tutorials");
	  Thread.sleep(3000);
	  
	  WebElement c=driver.findElement(By.xpath("//input[@type='submit']"));
	  c.click();
	  Thread.sleep(5000);
	  
	  WebElement d=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	  Thread.sleep(3000);
	  String x=d.getText();
	  System.out.println(x);
	  
	  SoftAssert s=new SoftAssert();
	  s.assertEquals("Login Successfully",x);
	  System.out.println("no bugs here");
	  
	  WebElement e=driver.findElement(By.xpath("//*[text()='Flights']"));
	  e.click();
	  Thread.sleep(5000);
	  
	  
	  List<WebElement>radio1=driver.findElements(By.xpath("//input[@type='radio']"));
	  radio1.get(1).click();
	  Thread.sleep(5000);
	  
	  WebElement f=driver.findElement(By.xpath("//select[@name='passCount']"));
	  Select d1=new Select(f);
	  d1.selectByIndex(2);
	  Thread.sleep(5000);
	  
	  Select s1=new Select(f);
	  List<WebElement>allData=s1.getOptions();
	  int size=allData.size();
	  System.out.println(size);
	  for(int z=0;z<size;z++)
	  {
		 String y=allData.get(z).getText();
		 System.out.println(y);
	  }
	  
	 /* Select d1=new Select(f);
	  d1.selectByIndex(2);
	  Thread.sleep(5000);*/
	  
	  WebElement g=driver.findElement(By.xpath("//select[@name='fromPort']"));
	  Select d2=new Select(g);
	  d2.selectByIndex(3);
	  Thread.sleep(5000);
	  
	  WebElement h=driver.findElement(By.xpath("//select[@name='fromMonth']"));
	  Select d3=new Select(h);
	  d3.selectByIndex(3);
	  Thread.sleep(5000);
	  
	  WebElement i=driver.findElement(By.xpath("(//select[@name='fromDay']//following::option)[5]"));
	  i.click();
	  Thread.sleep(5000);
	  
	  WebElement j=driver.findElement(By.xpath("(//select[@name='toPort']//following::option)[7]"));
	  j.click();
	  Thread.sleep(5000);
	  
	  WebElement k=driver.findElement(By.xpath("(//select[@name='toMonth']//following::option)[12]"));
	  k.click();
	  Thread.sleep(5000);
	  
	  WebElement l=driver.findElement(By.xpath("(//select[@name='toDay']//following::option)[8]"));
	  l.click();
	  Thread.sleep(5000);
	  
	  List<WebElement>radio2=driver.findElements(By.xpath("//input[@name='servClass']"));
	  radio2.get(1).click();
	  Thread.sleep(5000);
	  
	  WebElement m=driver.findElement(By.xpath("(//select[@name='airline']//following::option)[2]"));
	  m.click();
	  Thread.sleep(5000);
	  
	  WebElement n=driver.findElement(By.xpath("//input[@name='findFlights']"));
	  n.click();
	  Thread.sleep(5000);
	  
	  WebElement o=driver.findElement(By.xpath("//img[@src='images/home.gif']"));
	  o.click();
	  Thread.sleep(5000);
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe") ;
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

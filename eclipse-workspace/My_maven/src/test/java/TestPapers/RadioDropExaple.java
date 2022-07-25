package TestPapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class RadioDropExaple {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.linkText("Flights"));
	  a.click();
	  Thread.sleep(5000);
	  
	  List<WebElement>radio1=driver.findElements(By.name("tripType"));
	  radio1.get(1).click();
	  Thread.sleep(5000);
	  
	  WebElement b=driver.findElement(By.name("passCount"));
	  Select DropDown1=new Select(b);
	  DropDown1.selectByIndex(2);
	  Thread.sleep(5000);
	  
	  WebElement c=driver.findElement(By.name("fromPort"));
	  Select DropDown2=new Select(c);
	  DropDown2.selectByIndex(1);
	  Thread.sleep(5000);
	  
	  WebElement d=driver.findElement(By.name("fromMonth"));
	  Select DropDown3=new Select(d);
	  DropDown3.selectByIndex(8);
	  Thread.sleep(5000);
	  
	  WebElement e=driver.findElement(By.name("fromDay"));
	  Select DropDown4=new Select(e);
	  DropDown4.selectByIndex(8);
	  Thread.sleep(5000);
	  
	  WebElement f=driver.findElement(By.name("toPort"));
	  Select DropDown5=new Select(f);
	  DropDown5.selectByIndex(8);
	  Thread.sleep(5000);
	  
	  WebElement g=driver.findElement(By.name("toMonth"));
	  Select DropDown6=new Select(g);
	  DropDown6.selectByIndex(8);
	  Thread.sleep(5000);
	  
	  WebElement h=driver.findElement(By.name("toDay"));
	  Select DropDown7=new Select(h);
	  DropDown7.selectByIndex(15);
	  Thread.sleep(5000);
	  
	  List<WebElement>radio2=driver.findElements(By.name("servClass"));
	  radio2.get(1).click();
	  Thread.sleep(5000);
	  if(radio2.get(1).isSelected())
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	  
	  WebElement i=driver.findElement(By.name("airline"));
	  Select DropDown8=new Select(i);
	  DropDown8.selectByIndex(2);
	  Thread.sleep(5000);
	  
	  WebElement j=driver.findElement(By.name("findFlights"));
	  j.click();
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

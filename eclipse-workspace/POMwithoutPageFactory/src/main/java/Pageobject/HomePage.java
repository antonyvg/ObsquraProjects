package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void flight() throws InterruptedException {
	WebElement a=driver.findElement(By.linkText("Flights"));
	  a.click();
	  Thread.sleep(5000);
}

public void trip() throws InterruptedException {
	 List<WebElement>radio1=driver.findElements(By.name("tripType"));
	  radio1.get(1).click();
	  Thread.sleep(5000);
}

public void passcount() throws InterruptedException {
	 
	  WebElement b=driver.findElement(By.name("passCount"));
	  Select DropDown1=new Select(b);
	  DropDown1.selectByIndex(2);
	  Thread.sleep(5000);
}


public void frmport() throws InterruptedException
{
	WebElement c=driver.findElement(By.name("fromPort"));
	  Select DropDown2=new Select(c);
	  DropDown2.selectByIndex(1);
	  Thread.sleep(5000);
}

public void month() throws InterruptedException
{
	 
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
	  
}

public void last() throws InterruptedException
{
	List<WebElement>radio2=driver.findElements(By.name("servClass"));
	  radio2.get(1).click();
	  Thread.sleep(5000);
	  WebElement i=driver.findElement(By.name("airline"));
	  Select DropDown8=new Select(i);
	  DropDown8.selectByIndex(2);
	  Thread.sleep(5000);
	  
	  WebElement j=driver.findElement(By.name("findFlights"));
	  j.click();
	  Thread.sleep(5000);
	  
}




}

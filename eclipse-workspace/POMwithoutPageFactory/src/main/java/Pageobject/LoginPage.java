package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginDetails() throws InterruptedException
	{
		WebElement uname=driver.findElement(By.xpath("//input[@name='userName']"));
		uname.sendKeys("tutorial");
		Thread.sleep(5000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("tutorial");
		Thread.sleep(5000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(5000);
		
	}
	
	

}

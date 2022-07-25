package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement ob;
	@FindBy(xpath = "//input[@name='password']")
	WebElement ob1;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement ob2;
	
	
	
	public void login()
	{
		ob.sendKeys("tutorial");
		ob1.sendKeys("tutorial");
		ob2.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}

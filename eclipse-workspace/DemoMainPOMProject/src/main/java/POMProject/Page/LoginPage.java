package POMProject.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMProject.utilities.PageUtilities;

public class LoginPage {
	
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement obj1;
	@FindBy(xpath = "//input[@name='password']")
	WebElement obj2;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement log;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String name)
	{
		obj1.sendKeys(name);
	}
	public void passWord(String pass)
	{
		obj2.sendKeys(pass);
	}
	public void submitButton()
	{
		log.click();
	}
	
	public String tileName()
	{
		String title=driver.getTitle();
		return title;
	}
	

}

package POMProject.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMProject.utilities.PageUtilities;



public class HomePage  extends PageUtilities{
	
	PageUtilities pageobj1=new PageUtilities();
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Flights']")
	WebElement obj;

	@FindBy(xpath  ="//input[@name='tripType']")
	WebElement obj1;
	@FindBy(xpath = "//select[@name='passCount']")
	WebElement obj2;
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement obj3;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flight()
	{
		obj.click();
		
	}
	public void radio()
	{
		
		pageobj1.radioButtonSelect(driver, obj1, 1);
		
		
	}
	public void passcount()
	
	{
		
		pageobj1.waitForElementToBeVisible(driver, obj2, 5000);
		
		pageobj1.selectDropsByIndex(driver, obj2, 2);
	}
	public void port() throws InterruptedException
	{
		pageobj1.selectDropsByIndex(driver, obj3, 2);
		pageobj1.sleep(5000);
	}
public void movement() throws InterruptedException
{
	pageobj1.scrollDown(driver, 2000);
	pageobj1.sleep(5000);
}
}

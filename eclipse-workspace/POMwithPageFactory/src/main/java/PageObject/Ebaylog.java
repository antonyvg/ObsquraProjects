package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebaylog {
	public WebDriver driver;
	
	
	@FindBy(xpath = "(//a[text()='Fashion'])[2]")
	WebElement obj;
	@FindBy(xpath = "(//a[text()='Sports'])[2]")
	WebElement obj2;
	
	
	
	
	public void login()
	{
		
		obj.click();
		
//		Actions act=new Actions(driver);
//		act.doubleClick();
//		act.perform();
		
	}
	public Ebaylog(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}

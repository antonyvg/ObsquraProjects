package Project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project.Utilities.WaitUtilities;

public class LoginPage {

	WaitUtilities waitobj;

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement obj1;
	@FindBy(xpath = "//input[@name='password']")
	WebElement obj2;
	@FindBy(xpath = "//input[@id='lgn-bot']")
	WebElement obj3;
	@FindBy(xpath = "//button[@id='lgn-submit']")
	WebElement obj4;
	@FindBy(xpath = "//a[text()='Forgotten Password?']")
	WebElement obj5;
	@FindBy(xpath = "//input[@name='mail']")
	WebElement obj6;
	@FindBy(xpath = "//input[@id='lgn-bot']")
	WebElement obj7;
	@FindBy(xpath = "//button[@id='forgot-submit']")
	WebElement obj8;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		waitobj = new WaitUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void username(String name) {
		obj1.sendKeys(name);
		String ss = driver.getTitle();
		System.out.println("title is " + ss);
	}

	public void password(String pass1) {
		obj2.sendKeys(pass1);
	}

	public void sum() throws InterruptedException {

		obj3.click();

	}

	public void submit() throws InterruptedException {

		obj4.submit();
		waitobj.sleep(4000);

	}

	public void forgot(String mail) throws InterruptedException {

		obj5.click();
		obj6.sendKeys(mail);

		obj7.click();

		obj8.submit();

		driver.navigate().back();
		driver.navigate().back();

	}
}

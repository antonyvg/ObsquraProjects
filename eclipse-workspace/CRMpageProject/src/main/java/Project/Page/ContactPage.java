package Project.Page;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project.Utilities.ActionUtilities;
import Project.Utilities.ScrollUtilities;
import Project.Utilities.SelectUtilities;
import Project.Utilities.WaitUtilities;

public class ContactPage {

	ActionUtilities act1;
	WaitUtilities waitobj;
	SelectUtilities sect1;
	ScrollUtilities su;

	public WebDriver driver;
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement con1;
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
	WebElement con2;
	@FindBy(xpath = "//a[@class='btn btn-primary btn-outline btn-gradient btn-pill btn-sm']")
	WebElement con3;
	@FindBy(xpath = "//i[@class='fa fa-reply']")
	WebElement con4;
	@FindBy(xpath = "//select[@name='contact[salutation]']")
	WebElement con5;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-gradient btn-pill']")
	WebElement con6;
	@FindBy(xpath = "//label[@for=\"marketing-sms\"]")
	WebElement con7;

	@FindBy(xpath = "//input[@name='contact[firstname]']")
	WebElement con8;
	@FindBy(xpath = "//input[@name='contact[lastname]']")
	WebElement con9;
	@FindBy(xpath = "//input[@name='contact[company]']")
	WebElement con10;
	@FindBy(xpath = "//input[@name='contact[email]']")
	WebElement con11;
	@FindBy(xpath = "//input[@name='contact[phone]']")
	WebElement con12;
	@FindBy(xpath = "//input[@name='contact[website]']")
	WebElement con13;

	@FindBy(xpath = "//th[@class='table-srno sorting_asc']")
	WebElement con14;

	@FindBy(xpath = "//input[@type='search']")
	WebElement con15;

	@FindBy(xpath = "//a[@href=\"https://qalegend.com/crm/index.php?route=contact/view&id=213\"]")
	WebElement con16;
	@FindBy(xpath = "//a[@href=\"https://qalegend.com/crm/index.php?route=contact/edit&id=213\"]")
	WebElement con17;

	@FindBy(xpath = "(//p[@class=\"btn btn-danger btn-circle btn-outline btn-outline-1x table-delete\"])[5]")
	WebElement con18;
	@FindBy(xpath = "//a[@class=\"btn btn-default btn-gradient btn-pill\"]")
	WebElement con19;
	@FindBy(xpath = "//a[text()='Close']")
	WebElement con20;

	@FindBy(xpath = "//a[@class=\"btn btn-outline btn-warning btn-pill btn-outline-1x btn-sm\"]")
	WebElement con21;
	@FindBy(xpath = "(//button[@class=\"close\"])[1]")
	WebElement con22;

 	public ContactPage(WebDriver driver) {

		this.driver = driver;
		act1 = new ActionUtilities(driver);
		su = new ScrollUtilities(driver);
		sect1 = new SelectUtilities(driver);
		waitobj = new WaitUtilities(driver);

		PageFactory.initElements(driver, this);
	}

	public void contact() {

		waitobj.waitforanElementClick(driver, con1, 400);
		act1.doubleClicl(driver, con1);

	}

	public void contactDrop() {

		sect1.selectIndex(driver, con2, 4);
		waitobj.imwait(driver, 4000);

	}

	public void contactDetails() {

		act1.doubleClicl(driver, con3);
		waitobj.imwait(driver, 400);
	}

	public void back() {
		waitobj.imwait(driver, 400);

		act1.doubleClicl(driver, con4);
		waitobj.imwait(driver, 400);
		act1.doubleClicl(driver, con3);

	}

	public void contactDrop1() {

		sect1.selectIndex(driver, con5, 4);

		su.scrollDown(driver, 2000);

		su.scrollUp(driver, -4000);

	}

	public void saveClick() {

		waitobj.waitforanElementClick(driver, con6, 400);
		act1.doubleClicl(driver, con6);

	}

	public void checkBoxees() {

		con7.click();
		waitobj.imwait(driver, 400);
		su.scrollUp(driver, -2000);

	}

	public void firstName(String name) throws InterruptedException {

		con8.clear();
		con8.sendKeys(name);

	}

	public void lastName(String last) throws InterruptedException {

		con9.clear();
		con9.sendKeys(last);

	}

	public void compName(String comp) throws InterruptedException {

		con10.clear();
		con10.sendKeys(comp);

	}

	public void mailDetails(String mail) throws InterruptedException {

		con11.clear();
		con11.sendKeys(mail);

	}

	public void phoneNum(String number) throws InterruptedException {

		con12.clear();
		con12.sendKeys(number);

	}

	public void webDetails(String web) throws InterruptedException {

		con13.clear();
		con13.sendKeys(web);

	}

	public void contactSearch() throws InterruptedException {
		act1.doubleClicl(driver, con15);
		con15.sendKeys("Reliance");

	}

	public void back1() {

		act1.doubleClicl(driver, con4);

	}

	public void viewDetails() {
		act1.doubleClicl(driver, con15);
		con15.sendKeys("Reliance");

		act1.doubleClicl(driver, con16);
		waitobj.imwait(driver, 400);
		act1.doubleClicl(driver, con1);
		waitobj.imwait(driver, 400);
	}

	public void editDetails() {
		act1.doubleClicl(driver, con15);
		con15.sendKeys("Reliance");
		waitobj.imwait(driver, 400);
		act1.doubleClicl(driver, con17);
		waitobj.imwait(driver, 400);
		act1.doubleClicl(driver, con4);

	}

	public void fileSelect() {
		act1.doubleClicl(driver, con21);
		waitobj.waitforSelect(driver, con22, 10);
		act1.doubleClicl(driver, con22);
		waitobj.imwait(driver, 500);
	}

}

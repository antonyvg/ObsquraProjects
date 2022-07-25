package Project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project.Utilities.ActionUtilities;
import Project.Utilities.ScrollUtilities;
import Project.Utilities.SelectUtilities;
import Project.Utilities.WaitUtilities;

public class LeadsPage {

	public static WebDriver driver;
	ActionUtilities act1;
	WaitUtilities wat1;
	SelectUtilities sel1;
	ScrollUtilities sco1;

	@FindBy(xpath = "//span[text()='Leads']")
	WebElement led1;
	@FindBy(xpath = "//select[@name=\"DataTables_Table_0_length\"]")
	WebElement led2;
	@FindBy(xpath = "//a[@class=\"btn btn-primary btn-outline btn-gradient btn-pill btn-sm\"]")
	WebElement led3;
	@FindBy(xpath = "//a[@class=\"btn btn-white btn-icon\"]")
	WebElement led4;
	@FindBy(xpath = "//a[@href=\"#address\"]")
	WebElement led5;
	@FindBy(xpath = "//a[@href=\"#remarks\"]")
	WebElement led6;

	@FindBy(xpath = "//div[@class=\"note-editable card-block\"]")
	WebElement led7;
	@FindBy(xpath = "//button[@class=\"note-btn btn btn-light btn-sm dropdown-toggle\"]")
	WebElement led8;

	@FindBy(xpath = "//div[@class=\"note-editing-area\"]")
	WebElement led9;
	@FindBy(xpath = "//i[@class=\"note-icon-arrows-alt\"]")
	WebElement led10;

	public LeadsPage(WebDriver driver) {
		this.driver = driver;
		act1 = new ActionUtilities(driver);
		wat1 = new WaitUtilities(driver);
		sel1 = new SelectUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void leadSelect() {
		act1.doubleClicl(driver, led1);
		wat1.imwait(driver, 5000);
	}

	public void leadDrops() {
		sel1.selectIndex(driver, led2, 4);
		wat1.imwait(driver, 5000);

	}

	public void selectFront() {
		act1.doubleClicl(driver, led3);
		act1.doubleClicl(driver, led4);
		wat1.imwait(driver, 1000);
	}

	public void selectItems() {
		act1.doubleClicl(driver, led3);
		act1.doubleClicl(driver, led5);
		wat1.imwait(driver, 1000);
		act1.doubleClicl(driver, led6);
		wat1.imwait(driver, 1000);
	}

	public void enterDatas() {
		act1.doubleClicl(driver, led7);
		led7.sendKeys("Hi i am the new lead");
		wat1.imwait(driver, 5000);
		act1.doubleClicl(driver, led1);
		wat1.imwait(driver, 5000);

	}

	public void selectFormat() throws InterruptedException {

		sel1.selectIndex(driver, led8, 2);
		wat1.imwait(driver, 1000);
		act1.doubleClicl(driver, led10);
		wat1.imwait(driver, 1000);
		act1.doubleClicl(driver, led10);
		wat1.imwait(driver, 1000);

	}
}

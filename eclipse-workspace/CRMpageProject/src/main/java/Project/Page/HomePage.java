package Project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project.Utilities.ActionUtilities;

import Project.Utilities.SelectUtilities;
import Project.Utilities.WaitUtilities;

public class HomePage {
	ActionUtilities actobj;
	WaitUtilities waitobj;
	SelectUtilities selobj;

	public static WebDriver driver;

	@FindBy(xpath = "//span[text()='Quotes/Estimates']")
	WebElement ob1;
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
	WebElement ob2;
	@FindBy(xpath = "(//span[text()='Invoices'])[1]")
	WebElement ob3;
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
	WebElement ob4;

	@FindBy(xpath = "//a[@class=\"btn btn-primary btn-outline btn-gradient btn-pill btn-sm\"]")
	WebElement ob5;
	@FindBy(xpath = "//a[@class=\"btn btn-white btn-icon\"]")
	WebElement ob6;

	@FindBy(xpath = "//a[@class=\"btn btn-primary btn-outline btn-gradient btn-pill btn-sm\"]")
	WebElement ob7;
	@FindBy(xpath = "//a[@class=\"btn btn-white btn-icon\"]")
	WebElement ob8;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		actobj = new ActionUtilities(driver);

		selobj = new SelectUtilities(driver);
		waitobj = new WaitUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void quoteClick() {

		actobj.doubleClicl(driver, ob1);
		waitobj.imwait(driver, 400);

	}

	public void quoteDrop1() {

		waitobj.waitforanElementClick(driver, ob2, 400);

		selobj.selectIndex(driver, ob2, 2);

	}

	public void quoteDrop2() {

		selobj.selectIndex(driver, ob2, 4);
		waitobj.imwait(driver, 400);
	}

	public void quoteMove() {
		actobj.doubleClicl(driver, ob5);
		waitobj.imwait(driver, 400);
		actobj.doubleClicl(driver, ob6);
		waitobj.imwait(driver, 400);
	}

	public void invoice() {

		actobj.doubleClicl(driver, ob3);
		waitobj.imwait(driver, 400);

	}

	public void invoiceDrop() {

		selobj.selectIndex(driver, ob4, 4);
		waitobj.imwait(driver, 4000);
	}

	public void invoicMove() {

		actobj.doubleClicl(driver, ob7);
		waitobj.imwait(driver, 4000);

		actobj.doubleClicl(driver, ob8);
		waitobj.imwait(driver, 4000);

	}

}

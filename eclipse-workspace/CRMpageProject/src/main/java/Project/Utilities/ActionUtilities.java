package Project.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtilities {

	public WebDriver driver;

	public ActionUtilities(WebDriver driver) {
		this.driver = driver;

	}

	public void doubleClicl(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void click(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	public void mouseMovement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void alertAccept(WebDriver driver) {
		Alert obj1 = driver.switchTo().alert();
		obj1.accept();
	}

	public void alertDismiss(WebDriver driver) {
		Alert obj1 = driver.switchTo().alert();
		obj1.dismiss();
	}

}

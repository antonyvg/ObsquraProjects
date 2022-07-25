package Project.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {

	public WebDriver driver;

	public WaitUtilities(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement waitforanElementClick(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public WebElement waitforanAlert(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		return element;
	}

	public WebElement waitforSelect(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		return element;

	}

	public void imwait(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS);
	}

	public void sleep(long time) throws InterruptedException {
		Thread.sleep(time);
	}

}

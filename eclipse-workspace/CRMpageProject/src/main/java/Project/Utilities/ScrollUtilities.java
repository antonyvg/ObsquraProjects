package Project.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtilities {

	public WebDriver driver;

	public ScrollUtilities(WebDriver driver) {
		this.driver = driver;

	}

	public void scrollDown(WebDriver driver, int num) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + num + ")");
	}

	public void scrollUp(WebDriver driver, int num) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + num + ")");
	}

}

package Project.Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtilities {

	public WebDriver driver;

	public SelectUtilities(WebDriver driver) {
		this.driver = driver;

	}

	public void selectIndex(WebDriver driver, WebElement element, int num) {
		Select s = new Select(element);
		s.selectByIndex(num);

	}

	public void selectname(WebDriver driver, WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);

	}

	public void checkBox(WebElement element) {
		element.click();
	}

}
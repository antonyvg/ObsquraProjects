package POMProject.utilities;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	
		
	private static final String By = null;
	public WebElement waitForElementToBeVisible(WebDriver driver,WebElement elementToBeloaded,int time)
	{
		WebDriverWait wait =new WebDriverWait(driver, time);
		WebElement element=wait.until(ExpectedConditions.visibilityOf(elementToBeloaded));
		
		return element;
	}
	
	public WebElement waitForElementToBeClickable(WebDriver driver,WebElement elementToBeloaded,int time )
	{
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elementToBeloaded));
		return element;
		
	}
	public Alert waitForAlert(WebDriver driver,int time )
	{
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		return alert;
		
	}
	public void hitenter(WebDriver driver,WebElement element)
	{
		element.sendKeys(Keys.ENTER);;
	}
	public void sendTextUsingMouseActions(WebDriver driver,WebElement element,String text)
	{
		Actions action=new Actions(driver);
		action.sendKeys(element, text).build().perform();
	}
	public void moveToElement(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
	}
	public void contectClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
		action.contextClick(element).build().perform();
	}
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
		action.doubleClick(element).build().perform();
	}
	
	public void sleep(long time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	
	public void selectDropsByIndex(WebDriver driver,WebElement element,int index)
	{
		Select selectobj= new Select(element);
		selectobj.selectByIndex(index);
		
	}
	public void selectDropsByName(WebDriver driver,WebElement element,String name)
	{
		
		Select selectobj= new Select(element);
		selectobj.selectByValue(name);;
		
	}
	public void radioButtonSelect(WebDriver driver,WebElement element,int index)
	{
		List<WebElement>radio=driver.findElements((By) element);
		radio.get(index).click();
		
	}
	public void scrollDown(WebDriver driver,int down)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+down+")");
	}

}

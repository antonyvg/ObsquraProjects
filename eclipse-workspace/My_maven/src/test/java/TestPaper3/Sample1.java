package TestPaper3;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample1 {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//select[@name='g']"));
	  Select s=new Select(a);
	  s.selectByIndex(1);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  
	  WebElement b=driver.findElement(By.xpath("//select[@name='af']"));
	  Select s1=new Select(b);
	  s1.selectByIndex(10);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  
	  WebElement c=driver.findElement(By.xpath("//select[@name='at']"));
	  Select s2=new Select(c);
	  s2.selectByIndex(10);
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	  
	  Select s3=new Select(c);
	  List<WebElement>a5=s3.getOptions();
	  int size=a5.size();
	  for(int i=0;i<size;i++)
	  {
		  String b1=a5.get(i).getText();
		  System.out.println(b1);
	  }
	  
	 /* List<WebElement>r1=driver.findElements(By.xpath("//label[text()='Profiles with photo']"));
	  r1.get(0).click();*/
	  
	  WebElement d=driver.findElement(By.xpath("//input[@value='SEARCH']"));
	  WebDriverWait w=new WebDriverWait(driver, 30);
	  w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='SEARCH']")));
	  d.click();
	 
	  /*Actions x=new Actions(driver);
	  x.doubleClick(d);*/
	  
	  
	  Thread.sleep(5000);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,4000)");
	  Thread.sleep(5000);
	  
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D://"+r.getName()+".jpeg"));
		  System.out.println("pass");
	  }
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D://"+r.getName()+".jpeg"));
		  System.out.println("fail");
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.bethlehemmatrimonial.com/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

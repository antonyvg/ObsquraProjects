package POMProject.Script;



import POMProject.Constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class LoginBase {
	public static WebDriver driver;
	public static Properties prop=null;
	
	public void basicFile() throws IOException
	{
		try
		{
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources"+"\\config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
	
		
	}
  
  @AfterMethod
  public void takeScreenShotOnFaliure(ITestResult r) throws IOException {
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		  takeScreenShot(r.getName());
		 
	  }
  }
	  public String  takeScreenShot(String name) throws IOException
	  {
		  String datename=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  String destination=System.getProperty("user.dir")+"\\target"+"\\screenshot"+name+datename+".png";
		  File lastdestination=new File(destination);
		  FileUtils.copyFile(source, lastdestination);
		  return destination;
	  }
  
@Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) throws Exception {
	
	basicFile();
	
	if(browser.equalsIgnoreCase(Constants.CHROMEBROWSER))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase(Constants.EDGEBROWSER))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else
	{
		throw new Exception(Constants.BROWSERNOTFOUND);
	}
	
	driver.manage().window().maximize();
	
	
	  String baseurl=prop.getProperty("url");
	  driver.get(baseurl);
	
	
			
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

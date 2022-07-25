package TestPaper2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Down {
	static WebDriver driver;
  @Test
  
	  
	  public static void ff() throws IOException, InterruptedException {
	        
	  
	        WebElement downloadButton = driver.findElement(By
	        .id("messenger-download"));
	        String sourceLocation = downloadButton.getAttribute("href");
	        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

	        
	        Process exec = Runtime.getRuntime().exec(wget_command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        
	       /* Process exec=Runtime.getRuntime().exec(aa);
	        int val=exec.waitFor();
	        System.out.println(+val);*/
	    
	        
	        }
	        
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
      String baseUrl = "http://demo.guru99.com/test/yahoo.html";
      driver.get(baseUrl);
      Thread.sleep(5000);

	  
  }

  @AfterTest
  public void afterTest() {
  
  driver.close();

}}

package Exmaple;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DownloadFile {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//a[@id='messenger-download']"));
	  
	  String sourceLocation = a.getAttribute("href");
	 // String wget_command="cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " +sourceLocation;
	  String wget_command="cmd /c C:\\Wget\\wget.exe -P D: " +sourceLocation;
	         
	        Process exec = Runtime.getRuntime().exec(wget_command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	  
        
	        }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/yahoo.html");
	  Thread.sleep(10000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

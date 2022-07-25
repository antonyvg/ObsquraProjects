package TestPapers;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Meesho {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String nam, String last,String email,String tele,String pass,String rept) throws InterruptedException {
	 
	  
	  
	 
	  
	  WebElement name=driver.findElement(By.name("fname"));
	  
	 // clearWebField(name);
	  name.sendKeys(nam);
	  WebElement laste=driver.findElement(By.name("lname"));
	 // clearWebField(laste);
	  laste.sendKeys(last);
	  WebElement mail=driver.findElement(By.name("email"));
	 // clearWebField(mail);
	  mail.sendKeys(email);
	  WebElement phone=driver.findElement(By.name("phone"));
	 // clearWebField(phone);
	  phone.sendKeys(tele);
	  WebElement pas1=driver.findElement(By.name("password1"));
	 // clearWebField(pas1);
	  pas1.sendKeys(pass);
	  WebElement pas2=driver.findElement(By.name("password2"));
	//  clearWebField(pas2);
	  pas2.sendKeys(rept);
	  WebElement sub=driver.findElement(By.xpath("//button[text()='Sign Up']"));
	  sub.click();
	  Thread.sleep(5000);
	  
	  
	  
	
	  
  }
  @BeforeMethod
  public void p() throws InterruptedException {
	  driver.get("http://groceryapp.uniqassosiates.com/sign-up");
	  Thread.sleep(3000);
  }
  public void clearWebField(WebElement element){
	    while(!element.getAttribute("value").equals("")){
	        element.sendKeys(Keys.BACK_SPACE);
	    }
	}

  @DataProvider
  public Object[][] dp() throws IOException, BiffException {
	  
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\JavaExcelRead1.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("login");
	  int row=s.getRows();
	  int colo=s.getColumns();
	//  String input[][]=new String[row][colo];
	  String input1[][]=new String[row][colo];
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<colo;j++)
		  {
			  if(i==1)
			  {
				  Cell cc=s.getCell(j, i);
				  input1[i][j]=cc.getContents();
			  }
			 // Cell cc=s.getCell(j, i);
			//  input[i][j]=cc.getContents();
		  }
	  }
		  
		  
    
    
    return input1;
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

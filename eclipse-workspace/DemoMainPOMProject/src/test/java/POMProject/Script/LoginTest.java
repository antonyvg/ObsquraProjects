package POMProject.Script;

import java.io.IOException;

import org.testng.annotations.Test;

import POMProject.Page.LoginPage;
import POMProject.utilities.ExcelUtilities;

public class LoginTest extends LoginBase {
	LoginPage logobj;
	
  @Test(priority = 0)
  public void invalidUserNamenInvalidPassword() throws IOException {
	  
	  String username1=ExcelUtilities.excelStringFinder(0, 0);
	  String password1=ExcelUtilities.excelStringFinder(0, 1);
	  logobj=new LoginPage(driver);
	  
	  logobj.userName(username1);
	  logobj.passWord(password1);
	  logobj.submitButton();
	    
  }
  
  @Test(priority = 1)
  public void invalidUserNamenValidPassword() throws IOException {
	  
	  String username1=ExcelUtilities.excelStringFinder(1, 0);
	  String password1=ExcelUtilities.excelStringFinder(1, 1);
	  logobj=new LoginPage(driver);
	  logobj.userName(username1);
	  logobj.passWord(password1);
	  logobj.submitButton();
	    
  }
  
  @Test(priority = 2)
  public void validUserNamenInvalidPassword() throws IOException {
	  
	  String username1=ExcelUtilities.excelStringFinder(2, 0);
	  String password1=ExcelUtilities.excelStringFinder(2, 1);
	  logobj=new LoginPage(driver);
	  logobj.userName(username1);
	  logobj.passWord(password1);
	  logobj.submitButton();
	    
  }
  
  @Test(priority = 3)
  public void ValidUserNamenValidPassword() throws IOException {
	  
	  String username1=ExcelUtilities.excelStringFinder(3, 0);
	  String password1=ExcelUtilities.excelStringFinder(3, 1);
	  logobj=new LoginPage(driver);
	  logobj.userName(username1);
	  logobj.passWord(password1);
	  logobj.submitButton();
	    
  }
}

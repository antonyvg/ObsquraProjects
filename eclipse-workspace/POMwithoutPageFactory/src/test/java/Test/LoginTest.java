package Test;

import org.testng.annotations.Test;

import Pageobject.HomePage;
import Pageobject.LoginPage;
import Utilities.Base;

public class LoginTest extends Base {
  @Test(priority = 1)
  public void login() throws InterruptedException {
	  LoginPage ob=new LoginPage(driver);
	  ob.loginDetails();
	  
	  
  }
 
//  @Test(priority = 2)
//	  
//  public void home() throws InterruptedException {
//	  HomePage obj=new HomePage(driver);
//	  obj.flight();
//	  obj.trip();
//	  obj.passcount();
//	  obj.frmport();
//	  obj.month();
//	  obj.last();
//  }
}


package Test;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import Utilities.Base;

public class LoginTest extends Base {
  @Test
  public void log() {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.login();
	  
	  
	  
  }
}

package Test;

import org.testng.annotations.Test;

import Pageobject.HomePage;

public class HomeTest extends LoginTest{
  @Test
  public void home() throws InterruptedException {
	  HomePage obj=new HomePage(driver);
	  obj.flight();
	  obj.trip();
	  obj.passcount();
	  obj.frmport();
	  obj.month();
	  obj.last();
	  
  }
}

package POMProject.Script;

import org.testng.annotations.Test;

import POMProject.Page.HomePage;
import POMProject.utilities.PageUtilities;

public class HomePageTest extends LoginBase{
	
	
	
	HomePage ob;
	
	
  @Test(priority = 4)
  public void f() throws InterruptedException {
	  
	  ob=new HomePage(driver);
	  
	  ob.flight();
	 
	
			 
	  ob.passcount();
	  ob.port();
	 ob.movement();
	 ob.radio();
  }
}

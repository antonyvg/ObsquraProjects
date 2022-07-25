package Test;

import org.testng.annotations.Test;

import PageObject.Ebaylog;
import Utilities.EbayBase;

public class EbayTest extends EbayBase {
  @Test
  public void log() throws InterruptedException  {
	  Ebaylog ob=new Ebaylog(driver);
	  ob.login();
	  Thread.sleep(5000);
	  
	  
	  
  }
}

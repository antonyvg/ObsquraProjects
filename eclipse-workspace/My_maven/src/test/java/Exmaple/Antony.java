package Exmaple;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Antony {
  @Test
  public void antony() {
	  System.out.println("is");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("waht");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this");
  }

}

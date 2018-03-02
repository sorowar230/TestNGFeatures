package TestNG;

import org.testng.annotations.Test;

public class TestNGGroupTest {
	
  @Test(groups = {"smokeTest","functionalTest"})
  public void loginTest() {
	  System.out.println("logedin sucessfully.");
  }
  @Test(groups = {"functionalTest"})
  public void composeMail() {
	  System.out.println("mail sent..");
  }
  
}

package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test(groups = {"annotationsTest"})
public class TestngAnnotations {
  @Test
  public void testCase1() {
	  System.out.println("This is in Test case 1");
  }
  @Test(groups = {"testCase2"})
  public void testCase2() {
	  System.out.println("This is in Test Case 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is in beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is in afterMethod");	
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is in beforeClass");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("This is in afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is in beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is in afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is in beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is in afterSuite");
  }

}



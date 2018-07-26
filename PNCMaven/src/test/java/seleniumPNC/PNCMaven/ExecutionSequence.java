package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExecutionSequence {
  @Test
  public void f() {
	  
	  System.out.println("It's @test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("It's @BeforeMethod Annotation");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("It's @AfterMethod Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("It's @BeforeClass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("It's @AfterClass Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("It's @BeforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("It's @AfterTest Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("It's @BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("It's @AfterSuit Annotation");
  }

}

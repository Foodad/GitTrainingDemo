package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NavigationMethods {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
  }
  
  @Test
  public void f() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

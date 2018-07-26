package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.learnqtp.com/forums/Thread-Syntax-of-SystemUtil-Run");
	  String g=driver.getPageSource();
	  System.out.println(g);
  }
  @BeforeTest
  public void beforeTest() {
  driver=new FirefoxDriver();
  driver.manage().window().maximize();
  
  }

  @AfterTest
  public void afterTest() {
  }

}

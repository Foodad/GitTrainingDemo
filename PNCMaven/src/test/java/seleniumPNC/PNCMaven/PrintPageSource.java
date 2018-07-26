package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class PrintPageSource {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		driver.get("http://newtours.demoaut.com/");
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
	}

	@AfterTest
	public void afterTest() {
	}

}

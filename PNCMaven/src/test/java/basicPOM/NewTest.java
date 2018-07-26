package basicPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
	}

	@Test
	public void login() {
		LoginPageObjects.username(driver).sendKeys("tomsmith");//do not need to import LoginPageObjects as we r still working in same package.
		LoginPageObjects.password(driver).sendKeys("SuperSecretPassword!");
		LoginPageObjects.login(driver).click();

	}


	@AfterTest
	public void afterTest() {
	}

}

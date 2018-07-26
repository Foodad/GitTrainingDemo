package advancedPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class AdvancedPOMLogin {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
	}


	@Test
	public void f() {
		PageFactory.initElements(driver, AdvancedLoginpageObjects.class);

		AdvancedLoginpageObjects.user_name.sendKeys("tomsmith");
		AdvancedLoginpageObjects.pwd.sendKeys("SuperSecretPassword!");
		AdvancedLoginpageObjects.loginButton.click();
	}

	@AfterTest
	public void afterTest() {
	}

}

package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DemoEnabled {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void f() {
		driver.get("https://www.google.com/");
		WebElement link = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[2]/a"));

		boolean enabledLink = link.isEnabled();
		System.out.println("link is enabled?"+enabledLink);
		if(link.isEnabled()) {
			System.out.println("link is enabled");
			link.click();
		}else {
			System.out.println("link is not enabled");

		}

	}

	@AfterTest
	public void afterTest() {
	}

}

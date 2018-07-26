package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DemoPrintURL {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.FireFox.driver", "Resources\\geckodriver.exe");
		driver.manage().window().maximize();
	}


	@Test
	public void f() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(4000);
		String url= driver.getCurrentUrl();
		System.out.println("URL IS-"+url);
	}

	@AfterTest
	public void afterTest() {
	}

}

package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoTitle {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void verifyTitle() throws InterruptedException {
		String URL = "http://newtours.demoaut.com/";
		driver.get(URL);
		//driver.get("http://newtours.demoaut.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is:" +pageTitle);
		Assert.assertEquals(pageTitle, "Welcome: Mercury Tours", "Invalid page title");
		driver.findElement(By.linkText("REGISTER")).click();
		String pageTitle1 = driver.getTitle();
		System.out.println("Page Title is:" +pageTitle1);
		Assert.assertEquals(pageTitle1, "Register: Mercury Tours", "Invalid page title");
		//driver.findElement(By.partialLinkText("REGI")).click();
		Thread.sleep(3000);
		String resgistertitle = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(pageTitle1, "Register: Mercury Tours", "Invalid page title");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

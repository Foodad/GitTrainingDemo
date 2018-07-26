package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DemoExplicitWait {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("Priyakmr428");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span")).click();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement pwd= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/div[1]/div/div[1]/div/div[1]/input")));
		System.out.println(pwd);
		assertNotNull(pwd);

		pwd.sendKeys("neeraj1608");


	}

	@AfterTest
	public void afterTest() {
	}

}

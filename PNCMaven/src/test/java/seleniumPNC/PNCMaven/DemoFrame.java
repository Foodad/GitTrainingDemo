package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoFrame {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("html/body/div[2]/ul/li[6]/a")).click();
		System.out.println(driver.getTitle());

		driver.switchTo().defaultContent();


		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("html/body/div[1]/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		driver.findElement(By.xpath("html/body/div[4]/div[1]/ul/li/dl[1]/dd/a[1]")).click();;
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
	}

	@AfterTest
	public void afterTest() {
	}

}

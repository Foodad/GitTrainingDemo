package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoAlertWithOK {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();


	}

	@Test
	public void f() {
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		Alert alertbox = driver.switchTo().alert();
		String alertMessage = alertbox.getText();
		System.out.println("alert message is:"+alertMessage);
		alertbox.accept();
	}

	@AfterTest
	public void afterTest() {
	}

}

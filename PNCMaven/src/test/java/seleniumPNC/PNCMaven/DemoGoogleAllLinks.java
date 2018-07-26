package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoGoogleAllLinks {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println("count is:"+allLinks.size());

		//for(WebElement Link: allLinks) {
			//System.out.println(Link.getText() + "-" + Link.getAttribute("href"));
		//}
		for (int i=0; i<allLinks.size(); i++) {
		allLinks.get(i).click();
		System.out.println(allLinks.get(i).getText() + "-" + allLinks.get(i).getAttribute("href"));}

	}

	@AfterTest
	public void afterTest() {
	}

}

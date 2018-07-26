package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoDifferentTab {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/a/b")).click();
		driver.switchTo().defaultContent();
		Set<String> AllWindowHandles = driver.getWindowHandles(); 
		String window1 = (String) AllWindowHandles.toArray()[0];//parent
		System.out.println("window1 handle code:"+window1);
		String window2 = (String) AllWindowHandles.toArray()[1];//new
		System.out.println("window2 handle code:"+window2);
		driver.switchTo().window(window2);
		driver.findElement(By.id("fname")).sendKeys("Priya");
		driver.switchTo().window(window1);
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[1]/input[2]")).sendKeys("Kumari");
	}

	@AfterTest
	public void afterTest() {
	}

}

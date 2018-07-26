package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoWindowHandle {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		driver.findElement(By.id("helpbutton")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chatbutton")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("visitbutton")).click();
		driver.switchTo().defaultContent();

		Set<String> AllWindowHandles = driver.getWindowHandles(); 
		String window1 = (String) AllWindowHandles.toArray()[0];//parent
		System.out.println("window1 handle code:"+window1);
		String window2 = (String) AllWindowHandles.toArray()[1];//help
		System.out.println("window3 handle code:"+window2);
		String window3 = (String) AllWindowHandles.toArray()[2];//online chat
		System.out.println("window2 handle code:"+window3);
		String window4 = (String) AllWindowHandles.toArray()[3];// visit
		System.out.println("window3 handle code:"+window4);

		driver.switchTo().window(window3);
		driver.findElement(By.id("closebutton")).click();
		
		driver.switchTo().window(window3);
		driver.close();//will close window3 as we r there right now.
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

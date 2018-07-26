package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DemoButtonLevel {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void f() {

		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		WebElement button = driver.findElement(By.id("secondajaxbutton"));
		String caption = button.getAttribute("value");
		driver.findElement(By.id("secondajaxbutton")).getAttribute("value");
		System.out.println("Buttun Label is"+caption);
		button.click();

		WebElement checkbox = driver.findElement(By.name("selected(1234)"));

		if(!checkbox.isSelected()) {
			System.out.println("Checkbos is not selected");
		}else {
			System.out.println("checkbox is selected");}

		checkbox.click();

		if(checkbox.isSelected()) {
			System.out.println("Checkbos is selected");
		}else {
			System.out.println("checkbox is not selected");

		}

	}

	@AfterTest
	public void afterTest() {
	}

}

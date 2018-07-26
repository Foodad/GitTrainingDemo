package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class SearchSelenium {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		WebElement search = driver.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[3]/form/div/input[1]"));
		search.sendKeys("Selenium (software)");
		driver.findElement(By.id("searchButton"));

		WebElement link= driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul/li[4]/a"));
		if(link.isEnabled()) {
			System.out.println("Link Is enabled");
			link.click();
		}else {
			System.out.println("link is not enabled");
		}
		Assert.assertEquals(driver.getTitle(), "Create account - Wikipedia", "Page title matching");
		System.out.println(driver.getCurrentUrl());

		if(driver.getCurrentUrl().contains("wikipedia.org")) {
			System.out.println("internal link");
		}else {
			System.out.println("external link");
		}
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Selenium (software) - Wikipedia");
		System.out.println(driver.getCurrentUrl());
		WebElement seleniumLink= driver.findElement(By.xpath("html/body/div[3]/div[3]/div[4]/div/table[2]/tbody/tr[10]/td/span/a"));
		if(seleniumLink.isEnabled()){
			System.out.println("link is enabled");
			seleniumLink.click();
		}else {
			System.out.println("link is not enabled");

		}

		Assert.assertEquals(driver.getTitle(), "Selenium (software) - Wikipedia");
		System.out.println(driver.getCurrentUrl());

		if(driver.getCurrentUrl().contains("wikipedia.org")) {
			System.out.println("internal link");
		}else {
			System.out.println("external"); 
		}
	}


	@AfterTest
	public void afterTest() {
	}

}

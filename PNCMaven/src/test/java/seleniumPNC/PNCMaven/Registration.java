package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Registration {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
  }
  
  @Test
  public void f() {
	  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[1]/div[1]/input")).sendKeys("Priya");
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[2]/div/div/input[1]")).sendKeys("Kumari");
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[2]/div/div/input[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[3]/div/div/input[1]")).click();
		Select Country = new Select(driver.findElement(By.name("dropdown_7")));
		Country.selectByIndex(9);
		//Country.selectByValue("India");
		//Country.selectByVisibleText("India");
		Select Month = new Select(driver.findElement(By.name("date_8[date][mm]")));
		Month.selectByIndex(9);
		Select Day = new Select(driver.findElement(By.name("date_8[date][dd]")));
		Day.selectByIndex(9);
		Select Year = new Select(driver.findElement(By.name("date_8[date][yy]")));
		Year.selectByIndex(9);
		
		driver.findElement(By.cssSelector("#phone_9")).sendKeys("9199975783");
		
  }

  @AfterTest
  public void afterTest() {
  }

}

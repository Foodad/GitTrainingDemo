package basicPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	private static WebElement element;

	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.id("username"));
		return element;
	}

	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("password"));
		return element;
	}

	public static WebElement login(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[2]/div/div/form/button"));
		return element;
	}

}

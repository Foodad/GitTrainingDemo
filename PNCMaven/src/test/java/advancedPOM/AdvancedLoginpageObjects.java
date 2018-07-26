package advancedPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvancedLoginpageObjects {
	
	@FindBy(id="username")
	public static WebElement user_name;
	
	@FindBy(name="password")
	public static WebElement pwd;
	
	@FindBy(how = How.XPATH, using = "html/body/div[2]/div/div/form/button")
	public static WebElement loginButton;

}

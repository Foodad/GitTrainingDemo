package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemodataProvider {
	@Test(dataProvider = "dp")
	public void login(String username, String password) {
		System.out.println("username is"+username);
		System.out.println("password is"+password);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "mercury", "mercury" },
			new Object[] { "selenium", "basic" },
			new Object[] { "selenium1", "basic1" },
		};
	}

	@DataProvider
	public Object[][] Credentials() {
		return new Object[][] {
			new Object[] { "mercury1", "mercury1" },
			new Object[] { "selenium1", "basic1" },
			new Object[] { "selenium11", "basic11" },
		};
	}
}

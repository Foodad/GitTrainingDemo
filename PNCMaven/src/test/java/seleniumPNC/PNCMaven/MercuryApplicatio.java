package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;

public class MercuryApplicatio {
	@Test(priority=1)
	public void openBrowser() { 
		System.out.println("OpenBrowser");

	}
	@Test(priority=2)
	public void openURL() {  
		System.out.println("OpenURL");  
	}

	@Test(priority=3)
	public void login() {  
		System.out.println("Login"); 
	}

	@Test(priority=4)
	public void searchFlight() {  
		System.out.println("Searchflight"); 
	}

	@Test(priority=5, enabled=false)
	public void bookFlight() {  
		System.out.println("Bookflight");
	}

	@Test(priority=6)
	public void logout() {  
		System.out.println("logout");
	}

	@Test(priority=7)
	public void CloseBrowser() {  
		System.out.println("CloseBrowser");
	}
}

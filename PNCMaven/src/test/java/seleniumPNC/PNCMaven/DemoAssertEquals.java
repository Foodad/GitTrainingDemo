package seleniumPNC.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoAssertEquals {
	@Test
	public void test1() {
		System.out.println("test1 started");
		Assert.assertEquals(10, 10, "count matches");
		System.out.println("test1 completed");
	}

	@Test
	public void test2() {
		System.out.println("test2 started");
		Assert.assertEquals(10, 12, "count does not match");
		System.out.println("test2 completed");
	}


}

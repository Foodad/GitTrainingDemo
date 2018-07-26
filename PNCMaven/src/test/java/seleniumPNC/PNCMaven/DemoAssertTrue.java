package seleniumPNC.PNCMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertTrue {
	@Test
	public void test1() {
		String name = "Paratiksha";
		Assert.assertTrue(name.contains("ksha"));
	}

	@Test
	public void test2() {
		String course = "Selenium";
		Assert.assertTrue(course.contains("Ksha"), "does not contain");
	}
}

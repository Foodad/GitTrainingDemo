package testNGFeatures;

import org.testng.annotations.Test;

public class DemoGroup {
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("test1-smoke testing");
	}

	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("test2-regression testing");
	}

	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("test3-smoke testing");
	}

	@Test(groups= {"regression"})
	public void test4() {
		System.out.println("test4-regression testing"); 
	}

	@Test(groups= {"smoke", "regression"})
	public void test5() {
		System.out.println("test5-regression and smoke testing"); 
	}
}

package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Priority {
	@Test(groups={"Smoke"})
	public void test() {
		System.out.println("Test first Annotation");
	}
	@BeforeMethod(timeOut=4000)
	public void beforeMethod() {
		System.out.println("Before Method Test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Test");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after Class Test");
	}
	@BeforeTest(groups={"Smoke"})
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite Test30");
	}
	@Test(enabled=false)
	public void apiMobile() {
		System.out.println("API Mobile Testing");
	}
	


}

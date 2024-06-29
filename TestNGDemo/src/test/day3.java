package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void testCase() {
		System.out.println("Test Caes");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Test Cases");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Test Cases");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Test Cases");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class Test Cases");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Cases");
	}

	@AfterClass
	public void afterTest() {
		System.out.println("After Test Cases");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Test Cases");
	}

	@AfterClass
	public void afterSuite() {
		System.out.println("After  Suite Test Cases");
	}

}

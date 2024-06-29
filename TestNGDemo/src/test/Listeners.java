package test;

import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestNGMethod;

public abstract class Listeners implements ITestResult {
	
	public void onTestStart(ITestResult result) {
		System.out.println(result);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case excute Sucessfully in listeners class");

	}

	public void onTestFailure(ITestResult result) {

	}

	public void onTestSkipped(ITestResult result) {

	}
	public void onStart(ITestContext context) {
		
	}

}

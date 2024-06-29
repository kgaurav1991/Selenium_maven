package test;

import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void webLoginCarLoan() {
		System.out.println("Web Login Car Loan");
	}
	
	@Test(groups={"Smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test
	public void loginAplCarLoan() {
		System.out.println("Login API Car Loan");
	}
	
	

}

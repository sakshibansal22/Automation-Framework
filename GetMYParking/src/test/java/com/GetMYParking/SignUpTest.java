package com.GetMYParking;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignUpTest extends DriverFactory{
	private static Logger log = LogManager.getLogger(SignUpTest.class);
	
	@Test
	@Parameters({ "Username", "Password" })
	public static void  testSignUp(String Username , String Password ) {
		log.info("Sign Up test .... starts");
		
		//Switch to Sign Up Tab 
		SignUpPage.clickOnSignUpTab();
		
		//Enter Email ID 
		SignInPage.enterEmailID(Username);
		
		//Enter Password 
		SignInPage.enterPassword(Password);
		
		//Confirm Password
		SignUpPage.confirmPassword(Password);
		
		//Click on Login Confirm Buttton 
	
		SignUpPage.clickOnSignUpButton();
		
		log.info("Sign UP test .... ends");
	}

}

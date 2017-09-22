package com.GetMYParking;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignInTest extends DriverFactory{
	private static Logger log = LogManager.getLogger(DriverFactory.class);
	
	@Test
	@Parameters({ "Username", "Password" })
	public static void  testSignIN(String Username , String Password ) {
		log.info("Sign In test .... starts");
		
		
		//Enter Email ID 
		SignInPage.enterEmailID(Username);
		
		//Enter Password 
		SignInPage.enterPassword(Password);
		
		//Click on Login Confirm Buttton 
		
		SignInPage.clickOnLoginConfirmButton();
		
		log.info("Sign In test .... ends");
	}
	

}

package com.GetMYParking;

import org.openqa.selenium.By;

public class SignUpPage extends DriverFactory{
	
	public static void clickOnSignUpTab() {
		
		driver.findElement(By.id(Constant.SIGNIN_TAB));
	}
	
	public static void enterEmailID(String Username) {
		driver.findElement(By.id(Constant.EMAIL_ID)).click();
		driver.findElement(By.id(Constant.EMAIL_ID)).sendKeys(Username);
		driver.hideKeyboard();
	}
	
	public static void enterPassword(String Password) {
		driver.findElement(By.id(Constant.PASSWORD_ID)).click();
		driver.findElement(By.id(Constant.PASSWORD_ID)).sendKeys(Password);
		driver.hideKeyboard();
	}
	public static void confirmPassword(String Password) {
		driver.findElement(By.id(Constant.CONFIRMPWD_ID)).click();
		driver.findElement(By.id(Constant.CONFIRMPWD_ID)).sendKeys(Password);
		driver.hideKeyboard();
	}
	
	public static void clickOnSignUpButton() {
		driver.findElement(By.id(Constant.LOGIN_BTN)).click();
	
	}

}

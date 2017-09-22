package com.GetMYParking;

import org.openqa.selenium.By;

public class SignInPage extends DriverFactory {

	

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

	public static void clickOnLoginConfirmButton() {
		driver.findElement(By.id(Constant.LOGIN_BTN)).click();
	}
	
	
}

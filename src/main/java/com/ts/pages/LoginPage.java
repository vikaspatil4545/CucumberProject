package com.ts.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.ts.utils.Constant;

public class LoginPage  {
	
	private static final Logger LOG = Logger.getLogger(LoginPage.class);

	By mobileNoTxt = By.cssSelector("input#exampleuser1");
	By passwordTxt = By.cssSelector("input#exampleInputPassword1");
	By loginBtn = By.cssSelector("button.box-shadow");
	
//
	public void enterMobileno(String mobileNumber) {
		Constant.driver.findElement(mobileNoTxt).sendKeys(mobileNumber);

	}
 
	public void enterPassword(String password) {

		Constant.driver.findElement(passwordTxt).sendKeys(password);
	}
	
	public void clickloginBtn() {
		Constant.driver.findElement(loginBtn).click();
		
	}
	public void titlepage()
	{
		String mess = "Bhiman Group";
		String title =  Constant.driver.getTitle();
		Assert.assertEquals(title, mess);
		LOG.info("Login successfully");
	}
}
 
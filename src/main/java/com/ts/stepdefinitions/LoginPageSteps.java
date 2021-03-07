package com.ts.stepdefinitions;

import com.ts.pages.LoginPage;

import io.cucumber.java.en.Given;


public class LoginPageSteps {
	@Given("User is logged in to the appliction")
	public void loginApplicatin() {
		
		LoginPage login = new LoginPage();
		login.enterMobileno("1234567890");
		login.enterPassword("admin");
		login.clickloginBtn();
		
	}

}

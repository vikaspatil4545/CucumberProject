package com.ts.stepdefinitions;

import com.ts.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageAppSteps {

	LoginPage login = new LoginPage();

	@Given("User enters {string} as username")
	public void user_enters_as_username(String mobno) {
		login.enterMobileno(mobno);
	}

	@Given("User enters {string} as password")
	public void user_enters_as_password(String pass) {
		login.enterPassword(pass);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		login.clickloginBtn();
	}

	@Then("verify tital of page")
	public void verify_tital_of_page() {
		login.titlepage();
	}

}

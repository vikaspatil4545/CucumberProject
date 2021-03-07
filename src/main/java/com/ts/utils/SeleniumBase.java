package com.ts.utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase {

	@Before
	public void launchApplication() throws IOException {

		switch (Config.getBrowser()) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver();
			Constant.driver.manage().window().maximize();
			break;
		case "Firefox":
			break;
		default:
			break;
		}
		Constant.driver.get(Config.getAppUrl());

	}

	@After
	public void teardown() {
		Constant.driver.quit();
	}
}


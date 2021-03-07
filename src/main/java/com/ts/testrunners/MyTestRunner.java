package com.ts.testrunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/resources/features", glue="src.main.java.com.ts.stepdefinitions.LoginPageAppSteps.java")

public class MyTestRunner extends AbstractTestNGCucumberTests {

}

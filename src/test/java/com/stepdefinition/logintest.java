package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.login_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logintest extends login_page {
	WebDriver driver;
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
		launch_browser();
	}

	@When("^the user opens Swaglabs homepage$")
	public void the_user_opens_Swaglabs_homepage() throws Throwable {
		Launch_app();
	    
	}
	
	@When("^the user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_valid_username_and_password(String username,String password) throws Throwable {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		login_button();

	}

	@Then("^Assert if the product_label is displayed$")
	public void assert_if_the_product_label_is_displayed() throws Throwable {
		assert_product();
	}

}

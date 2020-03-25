package com.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.pages.HighToLow_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HighToLow extends HighToLow_Page {
	WebDriver driver;
	@Given("^LAUnching the chrome browser$")
	public void launching_the_chrome_browser4() {
		launching_browser();
	}

	@When("^LAUnching the application$")
	public void launching_the_application4() {
		launching_application();
	}

	@Then("^click on Name price high to low$")
	public void click_on_Name_price_high_to_low() throws InterruptedException {
		select_HighToLow();
	}

	@Then("^Assert if the two item prices are in descending order$")
	public void assert_if_the_two_item_prices_are_in_descending_order() throws InterruptedException {
		Price_order();

	}

}

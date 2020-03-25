package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.pages.LowToHigh_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LowToHigh extends LowToHigh_Page {
	WebDriver driver;
	@Given("^LAunching the chrome browser$")
	public void launching_the_chrome_browser3() {
		launching_browser();
	}

	@When("^LAunching the application$")
	public void launching_the_application3() {
		launching_application();
			}
	@Then("^click on Name price low to high$")
	public void click_on_Name_price_low_to_high() throws Throwable {
		select_LowToHigh();
		}

	@Then("^compare the first two item prices$")
	public void compare_the_first_two_item_prices() {
		comparing_Two_Prices();
			 
		}

	@Then("^Assert if the two item prices are in ascending order$")
	public void assert_if_the_two_item_prices_are_in_ascending_order() {
		increase_order();
	}

}

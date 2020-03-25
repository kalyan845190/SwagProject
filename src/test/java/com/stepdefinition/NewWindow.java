package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pages.NewWindow_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewWindow extends NewWindow_page{
WebDriver driver;
@Given("^LAUNCHING THE browser$")
public void launching_THE_browser() {
	Launch_browser();
}

@When("^LAUNCHING THE Application$")
public void launching_THE_Application() {
	Launch_App();
}

@Then("^click on resources$")
public void click_on_resources() {
}

@Then("^click on selenium$")
public void click_on_selenium() {
	click_selenium();
	
}

@Then("^Assert if it is Switching to the new tab$")
public void assert_if_it_is_Switching_to_the_new_tab() {
	Assert_newtab();
	
}
}

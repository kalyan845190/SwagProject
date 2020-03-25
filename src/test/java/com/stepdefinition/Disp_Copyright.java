package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.Disp_copyright_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Disp_Copyright extends Disp_copyright_Page {
WebDriver driver;
	@Given("^LAUNCHING THE Browser$")
	public void launching_THE_Browser() {
		Launch_browser();
	}

	@When("^LAUNCHING THE APPlication$")
	public void launching_THE_APPlication() {
		Launch_App();
	}

	@When("^Assert if it is displaying the copyright in the footer section$")
	public void assert_if_it_is_displaying_the_copyright_in_the_footer_section() {
		Assert_copyright();
	}

}

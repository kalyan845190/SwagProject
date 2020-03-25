package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disp_copyright_Page {
	WebDriver driver;
	public void Launch_browser() {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	
	}
	public void Launch_App() {
		driver.get("https://saucelabs.com/");

	}
	public void Assert_copyright() {
		String copyright =driver.findElement(By.xpath("//div[@class='copyright']")).getText();
		Assert.assertEquals("© 2020 Sauce Labs Inc., all rights reserved. SAUCE and SAUCE LABS are registered trademarks owned by Sauce Labs Inc. in the United States, EU, and may be registered in other jurisdictions.", copyright);
driver.close();
	}

}

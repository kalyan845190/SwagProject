package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindow_page {
	WebDriver driver;
	public void Launch_browser() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	public void Launch_App() {
		driver.get("https://saucelabs.com/");
	
	}
	public void click_selenium() {
		driver.findElement(By.linkText("Resources")).click();
		WebElement sel=driver.findElement(By.linkText("Selenium"));
		Actions action =new Actions(driver);
		action.moveToElement(sel).click().build().perform();
	}
	public void Assert_newtab() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		Assert.assertEquals("https://saucelabs.com/", Url);
		System.out.println("It is navigating to the selenium homepage");
		driver.close();
	}

}

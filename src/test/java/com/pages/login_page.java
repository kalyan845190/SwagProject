package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {
	WebDriver driver;
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	public void Launch_app() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void login_button() {
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

	}
	public void assert_product() {
		String actual =	driver.findElement(By.xpath("//div[text()='Products']")).getText();
		Assert.assertEquals("Products", actual);	
		System.out.println(" Actual and expected are same");
		driver.close();
	}

}

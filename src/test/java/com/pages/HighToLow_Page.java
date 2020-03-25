package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HighToLow_Page extends login_page{
	WebDriver driver;
	public void launching_browser() {
		launch_browser();
	}

	public void launching_application() {
		Launch_app();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		login_button();
			
	}
	public void select_HighToLow() throws InterruptedException {
		
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		driver.findElement(By.xpath("//option[@value='hilo']")).click();
		Thread.sleep(3000);
	}

	public void comparing_Two_Prices() throws InterruptedException {
	String price3=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/div")).getText();
	System.out.println(price3);					
	String price3sub=price3.substring(1,5);
	double n3=Double.parseDouble(price3sub);
	
	String price4=driver.findElement(By.xpath("//div[text()='29.99']")).getText();
	System.out.println(price4);
	String price4sub=price4.substring(1,5);
	double n4=Double.parseDouble(price4sub);
	Assert.assertTrue(n3>n4);
	System.out.println("the prices are high to low");
	Thread.sleep(2000);
	driver.close();
	}

	public void Price_order() {
		System.out.println("It is in descending order ");
		  driver.close();
	}

}

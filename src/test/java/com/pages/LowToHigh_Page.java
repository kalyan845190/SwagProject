package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class LowToHigh_Page extends login_page{
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
	public void select_LowToHigh() throws InterruptedException {
		
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		Actions at=new Actions(driver);
		at.sendKeys(Keys.DOWN);
		at.sendKeys(Keys.DOWN);
		at.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	public void comparing_Two_Prices() {
		String price1=driver.findElement(By.xpath("//div[text()='7.99']")).getText();
		System.out.println(price1);
		 String price1sub=price1.substring(1,4); 
		 double	n1=Double.parseDouble(price1sub);
		 
		
		String price2=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/div")).getText();
		System.out.println(price2);
		
		  String price2sub=price2.substring(1,4); 
		  double  n2=Double.parseDouble(price2sub);
		  Assert.assertTrue(n1<n2);
				 
		}

	public void increase_order() {
		System.out.println("It is in ascending order ");
		  driver.close();
	}
}

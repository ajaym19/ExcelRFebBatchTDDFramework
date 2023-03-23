package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.ExcelRBase;

public class LoginPage extends ExcelRBase{

	public String getTitle() {
		return driver.getTitle();
	}
	
	public DashboardPage login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}
	
	public boolean forgotPasswordLink() {
		return driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).isDisplayed();
	}
}

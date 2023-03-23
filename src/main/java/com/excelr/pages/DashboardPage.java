package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.ExcelRBase;

public class DashboardPage extends ExcelRBase{

	public boolean gettimeWorkSectionPresent() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
}

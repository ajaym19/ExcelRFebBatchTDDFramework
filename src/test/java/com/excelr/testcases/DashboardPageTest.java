package com.excelr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.DashboardPage;
import com.excelr.pages.LoginPage;

public class DashboardPageTest {

	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void timeatWorkSection() {
		dp = lp.login();
		Assert.assertTrue(dp.gettimeWorkSectionPresent());
		
	}

	@AfterMethod
	public void closeBrowserSetup() {
		lp.teardown();
	}
}

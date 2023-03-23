package com.excelr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.LoginPage;

public class LoginPageTest {

	LoginPage lp;
	

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateTitleTest() {
		String acttitle = lp.getTitle();
		String exptitle = "OrangeHRM";
		Assert.assertEquals(acttitle, exptitle);
	}

	@Test
	public void validateLoginTest() {
		lp.login();
	}

	@Test
	public void forgotPasswordLinkDisplayed() {
		Assert.assertTrue(lp.forgotPasswordLink());
	}

	@AfterMethod
	public void closeBrowserSetup() {
		lp.teardown();
	}
}

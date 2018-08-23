package com.aut.cura;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aut.cura.appmodules.LLogIn_Action;
import com.aut.cura.appmodules.Logout_Action;
import com.aut.cura.pageObjects.BasesClass;
import com.aut.cura.pageObjects.Home_Page;
import com.aut.cura.pageObjects.LandingPage;
import com.aut.cura.utilities.Utils;

public class TestLoginLogout_Positive {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {

		driver = Utils.OpenBrowser("Mozilla");
		new BasesClass(driver);
	}

	@Test
	public void testMethod() throws Exception {

		System.out.println("Starting Test");
		LandingPage.lnk_menu().click();
		LandingPage.lnk_Login().click();
		LLogIn_Action.execute("John Doe", "ThisIsNotAPassword");
		Utils.waitForElement(Home_Page.lnk_menu());
		Logout_Action.execute();

		System.out.println("EndingTest");

	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}
}

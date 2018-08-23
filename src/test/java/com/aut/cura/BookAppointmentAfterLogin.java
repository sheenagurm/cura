package com.aut.cura;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aut.cura.appmodules.LLogIn_Action;
import com.aut.cura.pageObjects.BasesClass;
import com.aut.cura.pageObjects.LandingPage;
import com.aut.cura.utilities.Utils;

public class BookAppointmentAfterLogin {
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

		System.out.println("EndingTest");

	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}
}

package com.aut.cura;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aut.cura.appmodules.BookApointment_Action;
import com.aut.cura.appmodules.LLogIn_Action;
import com.aut.cura.appmodules.Logout_Action;
import com.aut.cura.pageObjects.ApptSummary_Page;
import com.aut.cura.pageObjects.BasesClass;
import com.aut.cura.pageObjects.CreateApointment_Page;
import com.aut.cura.pageObjects.Home_Page;
import com.aut.cura.pageObjects.LandingPage;
import com.aut.cura.pageObjects.Login_Page;
import com.aut.cura.utilities.Utils;

public class BookAppointmentWithoutLogin {
	public WebDriver driver;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");

	// @Parameters({ "browser" })
	@BeforeMethod
	public void beforeMethod() throws Exception {

		driver = Utils.OpenBrowser("firefox");
		new BasesClass(driver);
	}

	@Test(dataProvider = "data")
	public void testMethod_bookAppintmentWithHospitalReadmission(String usrnm, String passwrd, String facility, String visitDate,
			String appointmentCmnt, String heathcareProg) throws Exception {

		System.out.println("Starting Test");
		LandingPage.btn_makeAppt().click();
		Utils.waitForElement(Login_Page.txtbx_Password());
		LLogIn_Action.execute(usrnm, passwrd);
		Utils.waitForElement(Home_Page.lnk_menu());
		Utils.waitForElement(CreateApointment_Page.btn_bookAppointment());
		System.out.println("Book Appointment button is visible");
		BookApointment_Action.execute(facility, heathcareProg, visitDate, appointmentCmnt);
		System.out.println("Appointment booked");
Utils.waitForElement(ApptSummary_Page.text_apptConfirmed());
		ApptSummary_Page.btn_GoToHomepage().click();
Utils.waitForElement(Home_Page.btn_makeAppt());
		Logout_Action.execute();

		System.out.println("EndingTest");

	}

	@DataProvider(name = "data")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] {
				{ "John Doe", "ThisIsNotAPassword", "Tokyo CURA Healthcare Center",
						LocalDateTime.now().format(formatter), RandomStringUtils.randomAlphabetic(6), "Medicare" }};
	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}
}

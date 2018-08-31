package com.aut.cura.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CreateApointment_Page extends BasesClass {
	public CreateApointment_Page(WebDriver driver) {
		super(driver);

	}

	private static WebElement element = null;
	

	public static void list_facility(String facility) throws Exception {
		 element = null;
		try {
			Select element= new Select(driver.findElement(By.id("combo_facility")));
			element.selectByVisibleText(facility);
			System.out.println("Facility List is found on the Login Page");
		} catch (Exception e) {
			System.out.println("Facility List  is not found on the Login Page");
			throw (e);
		}
		
	}

	public static WebElement chk_readmission() throws Exception {
		try {
			element = driver.findElement(By.id("chk_hospotal_readmission"));
			System.out.println("Hospital Readmission checkbox is found on the Login page");
		} catch (Exception e) {
			System.out.println("Hospital Readmission checkbox is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement radio_medicare() throws Exception {
		try {
			element = driver.findElement(By.id("radio_program_medicare"));
		
			System.out.println("Medicare radio is found on the Login page");
		} catch (Exception e) {
			System.out.println("Medicare radio is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement radio_medicaid() throws Exception {
		try {
			element = driver.findElement(By.id("radio_program_medicaid"));
			System.out.println("medicaid radio is found on the Login page");
		} catch (Exception e) {
			System.out.println("medicaid radio is not found on the Login Page");
			throw (e);
		}
		return element;
	}
	public static WebElement radio_None() throws Exception {
		try {
			element = driver.findElement(By.id("radio_program_none"));
			System.out.println("None radio is found on the Login page");
		} catch (Exception e) {
			System.out.println("None  radio is not found on the Login Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_visitDate() throws Exception {
		try {
			element = driver.findElement(By.id("txt_visit_date"));
			System.out.println("Visit date textbox is found on the Login page");
		} catch (Exception e) {
			System.out.println("Visit date textbox is not found on the Login Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_comment() throws Exception {
		try {
			element = driver.findElement(By.id("txt_comment"));
			System.out.println("Comment radio is found on the Login page");
		} catch (Exception e) {
			System.out.println("Comment radio is not found on the Login Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_bookAppointment() throws Exception {
		try {
			element = driver.findElement(By.id("btn-book-appointment"));
			System.out.println("Book Appointment button is found on the Login page");
		} catch (Exception e) {
			System.out.println("Book Appointment button is not found on the Login Page");
			throw (e);
		}
		return element;
	}
}

package com.aut.cura.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateApointment_Page extends BasesClass {
	public CreateApointment_Page(WebDriver driver) {
		super(driver);

	}

	private static WebElement element = null;

	public static WebElement list_facility() throws Exception {
		try {
			element = driver.findElement(By.id("combo_facility"));

			System.out.println("Facility List is found on the Login Page");
		} catch (Exception e) {
			System.out.println("Facility List  is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chk_readmission() throws Exception {
		try {
			element = driver.findElement(By.id("chk_hospotal_readmission'"));
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

	public static WebElement text_ErrorMsgLogin() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					".//*[contains(text(),'Login failed! Please ensure the username and password are valid.')]"));
			System.out.println("Error is found on the Login Page");
		} catch (Exception e) {
			System.out.println("Error is not found on the Login Page");
			throw (e);
		}
		return element;
	}

}

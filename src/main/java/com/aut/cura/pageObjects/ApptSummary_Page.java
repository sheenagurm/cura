package com.aut.cura.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ApptSummary_Page extends BasesClass {
	public ApptSummary_Page(WebDriver driver) {
		super(driver);

	}

	private static WebElement element = null;
	

	
	public static WebElement btn_GoToHomepage() throws Exception {
		try {
			element = driver.findElement(By.id("summary"));
			System.out.println("Go to HomePage button is found on the Login page");
		} catch (Exception e) {
			System.out.println("Go to HomePage button is not found on the Login Page");
			throw (e);
		}
		return element;
		
	}
	public static WebElement text_apptConfirmed() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[contains(text(),'Please be informed that your appointment has been booked as following:')]"));
			System.out.println("Go to HomePage button is found on the Login page");
		} catch (Exception e) {
			System.out.println("Go to HomePage button is not found on the Login Page");
			throw (e);
		}
		return element;
		
	}
}

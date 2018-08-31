package com.aut.cura.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasesClass {

	private static WebElement element = null;

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_menu() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='menu-toggle']"));
			System.out.println("Menu link is found on the Home Page");
		} catch (Exception e) {
			System.out.println("Menu link is not found on the Home Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Login() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='sidebar-wrapper']/ul/li[3]/a"));

			System.out.println("" + "Login link is found on the Home Page");
		} catch (Exception e) {
			System.out.println("Login link is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_makeAppt() throws Exception {
		try {
			element = driver.findElement(By.id("btn-make-appointment"));

			System.out.println("Make Appt btn is found on the Home Page");
		} catch (Exception e) {
			System.out.println("Make Appt btn is not found on the Home Page");
			throw (e);
		}
		return element;
	}
}

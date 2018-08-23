package com.aut.cura.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page extends BasesClass {
	public Login_Page(WebDriver driver) {
		super(driver);

	}

	private static WebElement element = null;

	public static WebElement txtbx_UserName() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='txt-username']"));

			System.out.println("Username text box is found on the Login Page");
		} catch (Exception e) {
			System.out.println("UserName text box is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txtbx_Password() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='txt-password']"));
			System.out.println("Password text box is found on the Login page");
		} catch (Exception e) {
			System.out.println("Password text box is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_LogIn() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='btn-login']"));
			System.out.println("Sign In button is found on the Login page");
		} catch (Exception e) {
			System.out.println("Sign In button is not found on the Login Page");
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

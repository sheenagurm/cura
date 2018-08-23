package com.aut.cura.pageObjects;

import org.openqa.selenium.WebDriver;

public class BasesClass {
	public static WebDriver driver;
	public static boolean bResult;
	public  BasesClass(WebDriver driver){
		BasesClass.driver = driver;
		BasesClass.bResult = true;
	}

}

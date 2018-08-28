package com.aut.cura;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aut.cura.appmodules.LLogIn_Action;
import com.aut.cura.appmodules.Logout_Action;
import com.aut.cura.pageObjects.BasesClass;
import com.aut.cura.pageObjects.Home_Page;
import com.aut.cura.pageObjects.LandingPage;
import com.aut.cura.pageObjects.Login_Page;
import com.aut.cura.utilities.Utils;

public class Test_Login {
	public WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod
	public void beforeMethod(String browser) throws Exception {

		driver = Utils.OpenBrowser(browser);
		new BasesClass(driver);
	}

	@Test(dataProvider="login")
	public void testMethod_loginPositive(String usrnm,String passwrd) throws Exception {

		System.out.println("Starting Test");
		LandingPage.lnk_menu().click();
		LandingPage.lnk_Login().click();
		LLogIn_Action.execute(usrnm, passwrd);
		Utils.waitForElement(Home_Page.lnk_menu());
		Logout_Action.execute();

		System.out.println("EndingTest");

	}
	@Test(dataProvider="login")
	public void testMethod_loginNegative(String usrnm,String passwrd) throws Exception {

		System.out.println("Starting Test");
		Utils.waitForElement(LandingPage.lnk_menu());
		LandingPage.lnk_menu().click();
		LandingPage.lnk_Login().click();
		LLogIn_Action.execute(usrnm, passwrd);
		Login_Page.text_ErrorMsgLogin().isDisplayed();
		System.out.println("EndingTest");

	}
	 @DataProvider(name="login")
	    public Object[][] getDataFromDataprovider(Method m){
	        if(m.getName().equalsIgnoreCase("testMethod_loginPositive")){
	        return new Object[][] {
	                { "John Doe", "ThisIsNotAPassword" }
	               
	            };}
	        else{
	        return new Object[][] {
	                { "John Doe", "ThisIsNotAPaord"  }
	            };}}  
	@AfterMethod
	public void afterMethod() {

		driver.close();
	}
}

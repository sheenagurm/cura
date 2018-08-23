package com.aut.cura;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import  com.aut.cura.appmodules.LLogIn_Action;
import  com.aut.cura.pageObjects.BasesClass;
import com.aut.cura.pageObjects.Login_Page;
import  com.aut.cura.utilities.Utils;
import com.aut.cura.pageObjects.LandingPage;
import com.aut.cura.pageObjects.Login_Page;

public class TestLoginLogout_Negative {
	public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  
		driver = Utils.OpenBrowser("Mozilla");
		new BaseClass(driver);  
        }
  
 @Test
  public void testMethod() throws Exception  {
	

	 System.out.println("Starting Test");
Utils.waitForElement(LandingPage.lnk_menu());
		LandingPage.lnk_menu().click();
		LandingPage.lnk_Login().click();
		 LLogIn_Action.execute("John Doe", "ThisIsNotrd");
		Login_Page.text_ErrorMsgLogin().isDisplayed();
	 System.out.println("EndingTest");
		
  }
 

		
  @AfterMethod
  public void afterMethod() {
	  
	    driver.close();
  		}
}

package com.aut.cura;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import  com.aut.LinkedIn.appmodules.LLogIn_Action;
import  com.aut.LinkedIn.pageObjects.BaseClass;
import com.aut.LinkedIn.pageObjects.LLogin_Page;
import  com.aut.Linkedln.utilities.Utils;
import com.aut.cura.pageObjects.LandingPage;
import com.aut.cura.pageObjects.Login_Page;

public class BookAppointmentAfterLogin {
	public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  
		driver = Utils.OpenBrowser("Mozilla");
		new BaseClass(driver);  
        }
  
 @Test
  public void testMethod() throws Exception  {
	

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

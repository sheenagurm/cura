package com.aut.cura.appmodules;
import org.testng.Reporter;

import  com.aut.cura.pageObjects.BasesClass;

import com.aut.cura.pageObjects.Login_Page;
import  com.aut.cura.utilities.Utils;
     
    // This is called Modularization, when we club series of actions in to one Module
	// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
    public class LLogIn_Action {
    	
        public static void execute(String sUserName, String sPassword) throws Exception{
        	
        	
            Login_Page.txtbx_UserName().sendKeys(sUserName);
            // Printing the logs for what we have just performed
            System.out.println(sUserName+" is entered in UserName text box" );
            
           
            Login_Page.txtbx_Password().sendKeys(sPassword);
            System.out.println(sPassword+" is entered in Password text box" );
            
            Login_Page.btn_LogIn().click();
            System.out.println("Click action is performed on Submit button");
            
        }
    }

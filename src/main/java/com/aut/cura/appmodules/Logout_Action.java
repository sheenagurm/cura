package com.aut.cura.appmodules;

import com.aut.cura.pageObjects.Home_Page;
import com.aut.cura.utilities.Utils;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
public class Logout_Action {

	public static void execute() throws Exception {
		Home_Page.lnk_menu().click();
		Utils.waitForElement(Home_Page.lnk_Logout());
		Home_Page.lnk_Logout().click();
		System.out.println("User logged out.Log out action executed");

	}
}

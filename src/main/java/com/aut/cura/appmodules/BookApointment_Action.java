package com.aut.cura.appmodules;

import com.aut.cura.pageObjects.CreateApointment_Page;
import com.aut.cura.pageObjects.Login_Page;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
public class BookApointment_Action {

	public static void execute(String facility,String healthCareProgram, String visitDate, String appointmentCmnt) throws Exception {

		CreateApointment_Page.list_facility(facility);
		CreateApointment_Page.chk_readmission().click();
		if(healthCareProgram.equalsIgnoreCase("medicare")) {
			CreateApointment_Page.radio_medicare().click();
			
		}
		if (healthCareProgram.equalsIgnoreCase("medicaid")) {
			CreateApointment_Page.radio_medicaid().click();
		} else {
			CreateApointment_Page.radio_None().click();
		}
		
		CreateApointment_Page.txt_visitDate().sendKeys(visitDate);
		CreateApointment_Page.txt_comment().sendKeys(appointmentCmnt);;
		CreateApointment_Page.btn_bookAppointment().click();

	}
}

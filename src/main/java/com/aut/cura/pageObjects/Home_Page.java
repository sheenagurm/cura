package com.aut.cura.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aut.cura.pageObjects.BasesClass;

public class Home_Page extends BasesClass {
    public Home_Page(WebDriver driver) {
		super(driver);
		
	}

	private static WebElement element =null; 
	
	 public static WebElement lnk_menu() throws Exception{
         try{ 
	        	 element = driver.findElement(By.xpath(".//*[@id='menu-toggle']"));
	             System.out.println("Menu link is found on the Home Page");
         }catch (Exception e){
        		System.out.println("Menu link is not found on the Home Page");
        		throw(e);
        		}
        	return element;
     }
	 public static WebElement lnk_Logout() throws Exception{
         try{
	        	element = driver.findElement(By.xpath(".//a[contains(text(),'Logout')]"));
	        
	            System.out.println(""
	            		+ "Logout link is found on the Home Page");
         }catch (Exception e){
         	System.out.println("Logout link is not found on the Home Page");
        		throw(e);
        		}
        	return element;
     }
   
    
}

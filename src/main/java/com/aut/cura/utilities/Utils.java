package com.aut.cura.utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public static WebDriver driver = null;
	public static String applink = "https://katalon-demo-cura.herokuapp.com/";

	public static WebDriver OpenBrowser(String iTestCaseRow) throws Exception {
		String sBrowserName;
		try {
			sBrowserName = iTestCaseRow;
			if (sBrowserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				System.out.println("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.println("Implicit wait applied on the driver for 10 seconds");
				driver.get(applink);
				System.out.println("Web application launched successfully");
			} else {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("New Chrome driver instantiated");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.println("Implicit wait applied on the driver for 10 seconds");
				driver.get(applink);
				System.out.println("Web application launched successfully");
			}
		}

		catch (Exception e) {
			System.out.println("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
		}
		return driver;
	}

	public static String getTestCaseName(String sTestCase) throws Exception {
		String value = sTestCase;
		try {
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");
			value = value.substring(posi + 1);
			return value;
		} catch (Exception e) {
			System.out.println("Class Utils | Method getTestCaseName | Exception desc : " + e.getMessage());
			throw (e);
		}
	}

	public static void mouseHoverAction(WebElement mainElement, String subElement) {

		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		if (subElement.equals("Accessories")) {
			action.moveToElement(driver.findElement(By.linkText("Accessories")));
			System.out.println("Accessories link is found under Product Category");
		}
		if (subElement.equals("iMacs")) {
			action.moveToElement(driver.findElement(By.linkText("iMacs")));
			System.out.println("iMacs link is found under Product Category");
		}
		if (subElement.equals("iPads")) {
			action.moveToElement(driver.findElement(By.linkText("iPads")));
			System.out.println("iPads link is found under Product Category");
		}
		if (subElement.equals("iPhones")) {
			action.moveToElement(driver.findElement(By.linkText("iPhones")));
			System.out.println("iPhones link is found under Product Category");
		}
		action.click();
		action.perform();
		System.out.println("Click action is performed on the selected Product Type");
	}

	public static void waitForElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName
			// +".jpg"));
		} catch (Exception e) {
			System.out.println("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "
					+ e.getMessage());
			throw new Exception();
		}
	}

}

package com.zero.us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverEngine {

	static WebDriver driver;
	
	public static void LaunchUrl(String url)
	{
			
		driver.get(url);
		
	
	}	
}

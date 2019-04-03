package com.zero.us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import modules.LoginAutomationScript;
import modules.AddAnotherOrgTC10;
import modules.CreateAccountModule;
import modules.Myzero;
import modules.ProfileModule;
import modules.uploadimage;




public class DriverEngine extends XeroReusableMethod  {

	public static void main(String[] args) throws InterruptedException 
	{
		
//	LoginAutomationScript a=new LoginAutomationScript();		
//	a.TC1_Loginpage();
//	a.TC1B_IncorrectPassword();
//	a.TC1C_IncorrectEmail();
//	a.TC1D_ForgotPassword();
//	a.TC4();
	 
//	CreateAccountModule b=new CreateAccountModule();
//	b.TC2_signupto_XDC();
//	b.TC2B_emptyfields();
//	b.TC2C();
//	b.TC2D();
//	b.TC2E();
//	b.TC5();
	
//	ProfileModule c=new ProfileModule();
//	c.TC3();
//	
//	uploadimage d=new uploadimage();
//	d.TC6();
//	
//	Myzero e=new Myzero();
//	e.TC8A();
//	e.TC8B();
//	e.TC8C();
//	e.TC8E();
//	e.TC8F();
//	
	AddAnotherOrgTC10 f=new AddAnotherOrgTC10();
	f.TC10_bills();
	
	
}


	
}

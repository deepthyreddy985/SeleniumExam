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
import modules.Logout;
import modules.CreateAccountTC5;




public class DriverEngine extends XeroReusableMethod  {

	public static void main(String[] args) throws InterruptedException 
	{
		
//	LoginAutomationScript a=new LoginAutomationScript();		
//	a.TC1_Loginpage();
//	a.TC1B_IncorrectPassword();
//	a.TC1C_IncorrectEmail();
//	a.TC1D_ForgotPassword();

	 
	CreateAccountModule b=new CreateAccountModule();
//	b.TC2_signupto_XDC();
	//b.TC2B_emptyfields();
	b.TC2C();
	b.TC2D();
	b.TC2E();
	
	
	ProfileModule c=new ProfileModule();
	c.TC3();
		
	Logout d=new Logout();
	d.TC4();
	
	CreateAccountTC5 e=new CreateAccountTC5();
	e.TC5();
	
	uploadimage f=new uploadimage();
	f.TC6();
//	
//	Myzero e=new Myzero();
//	e.TC8A();
//	e.TC8B();
//	e.TC8C();
//	e.TC8E();
//	e.TC8F();
//	
	AddAnotherOrgTC10 g=new AddAnotherOrgTC10();
	g.TC10_bills();
	
	
}


	
}

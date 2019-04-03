package modules;

import com.relevantcodes.extentreports.LogStatus;
import com.zero.us.XeroReusableMethod;

public class CreateAccountTC5 extends XeroReusableMethod {
	public void TC5() throws InterruptedException
	{

		Initialize_Driver();
		LaunchUrl("https://www.xero.com/us/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC5.html");
		CreateTestScript("TC5", "success");
		System.out.println("Fail:there is no create account page");
		logger.log(LogStatus.FAIL,"Create account page could not found");
		endReport();
	}
	
}

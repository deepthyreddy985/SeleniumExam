package modules;
import com.zero.us.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddAnotherOrgTC10 extends XeroReusableMethod {
	public void TC10_bills() throws InterruptedException {

	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC10.html");
	CreateTestScript("TC10", "success");	
//enter usename
WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Email address']"));
entertext(Username, "deepthyreddy985@gmail.com");

System.out.println("username entered successfully");
//enter password
WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
entertext(password, "deepthy@1");

System.out.println("entered password successfully");
//login successfully
WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
ClickObject(LoginButton);
//wait();
WebElement business=driver.findElement(By.xpath("//button[contains(text(),'Business')]"));
ClickObject(business);
WebElement pay=driver.findElement(By.xpath("//a[contains(text(),'Bills to pay')]"));
ClickObject(pay);
String s="https://go.xero.com/AccountsPayable/Search.aspx?invoiceStatus=INVOICESTATUS%2fPAID";
String s1=driver.getCurrentUrl();



WebElement repeating=driver.findElement(By.xpath("//a[@href='/AccountsPayable/SearchRepeating.aspx']"));
ClickObject(repeating);

WebElement Seeall=driver.findElement(By.xpath("//a[@href='/AccountsPayable/Search.aspx']"));
ClickObject(Seeall);
endReport();
	}


}

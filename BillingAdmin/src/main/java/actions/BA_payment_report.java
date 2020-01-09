package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PaymentReportPage;

public class BA_payment_report {
	static WebDriver driver;
	 
	@Test
	public void payment_report_test() throws Exception {
		LoginPage login = new LoginPage(driver);
		driver = login.launchbrowser();
		login.userloggedwithvalidcredentialinBillingAdmin();
		
		PaymentReportPage paymentreport = new PaymentReportPage(driver);
		paymentreport.paymentreport_allMarket();
		
		Thread.sleep(6000);
		
		paymentreport.paymentreport_iponri();
		
		Thread.sleep(6000);

		paymentreport.paymentreport_sabogari();
		
		Thread.sleep(6000);

	}
	
	@AfterTest
	public static void teardown() {
		driver.close();
	}
}

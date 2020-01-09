package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.addShop;
import pages.customersearch;

public class Searchcustomer {

	static WebDriver driver;

	@Test
	public void search_customer_test() throws Exception {

		LoginPage login = new LoginPage(driver);
		driver = login.launchbrowser() ;
		login.userloggedwithvalidcredentialinBillingAdmin();



		Thread.sleep(10000);


		customersearch search_cust = new customersearch(driver);
		search_cust.downloadsearchedcustomer();
	}
	@AfterTest
	public void teardown() {

		driver.quit();

	}
}

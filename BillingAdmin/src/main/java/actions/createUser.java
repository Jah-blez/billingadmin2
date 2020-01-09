package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.customersearch;
import pages.userCreation;

public class createUser {
	

	static WebDriver driver;

	@Test
	public void create_customer_test() throws Exception {
		
		LoginPage login_BA = new LoginPage(driver);
		
		
		driver = login_BA.launchbrowser();
		login_BA.userloggedwithvalidcredentialinBillingAdmin();
		
		userCreation create_user_BA = new userCreation(driver);
		create_user_BA.billingAdminUserCreation();
		
		Thread.sleep(8000);
		
		
		
		login_BA.userloggedwithvalidcredentialinOpenCell();
		
		

		Thread.sleep(3000);


		userCreation create_User = new userCreation(driver);
		create_User.opencellusercreation();
		create_User.opencelluserattribute("Iponri", "IPR");
	}
	@AfterTest
	public void teardown() {

		driver.quit();
	}

}

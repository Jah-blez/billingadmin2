package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.create_user_prod;


public class createUser_Prod {



	static WebDriver driver;

	@Test
	public void create_prod_user_test() throws Exception {

		LoginPage login_BA = new LoginPage(driver);


		driver = login_BA.launchbrowser();
		login_BA.userloggedwithvalidcredentialinBillingAdmin();

		create_user_prod create_user = new create_user_prod(driver);
		create_user.billingAdminUserCreation(1);

		Thread.sleep(8000);



		login_BA.userloggedwithvalidcredentialinOpenCell();



		Thread.sleep(3000);

		create_user.opencellusercreation();
		create_user.opencelluserattribute("Iponri", "IPR");
	}
	@AfterTest
	public void teardown() {

		driver.quit();
	}



}

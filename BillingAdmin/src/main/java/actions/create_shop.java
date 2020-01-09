package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.addShop;

public class create_shop {

	static WebDriver driver;
 
	@Test
	public void create_shop_test() throws Exception {
		LoginPage login = new LoginPage(driver);
		driver = login.launchbrowser();
		login.userloggedwithvalidcredentialinBillingAdmin();


		Thread.sleep(10000);


		addShop newshop = new addShop(driver);
		newshop.Shopcreation();
	}
	@AfterTest
	public void teardown() {

		driver.quit();

	}

}

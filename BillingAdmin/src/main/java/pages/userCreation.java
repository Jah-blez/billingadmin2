package pages;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class userCreation {
	private WebDriver driver = null;

	public userCreation(WebDriver driver) {
		this.driver  = driver;
	}


	DecimalFormat df = new DecimalFormat("###");
	String firstname = "FNtest"+ df.format(Math.random()*99.6);
	String lastname = "LNtest"+ df.format(Math.random()*499.6);
	String email = firstname+"."+lastname+"@rensource.energy";
	String username = firstname+"."+lastname;

	String name = firstname+" "+lastname;
	public void billingAdminUserCreation() throws Exception {

		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

		//create user
		driver.findElement(By.linkText("Manage Accounts")).click();
		driver.findElement(By.linkText("Add User")).click();

		Thread.sleep(6000);


		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(firstname+" "+lastname);


		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);

		driver.findElement(By.xpath("//select[@name='market_code']")).click();
		new Select(driver.findElement(By.xpath("//select[@name='market_code']"))).selectByVisibleText("Iponri");

		Thread.sleep(6000);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("password_confirmation")).clear();
		driver.findElement(By.name("password_confirmation")).sendKeys("password");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Market:'])[1]/following::button[1]")).click();

		Thread.sleep(5000);

		WebElement userprofile = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Toggle navigation'])[1]/following::span[1]"));
		String userdetails = userprofile.getText();
		int ret = userdetails.compareTo(name);		

		if  (ret != 0) {
			System.out.println("user was not successfully created in billing admin");
		}

		else {

			System.out.println("user was successfully created in billing admin");
		}


	}
	public void opencellusercreation() throws Exception {

		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

		//create user
		driver.findElement(By.xpath("//tr[@class='ng-scope']//a[@class='ng-binding'][contains(text(),'MiddleWare')]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='createUser']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);

		driver.findElement(By.xpath("//*[@id=\"view\"]/div[1]/form/fieldset/div[11]/div/span/div/label/span[2]")).click();

		driver.findElement(By.xpath("//select[@id='locale']")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//select[@id='locale']"))).selectByVisibleText("en");


		Thread.sleep(6000);

		driver.findElement(By.xpath("//div[@class='col-md-10 col-md-offset-2']//button[@class='ng-binding btn btn-primary'][contains(text(),'Save')]")).click();
		Thread.sleep(6000);



	}
	public void opencelluserattribute(String MarketName , String MarketCode) throws Exception {

		driver.findElement(By.xpath("//a[contains(text(),'Attributes')]")).click();

		driver.findElement(By.xpath("//input[@id='newAttributeKey']")).sendKeys("MarketName");

		driver.findElement(By.xpath("//input[@id='newAttributeValue']")).sendKeys(MarketName);

		driver.findElement(By.xpath("//td[contains(text(),'Add')]")).click();


		driver.findElement(By.xpath("//input[@id='newAttributeKey']")).sendKeys("MarketCode");
		driver.findElement(By.xpath("//input[@id='newAttributeValue']")).sendKeys(MarketCode);
		driver.findElement(By.xpath("//td[contains(text(),'Add')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/form/div/div/button[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Credentials')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='newPas']")).sendKeys("Password1");
		driver.findElement(By.xpath("//input[@id='confirmPas']")).sendKeys("Password1");
		driver.findElement(By.xpath("//span[@class='onoffswitch-switch']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();

		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[@class='ng-binding btn btn-danger']")).click();

		System.out.println("user succesfully created in open cell");

	}


}

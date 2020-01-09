package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPage {
	private WebDriver driver = null;
	
	


	public LoginPage (WebDriver driver) {

		this.driver  = driver;
	}
	public  WebDriver launchbrowser() throws Exception {
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath+ "\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		System.out.println("browser launched successfully");

		return driver;

	}
	
	public  WebDriver userloggedwithvalidcredentialinBillingAdmin() throws Exception {
		
		driver.get("https://billingadmin.test.rensource.energy/login");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("rensource.tech@rensource.energy");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("rens0urc3!");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rensource Energy'])[2]/following::button[1]")).click();


		System.out.println("user logged in successfully in billing admin");

		return driver;

	}
	public  WebDriver userloggedwithvalidcredentialinOpenCell() throws Exception {
		
		driver.get("https://opencellstaging.rensource.energy/auth");
		driver.findElement(By.xpath("//a[contains(text(),'Administration Console')]")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("0pence!!");
		
		driver.findElement(By.xpath("//input[@id='kc-login']")).click();


		System.out.println("user logged in successfully in open cell");

		return driver;

	}


	public void tearDown() throws Exception {
		driver.quit();

	}



}

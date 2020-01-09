package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class PaymentReportPage {
private static WebDriver driver = null;
	
	


	public PaymentReportPage (WebDriver driver) {

		this.driver  = driver;
	}
	
	public void paymentreport_allMarket() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Payment Report')]")).click();
		Thread.sleep(5000);
		
		
		
		WebElement Payment_Date= driver.findElement(By.xpath("//th[contains(text(),'Payment Date')]"));
				WebElement agent_Name= driver.findElement(By.xpath("//th[contains(text(),'Agent Name')]"));
				WebElement customer_Name= driver.findElement(By.xpath("//th[contains(text(),'Customer Name')]"));
				WebElement payment_amount= driver.findElement(By.xpath("//th[contains(text(),'Payment Amount')]"));
				WebElement Customers_Account_ID= driver.findElement(By.xpath("//th[contains(text(),\"Customer's Account ID\")]"));
				WebElement market_Name= driver.findElement(By.xpath("//th[contains(text(),'Market Name')]"));
				WebElement Shop_Number= driver.findElement(By.xpath("//th[contains(text(),'Shop Number')]"));
				WebElement Shop_Line= driver.findElement(By.xpath("//th[contains(text(),'Shop Line / Block')]"));
				WebElement meter_ID= driver.findElement(By.xpath("//th[contains(text(),'Meter ID')]"));
				WebElement Tier= driver.findElement(By.xpath("//th[contains(text(),'Tier')]"));
				WebElement payment_medium= driver.findElement(By.xpath("//th[contains(text(),'Payment Medium')]"));
				WebElement payment_reference= driver.findElement(By.xpath("//th[contains(text(),'Payment Reference')]"));
				WebElement Subscription_Days= driver.findElement(By.xpath("//th[contains(text(),'Subscription Days')]"));
				WebElement Next_Due_Date= driver.findElement(By.xpath("//th[contains(text(),'Next Due Date')]"));
				WebElement Deletebutton= driver.findElement(By.xpath("//tr[1]//button[1]"));
				WebElement Value_date= driver.findElement(By.xpath("//th[contains(text(),'Value Date')]"));
				
				
		
		if(Payment_Date.isDisplayed() && agent_Name.isDisplayed() && customer_Name.isDisplayed() && payment_amount.isDisplayed() && Customers_Account_ID.isDisplayed() && market_Name.isDisplayed()&& Shop_Number.isDisplayed()&& Shop_Line.isDisplayed()&& meter_ID.isDisplayed() && Tier.isDisplayed()&& payment_medium.isDisplayed()&& payment_reference.isDisplayed()&& Subscription_Days.isDisplayed()&& Next_Due_Date.isDisplayed()&&Value_date.isDisplayed()) {
			System.out.println("all columns are displayed");
		}
		else
		{
			System.out.println("Columns are not complete");
		}
		if(Deletebutton.isDisplayed()) {
			System.out.println("delete button is displayed");
		}
		else
		{
			System.out.println("delete button is missing");
		}
		//download CSV file
				driver.findElement(By.xpath("//button[@class='btn btn-primary docs-next download-btn disable']")).click();
				Thread.sleep(15000);
	}
	
	public void paymentreport_iponri() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Payment Report')]")).click();
		Thread.sleep(5000);
		
		 driver.findElement(By.name("marketCode")).click();
		    new Select(driver.findElement(By.name("marketCode"))).selectByVisibleText("Iponri");
		    driver.findElement(By.name("marketCode")).click();
		    
		  //download CSV file
			driver.findElement(By.xpath("//button[@class='btn btn-primary docs-next download-btn disable']")).click();
			Thread.sleep(15000);
			
			String market_Name= driver.findElement(By.xpath("//tr[1]//td[7]")).getText();
			Thread.sleep(15000);
			
			assertTrue(market_Name.contains("Iponri"));
			
			System.out.println("market name on column is: " + market_Name);
	}
	public void paymentreport_sabogari() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Payment Report')]")).click();
		Thread.sleep(5000);
		
		 driver.findElement(By.name("marketCode")).click();
		    new Select(driver.findElement(By.name("marketCode"))).selectByVisibleText("Sabon Gari");
		    driver.findElement(By.name("marketCode")).click();
		    
		  //download CSV file
			driver.findElement(By.xpath("//button[@class='btn btn-primary docs-next download-btn disable']")).click();
			Thread.sleep(15000);
			
			String market_Name= driver.findElement(By.xpath("//tr[1]//td[7]")).getText();
			Thread.sleep(15000);
			
			assertTrue(market_Name.contains("Sabon Gari"));
			
			System.out.println("market name on column is: " + market_Name);
		  
	}
	@AfterTest
	public static void teardown(){
	 driver.close();
	}
}

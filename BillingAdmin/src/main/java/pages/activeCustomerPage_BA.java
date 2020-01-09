package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class activeCustomerPage_BA {
	private static WebDriver driver = null;
	public activeCustomerPage_BA (WebDriver driver) {

		this.driver  = driver;
	}
public void searchcritriatest() {

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
			
	
	if(Payment_Date.isDisplayed() && agent_Name.isDisplayed() && customer_Name.isDisplayed() && payment_amount.isDisplayed() && Customers_Account_ID.isDisplayed() && market_Name.isDisplayed()&& Shop_Number.isDisplayed()&& Shop_Line.isDisplayed()&& meter_ID.isDisplayed() && Tier.isDisplayed()&& payment_medium.isDisplayed()&& payment_reference.isDisplayed()&& Subscription_Days.isDisplayed()&& Next_Due_Date.isDisplayed()) {
		System.out.println("all columns are displayed");
	}
	else
	{
		System.out.println("Columns are not complete");
	}
	}

public void columntest() {

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
			
	
	if(Payment_Date.isDisplayed() && agent_Name.isDisplayed() && customer_Name.isDisplayed() && payment_amount.isDisplayed() && Customers_Account_ID.isDisplayed() && market_Name.isDisplayed()&& Shop_Number.isDisplayed()&& Shop_Line.isDisplayed()&& meter_ID.isDisplayed() && Tier.isDisplayed()&& payment_medium.isDisplayed()&& payment_reference.isDisplayed()&& Subscription_Days.isDisplayed()&& Next_Due_Date.isDisplayed()) {
		System.out.println("all columns are displayed");
	}
	else
	{
		System.out.println("Columns are not complete");
	}
}
	
	public void activecuctomertest() {
		
	}
}

package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class customersearch {

	private WebDriver driver = null;

	public customersearch (WebDriver driver) {

		this.driver  = driver;
	}
	public void downloadsearchedcustomer() throws Exception {
	    
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Search Customers")).click();
	    Thread.sleep(5000);
		
		
	    driver.findElement(By.name("marketCode")).click();
	    new Select(driver.findElement(By.name("marketCode"))).selectByVisibleText("Iponri");
	    Thread.sleep(5000);
	    driver.findElement(By.name("zoneId")).click();
	    new Select(driver.findElement(By.name("zoneId"))).selectByVisibleText("Mars-Zone");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.name("shopLineId")).click();
	    new Select(driver.findElement(By.name("shopLineId"))).selectByVisibleText("Agea-Line");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logs'])[2]/following::button[1]")).click();
	    System.out.println("Customer CSV file downloaded successfully");
	    Thread.sleep(5000);
	    List<WebElement> customeridrow  = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[4]/table/tbody/tr/td[4]"));
	    System.out.println("Customer ID for customer should contain IPR, such as:" + customeridrow.get(0).getText() );
	    
	    
	  }

	
}

package pages;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class addShop {
	private WebDriver driver = null;

	public addShop(WebDriver driver) {
		this.driver  = driver;
	}
	public void Shopcreation() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		DecimalFormat df = new DecimalFormat("###");
		String shopnumber= "IPR"+ df.format(Math.random()*99.6);;
		String meterID= "Auttest"+ df.format(Math.random()*499.6);;
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Collect Payment'])[1]/following::span[1]")).click();

		Thread.sleep(30000);

		driver.findElement(By.name("marketCode")).click();
		Thread.sleep(4000);
		new Select(driver.findElement(By.name("marketCode"))).selectByVisibleText("Iponri");
		
		Thread.sleep(8000);

		driver.findElement(By.name("zoneId")).click();
		new Select(driver.findElement(By.name("zoneId"))).selectByVisibleText("Mars-Zone");
		driver.findElement(By.name("zoneId")).click();

		Thread.sleep(8000);
		driver.findElement(By.name("shopLineId")).click();
		new Select(driver.findElement(By.name("shopLineId"))).selectByVisibleText("Agea-Line");
		

		Thread.sleep(8000);
		driver.findElement(By.name("next")).click();

		Thread.sleep(8000);

		driver.findElement(By.name("shopNumber")).click();
		driver.findElement(By.name("shopNumber")).clear();
		driver.findElement(By.name("shopNumber")).sendKeys(shopnumber);
		driver.findElement(By.name("meterId")).click();
		driver.findElement(By.name("meterId")).clear();
		driver.findElement(By.name("meterId")).sendKeys(meterID);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='meter ID'])[1]/following::button[1]")).click();
		//driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[12]/following::td[1]")).click();

		Thread.sleep(8000);

		List<WebElement> shoprow  = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]"));
		int shoprowsize = shoprow.size();

		String lastshoprowtext= shoprow.get(shoprowsize-1).getText();
		
		System.out.println(lastshoprowtext);	
		
		int ret = shopnumber.compareTo(lastshoprowtext);		
		
		if  (ret != 0) {
			System.out.println("New shop was not created");
		}

		else {
			
			System.out.println("New shop created successfully");
		}

		

	}
	

}

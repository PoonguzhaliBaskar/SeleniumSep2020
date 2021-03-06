package day13.Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends Base {

	public loginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	   public loginPage credentials() throws InterruptedException {
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("Tuna@123");
		driver.findElementById("sysverb_login").click();

		    WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-indicator icon-loading icon-lg']")));
		 
		  //Filtering incident
			driver.findElementById("filter").sendKeys("Oauth");
			Thread.sleep(5000);
			
			WebElement filteredresult = driver.findElementByXPath("//div[text()='Application Registry']");
			//mouse to hover the element and click
			Actions builder=new Actions(driver);
			builder.moveToElement(filteredresult).click(filteredresult).perform();
			
			//Moving into the frame
			driver.switchTo().frame(0);
			
			driver.findElementById("sysverb_new").click();
			Thread.sleep(3000);
			
			driver.findElementByXPath("//div[@class='container-fluid wizard-container']//a").click();
			  LocalDate localDate = LocalDate.now();
			driver.findElementById("oauth_entity.name").sendKeys("poonguzhaliB_"+(localDate));
			driver.findElementById("sysverb_insert").click();
			//driver.switchTo().defaultContent();
			WebElement search = driver.findElementByXPath("//input[@class='form-control']");
			search.sendKeys("poonguzhaliB");
			search.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			//search.click();
			boolean results = driver.findElementByXPath("//a[contains(text(),'poonguzhali')]").isDisplayed();	
		if (results==true) {
			System.out.println("Record created");
		}
		else {
			System.out.println("Record not created");
		}
		return this;
		
	}
	
	
	
	
	
	
	
}

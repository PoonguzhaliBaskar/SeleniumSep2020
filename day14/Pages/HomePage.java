package day14.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {

	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public GapFactory closealert() throws InterruptedException {
		 //alert box dismiss
		driver.findElementByXPath("//h2[@class='css-g4rtp8']/following-sibling::button[1]").click();
		Thread.sleep(3000);
	    //driver.switchTo().alert().dismiss();
	    driver.findElementByLinkText("Gap Factory").click();
	    Thread.sleep(4000);
	    
	    return new GapFactory(driver);
	}}
package day7.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Comparepage extends Base {

	public Comparepage(FirefoxDriver driver)
	{
		this.driver=driver;
	}

	public Comparepage pagedisplay() throws InterruptedException {
		Thread.sleep(3000);
		WebElement comparescreen = driver.findElementByXPath("//div[@class='_3ZR2N_']");
		
		if(comparescreen.isDisplayed()) {
			System.out.println("Compare screen displayed");
		}
	
	return this;
}
}
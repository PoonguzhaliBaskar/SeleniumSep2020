package day6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirPurifier extends Base {

	public AirPurifier(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public ProductPage setValues() throws InterruptedException {
		Thread.sleep(4000);

	    driver.executeScript("window.scrollBy(0,500)");
		WebElement min = driver.findElementByXPath("//div[@class='_2lhj']");
		WebElement max = driver.findElementByXPath("//div[@class='_2lhj undefined']");
		Actions act1=new Actions(driver);
		//act.moveToElement(min).perform();
		act1.doubleClick(min).sendKeys(min,Keys.BACK_SPACE).sendKeys(min,Keys.BACK_SPACE).sendKeys(min,Keys.BACK_SPACE).sendKeys(min,Keys.BACK_SPACE).sendKeys("5000").build().perform();
		//min.sendKeys("5000");
		 Thread.sleep(4000);
		act1.doubleClick(max).sendKeys(max,Keys.BACK_SPACE).sendKeys(max,Keys.BACK_SPACE).sendKeys(max,Keys.BACK_SPACE).sendKeys(max,Keys.BACK_SPACE).sendKeys("15000").build().perform();
		//max.sendKeys("15000");
		Thread.sleep(4000);
    	driver.findElementByXPath("//div[@class='_3nWP']//img").click();
		
		//
		/*
		 * Actions act=new Actions(driver);
		 * act.moveToElement(element).build().perform();
		 */
		
		
		return new ProductPage(driver);
	}
}

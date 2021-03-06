package day12.PagesZomato;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends Base {

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ShopPage select() throws InterruptedException {
		@SuppressWarnings("deprecation")
	//WebDriverWait wait=new WebDriverWait(driver,40);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement locationopt = driver.findElementByXPath("//input");
		
		WebElement exactloc = driver.findElementByXPath("//p[text()='Velachery, Chennai']");
		Actions act=new Actions(driver);
		act.click(locationopt).moveToElement(exactloc).click(exactloc).build().perform();
		
		//js.executeScript("arguments[0].scrollIntoView();", locationopt);
		//locationopt.click();
		WebElement search = driver.findElementByXPath("//input[@placeholder='Search for restaurant, cuisine or a dish']");
		search.sendKeys("A2B - Adyar Anada Bhavan");
		search.click();
		Thread.sleep(5000);
		
	 WebElement restselection = driver.findElementByXPath("(//div//div[@class='sc-bfYoXt jQyIap'])[last()]");
	 js.executeScript("arguments[0].scrollIntoView();", restselection); 
	 Thread.sleep(4000);
	 act.moveToElement(restselection).click(restselection).build().perform();
	//	act.click(search).sendKeys(search, "A2B - Adyar Anada Bhavan").click(Lastsuggestion).build().perform();
Thread.sleep(3000);	

//driver.executeScript("window.scrollBy(0,500)");		

	//	  
		//Actions act1=new Actions(driver);
	//	  act.moveToElement(Lastsuggestion).click(Lastsuggestion).build().perform();

		//Thread.sleep(4000);
		return new ShopPage(driver);
	}
	
}

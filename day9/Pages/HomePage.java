package day9.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {
	
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
		}
	
	public HomePage search() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement search = driver.findElementByTagName("input");
		search.sendKeys("Sunglasses");
Thread.sleep(2000);
		search.click();
		
		
		  Actions act=new Actions(driver); 
		act.moveToElement(search).click(search).sendKeys(search, Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[09]").click();
		Thread.sleep(4000);
		
	WebElement radiobutton = driver.findElementByXPath("//input[@type='radio']");
	act.moveToElement(radiobutton).click(radiobutton).perform();
	Thread.sleep(3000);
		WebElement more = driver.findElementByXPath("//span[text()=' more']");
		act.moveToElement(more).click(more).build().perform();
		WebElement filteropt =driver.findElementByXPath("//input[@value='Type']/following-sibling::h4[1]");
		act.moveToElement(filteropt).click(filteropt).build().perform();
		WebElement subfilter = driver.findElementByXPath("//input[@value='Rectangle Sunglasses']/following-sibling::div[1]");
		act.moveToElement(subfilter).click(subfilter).build().perform();
Thread.sleep(6000);
		List<WebElement> glasses = driver.findElementsByXPath("//li[@class='product-base']");
		Thread.sleep(2000);	
	int size = glasses.size();
	System.out.println("Size:"+size);
	int temp=0;
	String compare="Men rectangle Sunglasses";
		for (int i = 1; i <=size; i++) {
			 WebElement prod = driver.findElementByXPath("(//h4[@class='product-product'])["+i+"]");
			 String proddata = prod.getText();
			 if(proddata.equalsIgnoreCase(compare)) {
				 temp=temp+1;
				 
			 }
			
			 
		}
		 System.out.println("Men rectangle Sunglasses count is:"+temp);
		
		return this;
	
		
	}
	
	
	public HomePage similarItems() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement firstprod = driver.findElementByXPath("(//li[@class='product-base'])[1]");
		WebElement similar = driver.findElementByXPath("//div[@class='image-grid-similarColorsCta product-similarItemCta']");
	act.moveToElement(firstprod).click(similar).perform();
	Thread.sleep(5000);
		List<WebElement> similaritems = driver.findElementsByXPath("//ul[@class='results-base results-similarGrid']//a");
		int size = similaritems.size();
		System.out.println("No of similar items are:"+size);
		return this;
		
		
	}
	}
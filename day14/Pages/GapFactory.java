	package day14.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GapFactory extends Base {

	public GapFactory(ChromeDriver driver) {
		this.driver = driver;
	}

	public GapFactory clickdress() throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElementByXPath("//button[@aria-label='close email sign up modal']").click();

		driver.findElementByXPath("//button[@class='divisionLink']").click();
		
		WebElement babygirl = driver.findElementByXPath("//span[text()='Baby Girl']");
		act.click(babygirl).build().perform();
		return this;
	}

	public GapFactory Girldress() throws InterruptedException {
		WebElement shopBySize = driver.findElementByLinkText("Baby Girl Shop by Size");
		Actions act = new Actions(driver);
		act.moveToElement(shopBySize).click(shopBySize).perform();
		Thread.sleep(4000);
		WebElement totalitems = driver.findElementByClassName("category__item-count");
		String items = ((totalitems.getText()).replaceAll("[^\\d]", ""));
		System.out.println("items" + totalitems.getText());
		int totalvalue = Integer.parseInt(items);
		System.out.println("Total value:" + totalvalue);

		// pagination
		List<WebElement> pages = driver.findElementsByXPath("//div[@class='css-1wn9d80']/span");
		System.out.println("Total no of Pages" + pages.size());
		// List<WebElement> babydresseslist =
		// driver.findElementsByXPath("//div[@class='product-card__image-wrapper']");
		int firstpagecount=0;
		int secondpagecount = 0;
		int size = driver.findElementsByXPath("//div[@class='product-card']").size();
		System.out.println("size:" + size);
		Thread.sleep(8000);
		int temp = 0;
		for (int i = 1; i < pages.size(); i++) {
			firstpagecount = size;
		}
		System.out.println("firstpage count:" + firstpagecount);
		
		for (int j = 1; j < pages.size(); j++) {
			WebElement nextpage = driver.findElementByXPath("//div[@class='css-mb3mlu']");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextpage);

			nextpage.click();
			int size2 = driver.findElementsByXPath("//div[@class='product-card']").size();
			secondpagecount = size2;
		}
System.out.println("2nd page"+secondpagecount);
		int dresscount = firstpagecount + secondpagecount;
		System.out.println("count on pages:" + dresscount);
		
		  if(dresscount==totalvalue) 
		  { System.out.println("Both values are same");
		  } else
		  { 
			  System.out.println("Not same"); }
		 

		WebElement category = driver.findElementByXPath("//button[@aria-label='category filter options dropdown']");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", category);
		category.click();
		Thread.sleep(3000);
		driver.findElementByName("Pants & Jeans").click();
		driver.findElementByName("Pants & Jeans").sendKeys(Keys.ESCAPE);
		//Thread.sleep(2000);
	
		driver.findElementByXPath("//div[@class='product-card']").click();
		Thread.sleep(4000);
	//	driver.findElementByXPath("//button[@aria-label='Close Promo Drawer']").click();
		WebElement dresssize = driver.findElementByXPath("//span[text()='18-24 M']");
		act.moveToElement(dresssize).click(dresssize).perform();

//discount
		String currentprice = (driver.findElementByXPath("//h2[@class='pdp-pricing__selected pdp-pricing--highlight']")
				.getText()).replaceAll("[^\\d]", "");
		int currentcost = Integer.parseInt(currentprice);
		String totalprice = (driver.findElementByXPath("//span[@class='product-price__strike']").getText())
				.replaceAll("[^\\d]", "");
		int totalcost = Integer.parseInt(totalprice);
		int discount = totalcost - currentcost;
		System.out.println("Discounted price:" + discount);
		driver.findElementByXPath("//button[text()='Add to Bag']").click();
WebElement checkout = driver.findElementById("checkoutButton");
act.moveToElement(checkout).click(checkout).perform();


		return this;
	}

}
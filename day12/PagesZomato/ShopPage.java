package day12.PagesZomato;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopPage extends Base {

	public ShopPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ShopPage order() {
		Actions act1=new Actions(driver);
		WebElement clickonline = driver.findElementByLinkText("Order Online");
		act1.moveToElement(clickonline).click(clickonline).perform();
		System.out.println("Shop Status:"+driver.findElementByXPath("//section[@class='sc-iCwjlJ kpAWXT']").getText());
		List<WebElement> musttry = driver.findElementsByXPath("//div[@class='sc-2gamf4-0 cRxPpO']");
		System.out.println("No of musttryitems are:"+ musttry.size());
		return this;
	}
	
	public ShopPage photos() {
	
	driver.findElementByLinkText("Photos").click();
 List<WebElement> pages = driver.findElementsByXPath("//a[@class='sc-HCMGD jFHESP']");
	List<WebElement> photos = driver.findElementsByXPath("//div[@class='s1isp7-0 hJwSen sc-hzDEsm sc-jTdKgc eSXanj']");
	List<Integer> totalpics=new ArrayList<Integer>();
	for (int i = 1; i < pages.size(); i++) {
		int size = photos.size();
		totalpics.add(size);
	}
	
	System.out.println("Total photos:"+ totalpics);
	return this;
	}
}

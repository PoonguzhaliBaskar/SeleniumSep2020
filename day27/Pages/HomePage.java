package day27.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Base {

	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}

	public HomePage usedCars() throws InterruptedException {
		

		driver.findElementByXPath("//div[text()='USED CARS']").click();
		driver.findElementByXPath("//div[text()='Find Used Cars']").click();
		//driver.switchTo().window(nameOrHandle)
		driver.findElementById("placesQuery").sendKeys("Chennai");
		driver.findElementById("placesQuery").sendKeys(Keys.ENTER);
		driver.findElementById("budgetBtn").click();
		driver.findElementById("minInput").sendKeys("8");
		driver.findElementById("maxInput").sendKeys("12");
		driver.findElementById("btnSetBudget").click();
		driver.findElementByXPath("//li[@class='us-sprite makeLi active']").click();
		driver.findElementByXPath("//li[@class='us-sprite rootLi']").click();
		WebElement sort = driver.findElementById("sort");
		WebElement submenu = driver.findElementByXPath("(//option[@value='2'])[3]");
		Actions act=new Actions(driver);
		act.moveToElement(sort).click(submenu);
		
		//To check the displayed KM are sortted
		List<WebElement> kms = driver.findElementsByXPath("//span[@class='slkms vehicle-data__item']");
		ArrayList<String> km=new ArrayList<>();
		for(WebElement kilo:kms) {
			km.add(kilo.getText());
		}
		System.out.println("km:"+km);
		ArrayList<String> sortted=new ArrayList<>();
		for(String s:km) {
			sortted.add(s);
		}
		System.out.println("sortted:"+sortted);
		Collections.sort(sortted);
		Assert.assertTrue(sortted.equals(km));
		
		
		//click on heart symbol
		List<WebElement> heart = driver.findElementsByXPath("//span[@class='shortlist-icon--inactive shortlist']");
     for (int i = 0; i < 4; i++) {
	heart.get(i).click();
	       }
	driver.findElementByXPath("//li[@class='action-box shortlistBtn']").click();
	//car price
	int temp=0;
	List<WebElement> carprice = driver.findElementsByXPath("//p[@class='slprice shortlist-detail-strips']");
	for (int i = 1; i <=carprice.size(); i++) {
		String cost = carprice.get(i).getText();
		int intcost = Integer.parseInt(cost);
	if(intcost>temp)
	{
			intcost=temp;
			WebElement img1 = driver.findElementByXPath("(//li[@class='ui-state-default'])["+i+"]");
			WebElement img = driver.findElementByXPath("(//li[@class='ui-state-default'])["+(i-1)+"]");
			Actions act1=new Actions(driver);
			act1.dragAndDrop(img, img1);
			}
	}
	//Click more details
	driver.findElementByXPath("(//p[@class='font12 margin-top5 slpid'])[3]").click();
	Set<String> winHandles=driver.getWindowHandles(); 
	List<String>listhandles1=new ArrayList<String>(winHandles);
	String secwinref=listhandles1.get(1);
	driver.switchTo().window(secwinref);
	List<WebElement> overview = driver.findElementsByXPath("//div[@id='overview']//li/div[1]");
for (int i = 0; i < overview.size(); i++) {
	WebElement ovlist = driver.findElementByXPath("(//div[@id='overview']//li)["+i+"]/div[1]");
	String text = ovlist.getText();
	System.out.println(text);
}
return this;
	}
}

package day15.PagesNyka;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public HomePage search() throws InterruptedException {
		driver.findElementById("SearchInputBox").sendKeys("Perfumes");
		driver.findElementById("SearchInputBox").sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);
        Thread.sleep(5000);
		  String prodcount="Showing 2275 of 2275  results for 'Perfumes'";
	
		  // fetching all the products
		  
		  int count =300;
		  String text =driver.findElementByXPath("//div[@class='page-title-search-result']").getText();
		  System.out.println("text:"+text); 
		  while (count > 1) {
			String text2=driver.findElementByXPath("//div[@class='page-title-search-result']").getText(); 
		 if(!text2.equalsIgnoreCase(prodcount)) {
			WebElement loadmore=driver.findElementByXPath("//span[contains(text(),'View More products')]");
		    @SuppressWarnings("deprecation")
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'View More products')]")));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", loadmore);
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);
		  count--;
		  System.out.println("count:"+count);
		  } else{
			  break;} } 
		
		  
		 //getting the price and name of all the products 
		  int perfumeslist = driver.findElementsByXPath("//div[@class='card-wrapper-container col-xs-12 col-sm-6 col-md-4']").size();
		  Thread.sleep(3000);
		  System.out.println("size:" + perfumeslist);
		  TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		  String value="";
		  for (int j = 1; j<=perfumeslist; j++) {
		   String nametext = driver.findElementByXPath("(//div[@class='m-content__product-list__title']//h2//span)["+j+"]").getText();
		   Integer pricetext = Integer.parseInt(driver.findElementByXPath("(//span[@class='post-card__content-price-offer'])["+j+"]").getText().replaceAll("[^\\d]", ""));
		   map.put(pricetext,nametext); }
		  System.out.println("Map:"+map);
		  value = map.lastEntry().getValue();
		  
		  //selecting the highest product and proceed till checkout
		  
		  WebElement perfume = driver.findElementByXPath("//span[text()='"+value+"']");
	    	 JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", perfume);
	    	 Thread.sleep(3000);
	    	 Set<String> winhandles1 = driver.getWindowHandles();
				List<String> listhandles1=new ArrayList<String>(winhandles1);
				String secwinref2=listhandles1.get(1);
				driver.switchTo().window(secwinref2);
				driver.findElementByXPath("//div[@class='pull-left']//div").click();
				String text2 = driver.findElementByXPath("//span[text()='Product has been added to bag.']").getText();
	            System.out.println("Displayed message:"+text2);
	            driver.findElementByXPath("//div[@class='AddBagIcon']").click();
	            Set<String> winhandles3 = driver.getWindowHandles();
				List<String> listhandles3=new ArrayList<String>(winhandles3);
				String secwinref3=listhandles3.get(1);
				driver.switchTo().window(secwinref3);
	            @SuppressWarnings("deprecation")
				WebDriverWait wait = new WebDriverWait(driver, 20);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='value medium-strong']")));
	            String total = driver.findElementByXPath("//div[@class='value medium-strong']").getText();
		System.out.println("Total amt:"+total);
		
		WebElement proceed = driver.findElementByXPath("//button[@type='button']//span");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", proceed);
		 Set<String> winhandles2 = driver.getWindowHandles();
		List<String> listhandles2=new ArrayList<String>(winhandles2);
		String secwinref=listhandles2.get(1);
	            Actions act1=new Actions(driver);
	            WebElement guest = driver.findElementByXPath("//button[@class='btn full big']");
	            act1.moveToElement(guest).click(guest).build().perform();
	            driver.findElementByXPath("//input[@name='name']").sendKeys("Baskar");
	            driver.findElementByXPath("//input[@name='email']").sendKeys("bala_poo@yahoo.co.in");
	            driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9003191241");
	            driver.findElementByXPath("//input[@name='pinCode']").sendKeys("600100");
	            driver.findElementByXPath("//textarea[@class='textarea-control prl10']").sendKeys("Renton");
	            WebElement shipaddress = driver.findElementByXPath("//button[@type='submit']");
	            act1.moveToElement(shipaddress).click(shipaddress).build().perform();
	            driver.findElementByXPath("//button[@class='btn fill full big proceed']").click();
	            String error = driver.findElementByXPath("//span[@class='field-error']").getText();
	          System.out.println("Error message:"+error);
	            
	            return this;
	}
}

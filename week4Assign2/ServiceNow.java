package week4Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementById("sysverb_login").click();
		driver.findElementById("filter").sendKeys("Incident");
		Thread.sleep(2000);
		
		//Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElementByXPath("(//div[text()='All'])[2]");
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
         //Switch to frame0
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElementById("sysverb_new").click();
			 
		        //driver.findElementById("sys_display.incident.caller_id").click();
				driver.findElementByXPath("//span[@class='icon icon-search']").click();
				
				 Set<String> winhandles = driver.getWindowHandles(); List<String>
				 listhandles=new ArrayList<String>(winhandles); 
				String firstwinref=listhandles.get(0); 
				 String secwinref=listhandles.get(1);
				
				 //moving to next window 
				driver.switchTo().window(secwinref);
		        driver.findElementByXPath("//a[@class='glide_ref_item_link']").click();
		  
		        //Switching to window one and to frame
		  driver.switchTo().window(firstwinref);
		  driver.switchTo().frame(0);
		  driver.findElementById("incident.short_description").sendKeys("Hi Short Descrip");
				WebElement Element2 = driver.findElementByXPath("//input[@id='incident.number']");
				js.executeScript("arguments[0].scrollIntoView();", Element2);
				//Element.click();
				 String text = driver.findElementById("incident.number").getAttribute("value");
				
				System.out.println(text);
				driver.findElementById("sysverb_insert").click();
				
				//Search for the incident num
				WebElement search = driver.findElementByXPath("//input[@class='form-control']");
				search.sendKeys(text);
				search.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
			
				//search result
				 WebElement ele = driver.findElementByXPath("//tbody[@class='list2_body']//tr/td[3]");
				String searchresult = ele.getText();
				System.out.println("Sear value is:"+searchresult);
	
		 if(searchresult.equalsIgnoreCase(text)) 
		{
			 System.out.println("Successfully added");
	
			}
		else {
			System.out.println("Not created");
		}
		
		driver.close();
		}
		
	}


package boot90;


import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		
		// get into URL
		 
		driver.get("https://www.airbnb.co.in/");
		Thread.sleep(2000);
	driver.findElementById("bigsearch-query-detached-query").sendKeys("Baga");
    driver.findElementByXPath("//div[text()='Baga Beach, Baga']").click();

    driver.findElementByXPath("//button[text()='OK'][@class='_1qnlffd6']").click();
    Thread.sleep(3000);
			
			  LocalDate today = LocalDate.now(); 
			  int Date = today.getDayOfMonth();
			  int year = today.getYear();
			  int month = today.getMonthValue();
			  System.out.println(year+"-"+month+"-"+Date+10);
			  //div[@data-testid="datepicker-day-2020-11-14"]
			  driver.findElementByXPath("//div[text()='Add dates']").click();
			  WebElement checkin = driver.findElementByXPath("//div[@data-testid='datepicker-day-"+year+"-"+
			  month+"-"+(Date+10)+"']");
			  checkin.click();
			  String textin = checkin.getText();
			  System.out.println(textin);
			  WebElement checkout = driver.findElementByXPath("//div[@data-testid='datepicker-day-"+year+"-"+
			  month+"-"+(Date+15)+"']");
			  checkout.click();
			  String textout = checkout.getText();
			  System.out.println(textout);
			  driver.findElementByXPath("//div[text()='Add guests']").click();
			  driver.findElementByXPath("//button[@data-testid='stepper-adults-increase-button']//span").click();
		
			  driver.findElementByXPath("//button[@data-testid='stepper-children-increase-button']//span[1]").click(); 
			 driver.findElementByXPath("//span[@class='_163rr5i']//span[1]").click();
			 driver.findElementByXPath("(//span[@class='_36rlri'])[3]").click();
			 driver.findElementByXPath("(//span[@data-checkbox='true'])[3]").click();
			 driver.findElementById("filter-panel-save-button").click();
			 Thread.sleep(3000);
			 driver.findElementByXPath("//span[text()='Price']").click();
			 Thread.sleep(3000);
			 
		     Actions act = new Actions(driver);
		     WebElement min = driver.findElementById("price_filter_min");
		     act.sendKeys(min,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		     min.sendKeys("1000");
		     Thread.sleep(4000);
		     
		     WebElement max = driver.findElementById("price_filter_max");
		     act.sendKeys(max,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		     max.sendKeys("10000");
		     Thread.sleep(4000);

				driver.findElementById("filter-panel-save-button").click();
			 driver.findElementByXPath("//div[@data-testid='menuItemButton-dynamicMoreFilters']//button[1]").click();
			 driver.findElementByXPath("//button[@data-testid='more-filters-modal-submit-button']").click();
			 driver.findElementByXPath("//a[@class='_gjfol0']").click();
			 Set<String> winhandles1 = driver.getWindowHandles();
				List<String> listhandles1=new ArrayList<String>(winhandles1);
				String secwinref2=listhandles1.get(1);
				driver.switchTo().window(secwinref2);
				
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElementByXPath("//div[@class='_wgmchy']");
				driver.executeScript("arguments[0].scrollIntoView();", element);
				
				 //capturescreenshot
				File f=element.getScreenshotAs(OutputType.FILE);
				   FileUtils.copyFile(f, new File("C:\\projectScreenshots\\logoScreeshot.png"));
				   
				  //comparing result
				   String resultin = driver.findElementByXPath("//div[@class='_1g8031c']").getText();
				   String resultout = driver.findElementByXPath("(//div[@class='_1g8031c'])[2]").getText();
				   if(resultin.contains(textin)) {
					   System.out.println("Given date displayed");
				   }
				   else {
					   System.out.println("Date varied");
				   }
				   if(resultout.contains(textout)) {
					   System.out.println("Given date displayed");
				   }
				   else {
					   System.out.println("Date varied");
				   }
				   
				    WebElement result = driver.findElementByXPath("//span[@class='_11o89bi']");
				   if(result.isDisplayed()){
					   System.out.println("Displayed as expected");
				   }else {
					   System.out.println("Not displayed properly");
				   }
				   driver.close();
	}

}

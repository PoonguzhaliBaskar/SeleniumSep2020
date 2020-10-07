package week4Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/mergeLeadsForm']").click();
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		Set<String> winhandles = driver.getWindowHandles();
		List<String> listhandles=new ArrayList<String>(winhandles);
		String secwinref=listhandles.get(1);
		String firstwinref=listhandles.get(0);
		
		//moving to next window
		driver.switchTo().window(secwinref);
		driver.findElementByXPath("//input[@type='text']").sendKeys("10002");
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
		
		//first window
		driver.switchTo().window(firstwinref);
		Thread.sleep(1000);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		
		//new ref to sec window
		Set<String> winhandles2 = driver.getWindowHandles();
		List<String> listhandles2=new ArrayList<String>(winhandles2);
		String secwinref2=listhandles2.get(1);
		//moving to next window
				driver.switchTo().window(secwinref2);
					Thread.sleep(4000);
					driver.findElementByXPath("//input[@type='text']").sendKeys("10004");
					driver.findElementByXPath("//button[@class='x-btn-text']").click();
				Thread.sleep(2000);
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
				
				//first window
				driver.switchTo().window(firstwinref);
				Thread.sleep(2000);
				driver.findElementByXPath("//a[@class='buttonDangerous']").click();
				
				//Alert
				Alert alert = driver.switchTo().alert();
				alert.accept();
				driver.findElementByXPath("//a[text()='Find Leads']").click();
				driver.findElementByXPath("//input[@class=' x-form-text x-form-field'][@name='id']").sendKeys("10002");
				driver.findElementByXPath("//button[@class='x-btn-text'][text()='Find Leads']").click();
				Thread.sleep(2000);
				boolean displayed = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		
		 if(displayed== true){
		 System.out.println("Successful Merge");
		 } else {
		 System.out.println("Not Succesful"); 
		 }
		 
				driver.close();
				}
}


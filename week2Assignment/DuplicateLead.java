package week2Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://leaftaps.com/opentaps/control/main");
	        Thread.sleep(2000);
	    	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
			driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
			driver.findElementByXPath("//a[contains(text(),'SFA')]").click();
	        driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
	        driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
	        driver.findElementByXPath("//span[text()='Email']").click();
	        driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc1@yahoo.com");
	        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	        Thread.sleep(1000);
	        WebElement Name=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a");
	         String LeadName=Name.getText();
	         System.out.println(LeadName);
	         driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a").click();
	         driver.findElementByXPath("//a[@class='subMenuButton'][text()='Duplicate Lead']").click();
	         String Title=driver.getTitle();
	         System.out.println(Title);
	         driver.findElementByXPath("//input[@class='smallSubmit']").click();
	         String DuplicateName=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
	         System.out.println(DuplicateName);
	         if (DuplicateName.equals(LeadName)) {
	        	 System.out.println("Name is same");
	         }
	         else {
	        	 System.out.println("Two names are different");
	         }
	         driver.close();
	         }
	        
	}



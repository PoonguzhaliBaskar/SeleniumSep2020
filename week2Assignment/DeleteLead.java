package week2Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
	        driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
	        driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
	        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	        Thread.sleep(1000);
	         WebElement Lead=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a");
	         String ID=Lead.getText();
	        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a").click();
	   		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
	        driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
	        Thread.sleep(2000);
            driver.findElementByXPath("//input[@name='id']").sendKeys(ID);
            driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
            Thread.sleep(1000);
	       boolean display=driver.getPageSource().contains("No records to display");
	    		   if (display== true) {
            System.out.println("No records to display");
	      }
            else
            {
            	System.out.println("REcords found");
	}
	            driver.close();

	}}

	
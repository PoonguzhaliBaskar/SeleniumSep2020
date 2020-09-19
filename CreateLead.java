package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	
	public static void main(String[] args) throws InterruptedException {
		//Set up Driver Manager
		WebDriverManager.chromedriver().setup();

		//Open chrome
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//wait
				Thread.sleep(2000);
		
				driver.findElementById("username").sendKeys("demosalesmanager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
				driver.findElementById("createLeadForm_firstName").sendKeys("Poonguzhali");
				driver.findElementById("createLeadForm_lastName").sendKeys("Baskar");
				
				//Select value from dropDown
				WebElement CreateLead=driver.findElementById("createLeadForm_dataSourceId");
				Select dropDown= new Select(CreateLead);
				dropDown.selectByVisibleText("Employee");
				
				WebElement Marketing=driver.findElementById("createLeadForm_marketingCampaignId");
				Select dropDown1=new Select(Marketing);
				dropDown1.selectByValue("9001");
				
				WebElement Indursty=driver.findElementById("createLeadForm_industryEnumId");
				Select dropDown2=new Select(Indursty);
				int Industrysize=dropDown2.getOptions().size();
				dropDown2.selectByIndex(Industrysize-2);
				
				WebElement Ownership=driver.findElementById("createLeadForm_ownershipEnumId");
				Select dropDown3=new Select(Ownership);
				dropDown3.selectByIndex(5);
				
				WebElement Country=driver.findElementById("createLeadForm_generalCountryGeoId");
				Select dropDown4=new Select(Country);
				dropDown4.selectByVisibleText("India");
				
				driver.findElementByName("submitButton").click();
				
				System.out.println(driver.getTitle());
						
	}

}

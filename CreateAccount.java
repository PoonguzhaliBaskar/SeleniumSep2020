package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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
				driver.findElementByLinkText("Accounts").click();
				driver.findElementByLinkText("Create Account").click();
				driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account");
				driver.findElementByName("description").sendKeys("Selenium Automation Tester");
				driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Mritha");
				driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("siteOffice");
				driver.findElementByXPath("//input[@class='inputBox']").sendKeys("200000");
				
				//Select value from dropDown
				WebElement Industry=driver.findElementByName("industryEnumId");
				Select dropDown= new Select(Industry);
				dropDown.selectByVisibleText("Computer Software");
				
				WebElement Ownership=driver.findElementByName("ownershipEnumId");
				Select dropDown1= new Select(Ownership);
				dropDown1.selectByVisibleText("S-Corporation");
				
				WebElement Source=driver.findElementById("dataSourceId");
				Select dropDown2= new Select(Source);
				dropDown2.selectByValue("LEAD_EMPLOYEE");
				
				WebElement Marketing=driver.findElementById("marketingCampaignId");
				Select dropDown3= new Select(Marketing);
				int size=dropDown3.getOptions().size();
				dropDown3.selectByIndex(size-3);
				
				WebElement State=driver.findElementById("generalStateProvinceGeoId");
				Select dropDown4= new Select(State);
				dropDown4.selectByValue("TX");
				
				
				driver.findElementByXPath("//input[@class='smallSubmit']").click();
					
					}

}

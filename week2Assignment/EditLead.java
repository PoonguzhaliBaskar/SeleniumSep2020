package week2Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
        driver.findElementByXPath("(//input[@name='firstName' and @class=' x-form-text x-form-field'])[3]").sendKeys("Poonguzhali");
        Thread.sleep(2000);
        driver.findElementByXPath("//button[contains(text(),'Find')]").click();
        Thread.sleep(2000);
        
        driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[2]").click();
        System.out.println(driver.getTitle());
        /*String actual=("//div[@class='x-panel-header sectionHeaderTitle'])");
        if(title==actual)
        {System.out.println(title);
                }*/
        driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
        driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Microsoft");
        driver.findElementByXPath("//input[@type='submit']").click();
       driver.findElementByXPath("//span[contains (text(),'Microsoft')]").isDisplayed();
        driver.close();
        
        
	}

}

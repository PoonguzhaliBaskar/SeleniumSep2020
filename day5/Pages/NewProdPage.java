package day5.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewProdPage extends Base {
	

	public NewProdPage(ChromeDriver driver) {
		Base.driver=driver;
	} 
	

	public NewProdPage proddisplaymsg() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")));
       System.out.println(message);		
     	
		if(message.isDisplayed()){
			System.out.println("Successfully created");
			
		}
		else {
			System.out.println("Not Created");
		}
		
		return this;
	}

	public NewProdPage clknewcontact() throws InterruptedException {
    Thread.sleep(4000);
       
 
    WebElement ele = driver.findElementByLinkText("New Contact");
       
       ele.click();
		/*WebElement Element = driver.findElementByXPath("//a[@title='New Contact']");
		Element.sendKeys(Keys.ENTER);*/
	//	driver.executeScript("arguments[0].scrollIntoView();", Element);
		//Element.click();
		
		// Store all currently open tabs in tabs
		/*
		 * WebElement ele = driver.findElementByXPath("//a[@title='New Contact']");
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		 */
	 //
		
		/*
		 * //((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;",
		 * ele); //  Actions action1 = new Actions(driver);
		 * action1.moveToElement(ele).doubleClick(ele).build().perform();
		 */
		 
        
        //driver.navigate().refresh();
        
   		//WebDriverWait wait = new WebDriverWait(driver, 60);  
           //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")));
   		/*
   		 * JavascriptExecutor js = (JavascriptExecutor) driver;
   		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
   		 * xpath("//a[@title='New Contact']")));
   		 */
	return this;
	}
	
	public NewProdPage createnewcontact() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement dropdown = driver.findElementByXPath("//a[@class='select']");
		dropdown.click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@title='Mr.']").click();
		
		  //Select index1= new Select(dropdown); index1.selectByIndex(1);
		 
		 
	       Thread.sleep(1000);
	       driver.findElementByXPath("//input[contains(@class,'firstName compoundBorderBottom')]").sendKeys("Baskar");
		driver.findElementByXPath("//input[contains(@class,'lastName compoundBLRadius')]").sendKeys("L");
		WebElement acc = driver.findElementByXPath("(//input[contains(@class,'default input')])[2]");
		acc.click();
		driver.findElementByXPath("//div[contains(@class,'primaryLabel slds-truncate')]").click();
		driver.findElementByXPath("(//input[@class=' input'])[3]").sendKeys("Sapletest");
		return this;
	}
	public NewProdPage clksave() {
		driver.findElementByXPath("(//span[text()='Save'])[3]").click();
		Set<String> winHandles=driver.getWindowHandles();
		List<String> listhandles=new ArrayList<String>(winHandles);
		String secwinref=listhandles.get(0);
		driver.switchTo().window(secwinref);
		return this;
	}
	
	

}

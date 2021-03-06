package day5.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base {

	public HomePage(ChromeDriver driver) {
		Base.driver=driver;
	}
	
	public HomePage clkmenu() throws InterruptedException {
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElementByXPath("(//div[@data-aura-class='uiTooltip']//div)[3]");
		//driver.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		Thread.sleep(3000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30); WebElement menu =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(
		 * "HomePage"))); menu.click();
		 */
		return this;
	}
	
	
	public HomePage clkviewall() throws InterruptedException {

		  WebDriverWait wait = new WebDriverWait(driver, 30); WebElement menu
		  =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		  "//button[text()='View All']")));
		  Thread.sleep(4000);
		  Actions action = new Actions(driver);
		  System.out.println(menu.getText());
		  action.doubleClick(menu).perform();
		 
		  //menu.click();
		 
	
		/*
		 * Actions action1 = new Actions(driver); WebElement we =
		 * driver.findElement(By.className("slds-button")); Thread.sleep(3000);
		 * action1.moveToElement(driver.findElement(By.className("slds-button"))).click(
		 * ).build().perform();
		 */
		return this;
		
		}
	
	@SuppressWarnings("deprecation")
	public ProductPage clkserviceconsole() throws InterruptedException {
		
		/*
		 * Set<String> winHandles=driver.getWindowHandles(); List<String>
		 * listhandles1=new ArrayList<String>(winHandles); String
		 * secwinref=listhandles1.get(1);
		 */
		/*
		 * @SuppressWarnings("deprecation") WebDriverWait block = new
		 * WebDriverWait(driver,10);
		 * 
		 * WebElement
		 * modal=block.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//div[@class='modal-body scrollable slds-modal__content']")));
		 */
		
		
		/*
		 * String currentWindowHandle = driver.getWindowHandle(); WebElement
		 * dialogButton = driver.findElement(By.
		 * xpath("//div[@class='modal-glass slds-backdrop fadein slds-backdrop--open']")
		 * ); // String popupWindowHandle = getPopupWindowHandle(driver,dialogButton);
		 * driver.switchTo().window(popupWindowHandle);
		 */
		 //WebDriverWait wait = new WebDriverWait(driver, 30); WebElement menu
		 // =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		//  "//p[@title='(Lightning Experience) Lets support agents work with multiple records across customer service channels on one screen']")));
		//Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//p[@title='(Lightning Experience) Lets support agents work with multiple records across customer service channels on one screen']"));
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(button));
		//button.click();
		 Actions action1 = new Actions(driver);
		//  WebElement serviceconsole = driver.findElement(By.xpath("//p[@title='(Lightning Experience) Lets support agents work with multiple records across customer service channels on one screen']"));
		  System.out.println(button.getText());
		 action1.moveToElement(button).doubleClick(button).perform();
		
		return new ProductPage(driver);
	}
	
}

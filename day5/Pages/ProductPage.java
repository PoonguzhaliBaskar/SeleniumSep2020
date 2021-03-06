package day5.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Base {
	
	String Pordname;
	public ProductPage(ChromeDriver driver) {
		Base.driver=driver;
	}
	
	public ProductPage clkproductarrow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElementByXPath("//lightning-primitive-icon[@data-aura-rendered-by='269:82;a']");
		driver.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		driver.findElementByXPath("(//span[text()='Products'])[2]").click();
		return this;
	}
	
	public ProductPage clknew() {
		
		driver.findElementByXPath("//div[@title='New']").click();
		return this;
			}
	
	public NewProdPage newprodinfo() {
		WebElement prodname = driver.findElementByXPath("//input[@class=' input']");
		prodname.sendKeys("Copper");
		//System.out.println(prodname.getAttribute(Pordname));
		driver.findElementByXPath("//input[@data-interactive-lib-uid='7']").click();
		 	driver.findElementByXPath("(//span[text()='Save'])[2]").click();
		 	return new NewProdPage(driver);
	}
	
	}
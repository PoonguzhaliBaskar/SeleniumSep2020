package day6.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {
public HomePage(ChromeDriver driver)
{
	this.driver=driver;
}

public AirPurifier clkcategory() throws InterruptedException {

	
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.querySelector('._19km').click();");
	Actions act = new Actions(driver);
	Thread.sleep(5000);
	act.moveToElement(driver.findElementByXPath("//a[text()='TVs & Appliances']")).perform();
	driver.findElementByLinkText("Air Purifiers").click();
		

	return new AirPurifier(driver);
}


}

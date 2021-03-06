package day2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {

	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage menulink() {
		driver.findElementByXPath("//button[@id='header-Header-sparkButton']/span[1]/img[1]").click();
		return this;
	}
	
	public HomePage mousehover() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//button[@data-sub-depts-nav-target='dept-PgMPhveR-children']"));
		action.moveToElement(we).build().perform();
		return this;
	}
	
	public ShoePage shoes() {
		driver.findElementByXPath("//div[text()='Shoes']").click();
		return new ShoePage(driver);
	}
}

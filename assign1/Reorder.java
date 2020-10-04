package week4.assign1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reorder {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/sortable/");
	    Actions builder=new Actions(driver);
	    driver.switchTo().frame(0);
	WebElement Ele1 = driver.findElementByXPath("//li[text()='Item 1']");
	int x = Ele1.getLocation().getX();
	int y = Ele1.getLocation().getY();
	WebElement Ele4 = driver.findElementByXPath("//li[text()='Item 4']");
	int x1 = Ele4.getLocation().getX();
	int y1 = Ele4.getLocation().getY();
	
	  builder.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
      //builder.moveToElement(Ele4, x1, y1).moveToElement(Ele1).doubleClick(Ele1).keyDown(Ele1,Keys.CONTROL).moveToElement(Ele4).keyUp(Keys.CONTROL).build().perform();
	builder.moveToElement(Ele1, x, y).doubleClick(Ele1).clickAndHold().moveByOffset(x1, y1).release().perform();
	
	}
	
	

}

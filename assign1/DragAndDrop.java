package week4.assign1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/droppable/");
	  
	    
	    Actions builder=new Actions(driver);
	       

	    WebElement drag = driver.findElementByXPath("//div[contains(@class,'ui-widget-content ui-draggable')]");   
        WebElement drop = driver.findElementByXPath("//div[contains(@class,'ui-widget-header ui-droppable')]");
        int x = drag.getLocation().getX();
        int y=drag.getLocation().getY();
        int x1 = drop.getLocation().getX();
        int y1=drop.getLocation().getY();
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		driver.switchTo().frame(0);
                 builder.moveToElement(drag, x, y).doubleClick(drag).moveToElement(drop, x1, y1).dragAndDropBy(drag, x, y).release().perform();
	}

}

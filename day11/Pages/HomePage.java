package day11.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {

	public HomePage(EdgeDriver driver) {
	this.driver=driver;
	
}
	public HomePage clkPremium() throws InterruptedException {
			
		Thread.sleep(3000);
		driver.navigate().refresh();
		Actions act=new Actions(driver);
		WebElement menu = driver.findElementByLinkText("Computer Glasses");
		WebElement submenu = driver.findElementByXPath("//span[@class='uppercase']");
		WebElement submenu2 = driver.findElementByXPath("//span[text()='PREMIUM RANGE']");
		Thread.sleep(5000);
		act.moveToElement(menu).moveToElement(submenu).moveToElement(submenu2).click(submenu2).build().perform();
		List<WebElement> checkbox = driver.findElementsByXPath("//label//input[@type='checkbox']/following-sibling::span");
		  int temp=0;
		   int checkposition=0;
		   String toclickchkbox="";
		for (int i = 11; i < checkbox.size(); i++) {
			String checkname=driver.findElementByXPath("//label//input[@type='checkbox']/following-sibling::span["+i+"]").getText();
			int checkboxes =Integer.parseInt(driver.findElementByXPath("//label//input[@type='checkbox']/following-sibling::span["+i+"]").getText().replaceAll("[^\\d]", ""));
			if(checkboxes>temp) {
				toclickchkbox=checkname;
				temp=checkboxes;
				checkposition=i;
				
			}
				}
			driver.findElementByXPath("//label//input[@type='checkbox']/following-sibling::span)["+checkposition+"]").click();
			Thread.sleep(4000);

		
		
		return this;
	}



}

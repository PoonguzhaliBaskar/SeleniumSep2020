package day7.Pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day7.Pages.Base;

public class HomePages extends Base {
	

public HomePages(FirefoxDriver driver)
{
	this.driver=driver;
	}

public HomePages search() throws InterruptedException {
	driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
	WebElement search = driver.findElementByClassName("_3704LK");
	search.sendKeys("Home Theaters");
	Thread.sleep(2000);
	driver.findElementByClassName("L0Z3Pu").click();
	Thread.sleep(4000);
	return this;
}

public HomePages custrating() throws InterruptedException {
	 Actions action = new Actions(driver);
	 
	 WebElement resultsnos = driver.findElementByClassName("_10Ermr");
	 String text = resultsnos.getText();
	 System.out.println(text);
	 WebElement ratingchkbox = driver.findElementByXPath("(//div[@class='_24_Dny'])[1]");
	// action.moveToElement(ratingchkbox).perform();
	 Thread.sleep(3000);
	 //action.click().build().perform();
	 ratingchkbox.click();
	 Thread.sleep(4000);
	 
	 WebElement resultsnos1 = driver.findElementByClassName("_10Ermr");
	 String text1 = resultsnos1.getText();
	 System.out.println(text1);
	 return this;
}

public HomePages hightolow() throws InterruptedException {
driver.findElementByXPath("//div[text()='Price -- High to Low']").click();
Thread.sleep(3000);
String color = driver.findElementByXPath("//div[text()='Price -- High to Low']").getCssValue("color").trim();
System.out.println("Color:"+color);
return this;
}

public HomePages checkforsort(){
	List<WebElement> price = driver.findElementsByXPath("//div[@class='_30jeq3']");
	int size = price.size();
	System.out.println(size);

	Integer[] actual=new Integer[size];
	Integer[] sorted=new Integer[size];
	for (int i = 0, j=1; i < size; j++,i++) {
	sorted[i]=Integer.parseInt(driver.findElementByXPath("(//div[@class='_30jeq3'])["+j+"]").getText().replaceAll("[^\\d]", ""));
			//System.out.println("before sorted:"+sorted[i]);
		//	sorted[i]=sorted[i].substring(1, sorted[i].length());
			actual[i]=sorted[i];
		System.out.println("after sorted:"+sorted[i]);
	
}
	//Sorting array
	Arrays.sort(sorted);

		for(int i = size-1, j=0; i >0; j++,i--) {
		//System.out.println("size:"+size);
		System.out.println("Sorted value:"+sorted[i] +"Actual Value" + actual[j]);


		if(actual[j]!=sorted[i]){
			System.out.println("Results not sorted");
			break;
		}
		
		}
			return this;
	
}

public Comparepage compare() throws InterruptedException {
	 Actions action = new Actions(driver);
	driver.executeScript("window.scrollBy(0,100)");
	 
	 WebElement compare1clk = driver.findElementByXPath("//label[@class='_6Up2sF']//span");
	 Thread.sleep(2000);
	WebElement compare1 = driver.findElementByXPath("(//div[@class='CXW8mj'])[3]//img");
			
	 WebElement compare2clk = driver.findElementByXPath("(//div[@class='_3PzNI-'])[2]//label");
	 WebElement compare2 = driver.findElementByXPath("(//div[@class='CXW8mj'])[4]//img");
    action.moveToElement(compare1).click(compare1clk).moveToElement(compare2).click(compare2clk).perform();
    Thread.sleep(5000);
   
	
	driver.findElementByXPath("//a[@class='_11o22n _87aCMT']").click();
		 return new Comparepage(driver);
	 
}

}


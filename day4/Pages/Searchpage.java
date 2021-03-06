package day4.Pages;

import java.time.LocalDate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchpage extends Base {
	String text;
	String confirmtext;
	

public Searchpage(ChromeDriver driver) {
	Base.driver=driver; 
}



public Searchpage popular() {
	driver.findElementByXPath("//div[@class='items']").click();
return this;
}
public Searchpage next() {
	driver.findElementByTagName("button").click();
return this;
}
public Searchpage date() throws InterruptedException {
		/*
		 * LocalDate today = LocalDate.now(); int Date = today.getDayOfMonth(); int year
		 * = today.getYear(); int month = today.getMonthValue();
		 * System.out.println(year+"-"+month+"-"+Date+1);
		 */
		
	  WebElement datesel = driver.findElementByXPath("(//div[@class='text'])[2]");
	  Thread.sleep(4000); 
	  datesel.click();
	//div[@class='day']
	   text = datesel.getText();
	   Thread.sleep(4000); 
return this;
}
public Searchpage confirmdate() throws InterruptedException {
	Thread.sleep(3000);
  WebElement confirmdate = driver.findElementByXPath("//div[@class='day picked ']");
    boolean selected = confirmdate.isDisplayed();
  if(selected==true) {
	  System.out.println("date is confirmed");
  }else {
	  System.out.println("date not confirmed");
  }
return this;
}

public Searchresult done() {
	driver.findElementByTagName("button").click();
return new Searchresult(driver);
}

}
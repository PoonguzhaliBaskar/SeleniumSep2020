package day10.Pages;

import java.time.LocalDate;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePage extends Base {

	public HomePage(EdgeDriver driver)
	{
		this.driver=driver;
	}
	
	public BookingPage fromTo() throws InterruptedException {
		driver.findElementById("dest").sendKeys("Bangalore");
		driver.findElementByXPath("//li[@data-id='122']").click();
        driver.findElementById("dest").sendKeys(Keys.SHIFT,Keys.TAB);
        driver.findElementById("src").sendKeys("Chennai");
        driver.findElementByXPath("//li[@data-id='123']").click();
        driver.findElementById("src").sendKeys(Keys.TAB,Keys.TAB);
        Thread.sleep(3000);
       String month="Dec 2020";
       String date="7";
       
       //Month selection
                while(true)
        {
        	String monthdata =driver.findElementByXPath("//td[@class='monthTitle']").getText();
        	
        	if(monthdata.equals(month)) {
        		break;
        	}
        	else {
        		 driver.findElementByXPath("//td[@class='next']").click();
        	} 
        }    
                //date selection
             driver.findElementByXPath("//tr//td[contains(text(),"+date+")]").click();
              driver.findElementById("search_btn").click();
		return new BookingPage(driver);
	}


}

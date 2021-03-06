package day4.Pages;

import java.security.Key;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Searchresult extends Base {
	public Searchresult(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public Searchresult srchresult() throws InterruptedException
	{

		 List<WebElement> carsname =driver.findElementsByXPath("//div[@class='car-listing']//h3");   
		
		 List<WebElement> price =driver.findElementsByXPath("//div[@class='car-listing']//div[@class='price']"); 
		 TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	    		System.out.println(carsname.size());
		      for(int i=0 ;i<carsname.size();i++)
		        {
		    	  String carname = carsname.get(i).getText();
		    	  String carprice=price.get(i).getText();
		    	  carprice=carprice.replaceAll("[^\\d]", "");
		          System.out.println(carname);
		          System.out.println(carprice);
			
			  map.put(Integer.parseInt(carprice),carname);
			  			 
		                }
		      System.out.println(map);
		     System.out.println(map.descendingKeySet());
		     System.out.println("Highest value:"+ map.lastEntry());
		 for (int i = 0; i < carsname.size(); i++) {
			 System.out.println("Booking key"+map.lastEntry().getValue());
			 System.out.println("Text"+carsname.get(i).getText());
			if(map.lastEntry().getValue().equalsIgnoreCase(carsname.get(i).getText())) {
				driver.findElementByXPath("//button[@name='book-now']").click();
				Thread.sleep(5000);
							break;
			}
			
		}
				      return this;
	}



}

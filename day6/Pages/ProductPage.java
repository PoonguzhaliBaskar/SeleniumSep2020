package day6.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Base {
	String interest;
	String emi;
	String Leastvalue;
public ProductPage(ChromeDriver driver)
{
	this.driver=driver;
}

public ProductPage emi() throws InterruptedException {
		
		  Set<String> winHandles=driver.getWindowHandles();
		  List<String>listhandles1=new ArrayList<String>(winHandles); String
		  secwinref=listhandles1.get(1); driver.switchTo().window(secwinref);
		 Thread.sleep(4000);
	driver.findElementByXPath("//span[text()='Select EMI']").click();
	Thread.sleep(3000);
	return this;
	
}
public ProductPage banksemiData() throws InterruptedException {
	driver.switchTo().frame(0);
	Thread.sleep(4000);

	List<WebElement> Banks = driver.findElementsByXPath("//span[@class='_2fFV']");
	int size = Banks.size();
	System.out.println("Bank size:"+size);
	
	 TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	
	 
	 //Get the first 6 bank's EMI amount and Total Interest amount for 9 months and add it into Map
	      for(int i=1 ;i<size;i++)
	        {
	    	  driver.findElementByXPath("(//div[@class='_2p6S'])["+i+"]/following-sibling::i").click();
	    	  Thread.sleep(4000);
	    	  WebElement totalinterest =driver.findElementByXPath("(//div[@class='_3Dz1'])[6]");   
	  	    	   interest = totalinterest.getText();
	  	    	  	WebElement Emiamt = driver.findElementByXPath("(//div[@class='_3Dz1 _1Z3T'])[3]");
	    	   emi=Emiamt.getText();
	    	 	  System.out.println("Emi:"+emi);
	    	  System.out.println("Interest:"+ interest);
	    	  driver.findElementByXPath("(//div[@class='_2p6S'])["+i+"]/following-sibling::i").click();
			
	    	  map.put(Integer.parseInt(interest),emi); 
			 
	          if(i==6) {
	        	  break;
	          }
	        }
	         System.out.println("Map:"+map);
	         Entry<Integer, String> firstEntry = map.firstEntry();
	          Leastvalue=map.firstEntry().getValue().substring(0,map.firstEntry().getValue().indexOf("@"));
	               System.out.println("Leastvalue:"+Leastvalue);
	               Thread.sleep(3000);
	            
		// Pick the least EMI amount and verify the total interest amount(EMI amount * 9m -(original cost))
	     // Select the least EMI amount and close EMI tab
		  for (int j = 1; j < size; j++) {
		  
		  driver.findElementByXPath("(//div[@class='_2p6S'])["+j+"]/following-sibling::i").click(); 
		  Thread.sleep(4000);
		  
		  WebElement Emiamt1 =driver.findElementByXPath("(//div[@class='_3Dz1 _1Z3T'])[3]");
		  String emi = Emiamt1.getText();
		 String eminew=emi.substring(0,emi.indexOf("@"));
			/*
			 * System.out.println(eminew); System.out.println(Leastvalue);
			 */
		 		  if(eminew.contains(Leastvalue)) {
			
			  double val= (Double.parseDouble(eminew)*9-(5999));
		  System.out.println("Total:"+val);
		  driver.findElementByXPath("(//div[@class='_2p6S'])["+j+"]/following-sibling::i").click();
}
		 		  else {
		  driver.findElementByXPath("(//div[@class='_2p6S'])["+j+"]/following-sibling::i").click();
		 		  }
		  if(j==6) {
        	  break;
          }
		  } 
		 //Click on view more offers and select the highest amount and verify
		 
	         driver.switchTo().defaultContent();
	         driver.findElementByXPath("//div[@class='_2ACe']/following-sibling::div[1]").click();
	        
	         WebDriverWait wait = new WebDriverWait(driver, 40);
	 		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_3S7f")));
	    Actions act=new Actions(driver);
	    act.moveToElement(message).perform();
	 	 		message.click();
	        Thread.sleep(5000);
		  driver.findElementByXPath("(//div[@class='_1IQU']//div)[2]").click();
		  Thread.sleep(3000);
		  
		  //Click on Buy Now
		  WebElement buy = driver.findElementByXPath("//span[@content='5999']//i");
            act.moveToElement(buy).perform();  
	 		WebElement buyprod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@content='5999']//i")));
           buyprod.click();
           Thread.sleep(4000);
		 
	      return this;
}

}

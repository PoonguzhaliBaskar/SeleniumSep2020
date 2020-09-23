package week2Assignment;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Checkboxes {

	//private static final boolean WebElement = false;
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://leafground.com/pages/checkbox.html");
	        
	        //Select multiple check boxes
	        driver.findElementByXPath("//label[text()='Select the languages that you know?']/following::input").click();
	        driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[3]").click();
	        
	        //Confirm Selenium is checked
	       boolean check= driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[6]").isSelected();
	       
	       if (check==true) {
	        	System.out.println("IT is checked");}
	        	else
	        	{
	        		System.out.println("Not Checked");
	        	}
	       
	     
	       //Deselect if the checkbox is selected
	     // WebElement NotSelected= driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[7]");
	      WebElement Selected= driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[8]");
	      boolean check2=Selected.isSelected(); 
	       	      if (check2== true) {
	    	  	    	   Selected.click();	    	      	  
	       }
	      
	       	
	       	//Select all the checkbox options
	    WebElement driver1= driver.findElementByXPath("(//input[@type='checkbox'])[9]");
	    WebElement driver2=  driver.findElementByXPath("(//input[@type='checkbox'])[10]");
	    WebElement driver3= driver.findElementByXPath("(//input[@type='checkbox'])[11]");
	    WebElement driver4= driver.findElementByXPath("(//input[@type='checkbox'])[12]");
	    WebElement driver5=  driver.findElementByXPath("(//input[@type='checkbox'])[13]");
        driver1.click();
	    driver2.click();
	    driver3.click();
	    driver4.click();
	    driver5.click();
	    Thread.sleep(1000);
	     			
	     driver.close();
	     			}
	       
	}

	     			
								
			

	
	
	
	

	        

	



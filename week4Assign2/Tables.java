package week4Assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		// Getting column count
		List<WebElement> countcolmn = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
		System.out.println("No of colums:" + countcolmn.size());

		// Getting row count
		List<WebElement> countrow = driver.findElementsByXPath("//table[@id='table_id']//tr");
		System.out.println("No of rows:" + countrow.size());
		
		// getting progress value
		for (int i = 3; i <= 3; i++) {
			
				WebElement progress = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[2]");
			String text = progress.getText();
				System.out.println("Progress value:" + text);
			
		}

		// Least Completed Progress
		
	    	//Declaring an empty array
	      	ArrayList<Integer> newval = new ArrayList<Integer>();
				for (int k = 2; k <= 5; k++) {
			String leastvalue = driver.findElementByXPath("//table[@id='table_id']//tr["+k+"]/td[2]").getText();
			
			// REmoving special characters using regular expression
				String newleastvalue = leastvalue.replaceAll("%", "");
				
			 // String to integer
				  int least = Integer.parseInt(newleastvalue);
				  								  
			//Add int to array
				  newval.add(least);		  
		     	}
					
	    	// sorting array	
				  Collections.sort(newval); 
				  System.out.println("Smallest:"+newval.get(0));
				  driver.findElementByXPath("//td[text()='"+newval.get(0)+"%']/parent::tr//td[3]/input").click();
				  
				  }
					}
		



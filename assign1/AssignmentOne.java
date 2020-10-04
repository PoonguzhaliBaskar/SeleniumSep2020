package week4.assign1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/pages/table.html");
	    
	    //Getting column count
	   List<WebElement> countcolmn = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
        System.out.println("No of colums:"+countcolmn.size());

        //Getting row count
        List<WebElement> countrow = driver.findElementsByXPath("//table[@id='table_id']//tr");
        System.out.println("No of colums:"+countrow.size());
 
        //getting progress value
        	for (int i = 3; i <= 3; i++) {
        	for (int j = 2; j <=2; j++) {
	      	WebElement value = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]");
        	String text = value.getText();
        	System.out.println("Value of learn to interact:"+text);
		
			//Check the least completed progress check		
				WebElement value1 = driver.findElementByXPath("(//input[@name='vital'])[3]");
				value1.click();
				driver.close();
			}
}
}}




package week2Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/radio.html");
        
        //selecting radio button
         driver.findElementByXPath("//input[@id='yes']").click();
   
        //Find default selection---- not working
        boolean actual= driver.findElementByXPath("(//input[@name='news'])[2]").isSelected();
        if (actual == true) {
        	System.out.println("Checked is selected");
        }
        else {
        	System.out.println("Unchecked is selected");
        }
        
        //Select you age group
        
        WebElement radio1=driver.findElementByXPath("(//input[@value='0'])[3]");
        WebElement radio2=driver.findElementByXPath("(//input[@class='myradio'])[4]");
        WebElement radio3=driver.findElementByXPath("(//input[@class='myradio'])[5]");
        //boolean check1=radio1.isSelected();
        boolean check2=radio2.isSelected();
        //boolean check3=radio3.isSelected();
        if(check2==true)
       {  
    	   radio1.click();
          	Thread.sleep(1000);
       	System.out.println("1-20years selected");
        radio3.click();
       	Thread.sleep(1000);
    	System.out.println("Above 40years selected");
    	radio2.click();
    	Thread.sleep(1000);
    	System.out.println("21-40years selected");
       }
            Thread.sleep(1000);
            driver.close();
        }
	}
        	
 
        
        
 	       
     


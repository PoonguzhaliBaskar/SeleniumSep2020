package week2Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Edit {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://leafground.com/pages/Edit.html");
	        driver.findElementByXPath("//input[@id='email']").sendKeys("bala_poo@yahoo.co.in");
	        driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Name");
	        driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
	        String Text=driver.findElementByXPath("//input[@name='username']").getText();
	       	System.out.println(Text);
	         driver.findElementByXPath("(//input[@name='username'])[2]").clear();
	         Thread.sleep(1000);
	        boolean field= driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
	        if (field == true) {
	        	System.out.println("Field enabled");}
	        	else {
	        		System.out.println("Field Disabled");
	        	}
	        		driver.close();
	        	}
	        
	         
	}



package week2Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://leafground.com/pages/Link.html");
	       
	        //Home page
	        driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
	        String Home=driver.getCurrentUrl();
	        System.out.println("Displayed Current page URL is:" +Home);     
	        driver.findElementByXPath("//img[@class='wp-categories-icon svg-image'][@src='images/link.png']").click();
	        
	        //Find where am i supposed to go without clicking -Used keyboard tabs and click

	        driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']");
	        driver.navigate().to("http://leafground.com/pages/Button.html");
	        Thread.sleep(2000);
	       
	        // driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").click();
	        driver.findElementByXPath("//button[@id='home']").click();
	        
	        //Verify Am I Broken
	        
	        driver.findElementByXPath("//img[@class='wp-categories-icon svg-image'][@src='images/link.png']").click();
	        driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
	        String Error =driver.getCurrentUrl();
	        String ExpectedURL = "http://leafground.com/pages/error.html";
	        if (Error .equalsIgnoreCase( ExpectedURL))
	        {
	        	System.out.println("Error page displayed");
	        }
	        else{
	        	System.out.println("we are in wrong page");
	        }
	        System.out.println(Error);
	        
	        
	        driver.close();
	      	}
	       

}

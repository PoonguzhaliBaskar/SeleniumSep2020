package week2Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Buttons {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://leafground.com/pages/Button.html");
	       
	        //Home button
	        driver.findElementByXPath("//button[@id='home']").click();
	        driver.findElementByXPath("//h5[@class='wp-categories-title'][text()='Button']").click();
	        
	        //XY Location
	        WebElement xy=driver.findElementByXPath("//button[@id='position']");
	        Point Location=xy.getLocation();
	        int x= Location.getX();
	        int Y= Location.getY();
	        System.out.println("X is:"+x);
	        System.out.println("Y is:"+Y);
	        
	        //Color
	        String Color=driver.findElementByXPath("//button[@id='color']").getCssValue("color");
	        System.out.println("Color is:"+Color);
	        
	        //Height and Width
	                
	        WebElement position=driver.findElementByXPath("//button[@id='size']");    
	        int PositionX=position.getSize().getWidth();
	        int PositionY=position.getSize().getHeight();
	        System.out.println("X is:"+PositionX);
	        System.out.println("Y is:"+PositionY);
	        driver.close();
	}

}

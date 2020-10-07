package week4Assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		  driver.get("http://leafground.com/pages/frame.html");
		  driver.switchTo().frame(0); 
		driver.findElementById("Click").click();
		
		  
		
		  driver.get("http://leafground.com/pages/frame.html");
		  driver.switchTo().frame(1); 
		  driver.switchTo().frame("frame2");
		  driver.findElementByXPath("//button[text()='Click Me'][@id='Click1']").click(
		  );
		 
	    
	    //total no of iframes 
	    driver.get("http://leafground.com/pages/frame.html");
	    int size = driver.findElements(By.tagName("iframe")).size();
	    int count=size;
	    System.out.println("Iframe count is:"+count);
	    for(int i=0; i<size; i++){
		driver.switchTo().frame(i);
		count=count+driver.findElementsByTagName("iframe").size();
		driver.switchTo().defaultContent();
			    
	}
System.out.println(count);
}
}

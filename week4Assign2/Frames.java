package week4Assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		//1st part
		  driver.get("http://leafground.com/pages/frame.html");
		  driver.switchTo().frame(0); 
		  WebElement frame1 = driver.findElementById("Click");
		frame1.click();
		String text = frame1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		  
		//2nd part
		 
		  driver.switchTo().frame(1); 
		  driver.switchTo().frame("frame2");
		  WebElement ele1 = driver.findElementByXPath("//button[text()='Click Me'][@id='Click1']");
		 ele1.click();
		 String text2 = ele1.getText();
		 System.out.println(text2);
		 driver.switchTo().defaultContent();
			    
	    //total no of iframes 
		  int size = driver.findElements(By.tagName("iframe")).size();
	          System.out.println(size);
		  int count=0;
		  for(int i=0; i<size; i++){
		  driver.switchTo().frame(i);
                  count=count+driver.findElementsByTagName("iframe").size();
		  driver.switchTo().defaultContent();
				    
		}
			System.out.println(count);
			int Total=size+count;
			System.out.println("Total  iframe count is:"+Total);
		  
		 	  driver.close();
}
}

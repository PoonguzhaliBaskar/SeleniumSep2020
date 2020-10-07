package week4Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/pages/Window.html");
	    //Clicking Home page
	   	driver.findElementById("home").click();
		
	   	//No of opened windows
		 Set<String> winhandles=driver.getWindowHandles();
		    int numberOfWindows=winhandles.size();
		    System.out.println("Opened Windows:"+numberOfWindows);
		    
		 //Do not close me   
		    driver.findElementById("color").click();
		    Set<String> winhandles1 = driver.getWindowHandles();
			List<String> listhandles1=new ArrayList<String>(winhandles1);
			String secwinref2=listhandles1.get(1);
			//String firstwinref1=listhandles1.get(0);
			driver.switchTo().window(secwinref2);
			driver.close();
			
		//wait for 5 seconds
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement findElementByXPath = driver.findElementByXPath("//button[@id='color'])[2]");
			Thread.sleep(2000);
			findElementByXPath.click();
	}

}

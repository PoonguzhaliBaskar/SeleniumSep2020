package day29justdial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Justdial {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup(); 
		  // DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  ChromeOptions options=new ChromeOptions(); 
		  //
		  options.addArguments("--diable notifications");
		  options.addArguments("incognito");
		  
		  	  
		  ChromeDriver driver=new ChromeDriver(options);
		 
		/*
		 * EdgeOptions options = new EdgeOptions(); options.addArguments("incognito");
		 * WebDriverManager.edgedriver().setup(); EdgeDriver driver=new
		 * EdgeDriver(options);
		 */
		driver.manage().window().maximize();

         driver.get("https://www.justdial.com/in");
         
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.findElement(By.id("city")).clear();
         driver.findElement(By.id("city")).sendKeys("Chennai");
         driver.findElement(By.id("Chennai")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("hotkeys_text_7")).click();
         driver.findElement(By.xpath("//span[@title='Car Repair']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//span[@title='Hyundai']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//span[@title='Hyundai Accent']")).click();
         Thread.sleep(3000);
         WebElement alloptions = driver.findElement(By.xpath("//span[@title='All Options']"));
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].click();",alloptions);
         Thread.sleep(3000);
         //driver.switchTo().alert().dismiss();
         driver.findElement(By.xpath("//a[text()='Location']")).click();
         driver.switchTo().alert().sendKeys("porur");
         driver.findElementById("sortbydist").sendKeys(Keys.ARROW_DOWN.ENTER);
         
         
         
	}

}

package day10.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookingPage extends Base {
	public BookingPage(EdgeDriver driver)
	{
		this.driver=driver;
	}
	
	public BookingPage buslist() throws InterruptedException, IOException
	{
		
		List<WebElement> buscount = driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");
		Thread.sleep(5000);
		int size=buscount.size();
		System.out.println("Buscount:"+size);
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[6]").click();
		Thread.sleep(7000);
		
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement price = driver.findElementByXPath("//div[@class='fare d-block']");
		WebElement seats = driver.findElementByXPath("//div[@class='column-eight w-15 fl']");
		Thread.sleep(5000);
		driver.executeScript("arguments[0].scrollIntoView();", price);
	
		driver.executeScript("arguments[0].scrollIntoView();", seats);
		
		 //capturescreenshot
		TakesScreenshot scrShot =((TakesScreenshot)price);
		File f1=scrShot.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(f1, new File("C:\\projectScreenshots\\logoScreeshot1.png"));
		   Thread.sleep(3000);
		   TakesScreenshot scrShot2 =((TakesScreenshot)seats);
		   File f2=scrShot2.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(f2, new File("C:\\projectScreenshots\\logoScreeshot2.png"));
		   
		return this;
	}
	
	public BookingPage busimage() throws IOException, InterruptedException {
		Thread.sleep(4000);
		WebElement view = driver.findElementByXPath("(//div[@class='button view-seats fr'])[1]");
		WebElement busphoto = driver.findElementByXPath("(//li[@class='amenties b-p-list'])[3]");
		Actions act=new Actions(driver);
		act.moveToElement(view).moveToElement(busphoto).click().build().perform();
		Thread.sleep(3000);
		//print bus image		
		WebElement image = driver.findElementByXPath("(//img[@class='bus-image-new'])[2]");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.executeScript("arguments[0].scrollIntoView();", image);
		//capturescreenshot
				File f3=image.getScreenshotAs(OutputType.FILE);
				   FileUtils.copyFile(f3, new File("C:\\projectScreenshots\\logoScreeshot3.png"));
		return this;
	}
}

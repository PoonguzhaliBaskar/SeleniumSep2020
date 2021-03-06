package day2.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
		public static ChromeDriver driver;
	
	@BeforeMethod
	public void startApplication(){
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

}

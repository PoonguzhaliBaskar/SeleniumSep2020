package day12.PagesZomato;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static ChromeDriver driver;
	
	@BeforeMethod
	public void startApplication(){
		WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--Headless mode");
	
		 driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.zomato.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}


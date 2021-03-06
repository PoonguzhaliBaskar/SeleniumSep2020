package day6.Pages;
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
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://paytmmall.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}}

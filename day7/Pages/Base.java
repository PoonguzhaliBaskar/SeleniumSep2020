package day7.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static FirefoxDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void startApplication(){
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications");
		 */
		WebDriverManager.firefoxdriver().setup();
		// driver=new FirefoxDriver();
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}}

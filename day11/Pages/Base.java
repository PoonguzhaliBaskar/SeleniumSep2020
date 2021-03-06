package day11.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static EdgeDriver driver;
	
	@BeforeMethod
	public void startApplication(){
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}

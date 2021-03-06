package day4.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static ChromeDriver driver;
	public static ExtentTest test,node;
	public String testAuthor,testCategory;
@BeforeMethod
public void startApplication(){
	WebDriverManager.firefoxdriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zoomcar.com/chennai");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@AfterMethod
public void closeBrowser(){
	driver.close();
}

/*@BeforeClass
public void testDetails() {
	  test.assignAuthor(testAuthor);
	  test.assignCategory(testCategory);*/
}


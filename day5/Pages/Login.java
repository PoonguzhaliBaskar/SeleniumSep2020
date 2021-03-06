package day5.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Base {
public Login(ChromeDriver driver) 
{
this.driver=driver;
}

public HomePage Login() {
	driver.findElementById("username").sendKeys("hari.radhakrishnan@testleaf.com");
	driver.findElementById("password").sendKeys("India$123");
	driver.findElementById("Login").click();
	return new HomePage(driver);
}
}

package day4.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Journeystart extends Base {


	public Journeystart( ChromeDriver driver)
	{
		this.driver=driver; 
		
	}
	public  Searchpage clicklink() {
		driver.findElementByLinkText("Start your wonderful journey").click();
		return new Searchpage(driver);

	}
}

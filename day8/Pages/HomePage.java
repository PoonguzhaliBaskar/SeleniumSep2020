package day8.Pages;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import kotlin.text.Regex;



public class HomePage extends Base {
	
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
		}
	
	public HomePage search() throws InterruptedException {
		
	Actions action=new Actions(driver);
	WebElement women = driver.findElementByXPath("//a[@href='/shop/women']");
WebElement Brands=driver.findElementByXPath("//div[@id='appContainer']/div[1]/div[1]/header[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[2]/a[1]");
	action.moveToElement(women).perform();
	Thread.sleep(5000);
	action.moveToElement(Brands).perform();
	Thread.sleep(4000);
	List<WebElement> womenbrands = driver.findElementsByXPath("(//div[@class='menu-lsec menu-lsec-full-width '])[4]//a");
    int size = womenbrands.size();
   System.out.println(size);
   String lowercasename="";
   int lowercasesize=0;
   int loswercaseposition=0;
	for (int i = 1; i <= size; i++) {
		String fullname = driver.findElementByXPath("((//div[@class='menu-lsec menu-lsec-full-width '])[4]//a)["+i+"]").getText();
		String lcName = removingUpperCaseCharacters(fullname);
		System.out.println("orginal string " +fullname+ "after removal "+lcName );
	if(lcName.length()>lowercasesize) {
		lowercasename=fullname;
		lowercasesize=lcName.length();
		loswercaseposition=i;
		System.out.println("The most lowest case string:"+lowercasename +"position:"+i);
		
	}
		}
	driver.findElementByXPath("((//div[@class='menu-lsec menu-lsec-full-width '])[4]//a)["+loswercaseposition+"]").click();
	Thread.sleep(4000);
	return this;
	 
	}
	 public static String
	    removingUpperCaseCharacters(String str)
	    {
	 
	        // Create a regular expression
	        String regex = "[A-Z]";
	 
	        // Compile the regex to create pattern
	        // using compile() method
	        Pattern pattern = Pattern.compile(regex);
	 
	        // Get a matcher object from pattern
	        Matcher matcher = pattern.matcher(str);
	 
	        // Replace every matched pattern with the
	        // target string using replaceAll() method
	        return matcher.replaceAll("");
	    }

public HomePage noOfItems() throws InterruptedException{
     Thread.sleep(4000);
	WebElement intialnoofprod = driver.findElementByXPath("//div[@class='length']");
	String text1 = intialnoofprod.getText().replaceAll("[^\\d]", "");
	//Regex.replace(text1,"[0-9]", "");
	System.out.println(text1);
	int prod = Integer.parseInt(text1);
	System.out.println(prod);
	driver.findElementByXPath("//span[text()='size & fit']").click();
	driver.findElementByXPath("//label[@for='S']").click();
	

	Thread.sleep(5000);
	WebElement noofprod = driver.findElementByXPath("//div[@class='length']");
	String text2 = noofprod.getText().replaceAll("[^\\d]", "");
	int prod2 = Integer.parseInt(text2);
	System.out.println(prod2);
	if(prod>=prod2)
	{
		System.out.println("value reduced from:"+prod+"to"+prod2);
	}
	return this;
}

public HomePage sort() throws InterruptedException{
	driver.findElementByTagName("select").click();
	Thread.sleep(3000);
	driver.findElementByXPath("//select//option[@value='discount-desc']").click();
	//	check the display of discount
	
	List<WebElement> proddiscount = driver.findElementsByXPath("//span[@class='discount']");
	Thread.sleep(5000);
	int size = proddiscount.size();
	System.out.println(size);
	for (int i = 1; i <= size; i++) {
		WebElement discount = driver.findElementByXPath("(//span[@class='discount'])["+i+"]");
		System.out.println("Dicsount as displayed list:"+discount.getText());
		
	}
	return this;
}

}
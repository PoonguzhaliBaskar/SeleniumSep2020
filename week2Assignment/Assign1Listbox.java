package week2Assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Listbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       
        //select the value using index
        driver.get("http://leafground.com/pages/Dropdown.html");
       WebElement dropdown1= driver.findElementByXPath("//select[@id='dropdown1']");
       Select index=new Select(dropdown1);
       index.selectByIndex(2);
       Thread.sleep(2000);
       index.selectByIndex(3);
       List<WebElement> option=index.getOptions();
       int size=option.size();
       System.out.println(size);
       index.selectByIndex(size-2);
       
       //Select program using text
       WebElement Dropdown2=driver.findElementByXPath("//option[text()='Select training program using Text']/parent::select");
       Select index1= new Select(Dropdown2);
       index1.selectByVisibleText("Appium");
       Thread.sleep(1000);
       index1.selectByVisibleText("UFT/QTP");
       
       //Select program using value
       WebElement Dropdown3=driver.findElementByXPath("//select[@id='dropdown3']");
       Select index3=new Select(Dropdown3);
       index3.selectByValue("1");
       Thread.sleep(1000);
       index3.selectByValue("3");
       Thread.sleep(1000);
       
       //Get no of Dropdown options
       WebElement dropdown4= driver.findElementByXPath("//select[@class='dropdown']");
       Select index4=new Select(dropdown4);
       List<WebElement> Options=index4.getOptions();
       int size2=Options.size();
       System.out.println(size2);
       
       //values selected using send keys
       driver.findElementByXPath("(//div[@class='example']/child::select)[5]").sendKeys("Appium");
       driver.findElementByXPath("(//div[@class='example']/child::select)[5]").sendKeys("UFT/QTP");
       Thread.sleep(1000);
       driver.findElementByXPath("(//div[@class='example']/child::select)[5]").sendKeys("Loadrunner");

       //Select a program 
       WebElement Dropdown5=driver.findElementByXPath("(//select)[6]");
       Select index5=new Select(Dropdown5);
       index5.selectByVisibleText("Appium");
       index5.selectByVisibleText("UFT/QTP");
       index5.selectByVisibleText("Loadrunner");
       Thread.sleep(1000);
       index5.deselectByVisibleText("Loadrunner");
       driver.close();
	}

}

package day2.Pages;

import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoePage extends Base {

	public ShoePage(ChromeDriver driver)
	{
		Base.driver=driver;
	}
	
	public ShoePage Womenshoeclk() {
		Actions action1 = new Actions(driver);
		WebElement shoeclick = driver.findElement(By.xpath("(//a[@title='Comfort Shoes'])[3]"));
		action1.moveToElement(shoeclick).build().perform();
		shoeclick.click();
		driver.findElementByXPath("//a[@title='Sneakers']").click();
		return this;
	}
	
	public ShoePage titlePrice() {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		List<WebElement> shoestitleflexx = driver.findElementsByXPath("//strong[text()='The Flexx']");
		//List<WebElement> shoestitleprop = driver.findElementsByXPath("//strong[text()='Propet']");
		List<WebElement> flexxprices = driver.findElementsByXPath("//span[@class='price display-inline-block arrange-fit price price-main']");
		for (int i = 0; i < shoestitleflexx.size(); i++) {
			String flexxtitle = shoestitleflexx.get(i).getText();
			String flexxprice = flexxprices.get(i).getText();
			flexxprice.replaceAll("['^[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))$']", "");
		//	flexxprice.split("$");
			System.out.println(flexxtitle);
			System.out.println(flexxprice);
			// map.put(Integer.parseInt(flexxprice),flexxtitle);
		
		}
		 return this;
		}
	}


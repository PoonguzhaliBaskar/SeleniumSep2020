package day27carwale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Objects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Carwale {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='USED CARS']")).click();
		driver.findElement(By.xpath("//div[text()='Find Used Cars']")).click();
		driver.findElementById("closeLocIcon").click();
		Thread.sleep(3000);
		driver.findElementById("budgetBtn").click();
		driver.findElementById("minInput").sendKeys("8");
		driver.findElementById("maxInput").sendKeys("12");
		driver.findElementById("btnSetBudget").click();
		driver.findElementByXPath("//span[contains(@class,'select-box fa')]/following-sibling::select").click();
		Select city = new Select(
				driver.findElementByXPath("//span[contains(@class,'select-box fa')]/following-sibling::select"));
		city.selectByValue("176");

		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Cars with Photos']").click();
		Thread.sleep(2000);
		// driver.findElementByXPath("//input[@placeholder='Select
		// Manufacturer']").sendKeys("Hyundai");
		driver.findElementByXPath("//input[@placeholder='Select Manufacturer']").click();
		// Actions act=new Actions(driver);
		// act.moveToElement(driver.findElement(By.xpath("//li[@data-manufacture-en='Hyundai']"))).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@data-manufacture-en='Hyundai']")));
		Thread.sleep(3000);
		driver.findElementById("sort").click();
		Select Match = new Select(driver.findElementById("sort"));
		Match.selectByVisibleText("KM: Low to High");

		// To check the displayed KM are sorted
		List<WebElement> kms = driver.findElementsByXPath("//span[@class='slkms vehicle-data__item']");
		ArrayList<String> km = new ArrayList<>();
		for (WebElement kilo : kms) {
			km.add(kilo.getText());
		}
		System.out.println("km:" + km);
		ArrayList<String> sortted = new ArrayList<>();
		for (String s : km) {
			sortted.add(s);
		}
		System.out.println("sortted:" + sortted);
		Collections.sort(sortted);
		boolean same = km.equals(sortted) && sortted.equals(km);
		System.out.println(same);
		if ((km == sortted)) {
			System.out.println("sorted");
		} else {
			System.out.println("Not sorted");
		}
		driver.findElementByLinkText("Don't show anymore tips").click();
		for (int i = 1; i <= 4; i++) {
			if (i > 2) {
				Actions act = new Actions(driver);
	act.moveToElement(driver.findElementByXPath("(//span[@class='image-container__gallery-icon slideShow']/following-sibling::span)[" + i+ "]")).perform();
	js.executeScript("arguments[0].click();",driver.findElementByXPath("(//span[@class='image-container__gallery-icon slideShow']/following-sibling::span)["+ i + "]"));

			} else {

	driver.findElementByXPath("(//span[@class='image-container__gallery-icon slideShow']/following-sibling::span)[" + i + "]").click();
			}
		}

		driver.findElementByXPath("//li[@class='action-box shortlistBtn']").click();

		// car price
		String cost = null;

		List<WebElement> carprice = driver.findElementsByXPath("//div[@class='shortlistCardetails']//p[2]");
		System.out.println(carprice.size());
		List<Double> price = new ArrayList<Double>();
		for (int j = 1; j <= carprice.size(); j++) {
			Thread.sleep(3000);
			cost = (driver.findElementByXPath("//ul[@id='sortSlCar']/li[" + j + "]/div[2]/p[2]").getText());
			price.add(Double.parseDouble(cost.replaceAll("[^0-9+.]", "")));
		}
		System.out.println("Before Sorting:" + price);
			price.stream();
		for (int k = 1; k < price.size(); k++) {
			for (int i = 1; i <price.size(); i++) {
			  Double elementone=price.get(k-1);
			 System.out.println(elementone);
				Double elementtwo=price.get(i);
				System.out.println(elementtwo);
	if(elementone>elementtwo) {
			i++;
	}
	if(elementone<elementtwo) {
		WebElement one = driver.findElementByXPath("//p[contains(text(),"+elementone+")]");
		WebElement two = driver.findElementByXPath("//p[contains(text(),"+elementtwo+")]");
		System.out.println("first:"+one.getText());
		System.out.println("two:"+two.getText());
		Actions builder=new Actions(driver);
       builder.dragAndDrop(two, one).build().perform();
      Thread.sleep(1000);
      }  }
			}
		 Thread.sleep(4000);
		driver.close();
			}}
		
	


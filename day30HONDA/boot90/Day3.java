package boot90;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.postman.com/");
		driver.findElementByLinkText("Sign In").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.sendKeys("DhivyaTestleaf");
		driver.findElementById("password").sendKeys("India@123");
		driver.findElementById("sign-in-btn").click();
		WebElement newwin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'btn btn-primary')]")));
		newwin.click();
		WebElement collection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='create-new-modal__intro__card create-new-modal__intro__card--collection']")));
		collection.click();

		WebElement name = driver.findElementByXPath("//input[@class='input input-box collection-modal-name-input']");
		name.sendKeys("newtest");
		WebElement description = driver.findElementByXPath(
				"//span[text()='Make things easier for your teammates with a complete collection description.']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.contextClick(description).sendKeys("Test description").sendKeys(Keys.ENTER).build().perform();
		driver.findElementByXPath("//div[@class='btn btn-primary']").click();
		WebElement dropdown = driver.findElementByXPath("//div[@class='dropdown collection-browser-actions-dropdown']//div");
		dropdown.click();
        driver.findElementByXPath("(//div[text()='Add Request'])").click();
        //new request
        driver.findElementByXPath("//input[@class='input input-box addrequest__request-name']").sendKeys("newRequest");
        WebElement des = driver.findElementByXPath("(//div[@class='view-lines'])[2]");
        Actions act1 = new Actions(driver);
		act1.sendKeys(des, "training").perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Save ']").click();
        act.sendKeys(Keys.ENTER);
        boolean text = driver.findElementByXPath("//div[text()='request']").isDisplayed();
        String text2 = driver.findElementByXPath("//div[text()='request']").getText();
        System.out.println(text2);
		if(text==true) {
			System.out.println("Request added");
		}
		else {
			System.out.println("Not added");}
		}
	}


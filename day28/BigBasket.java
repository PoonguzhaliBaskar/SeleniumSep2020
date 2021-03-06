package day28;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement category = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]"));
	     WebElement menu = driver.findElement(By.xpath("(//a[@href='/cl/foodgrains-oil-masala/?nc=nb'])[2]"));
        WebElement firstmenu = driver.findElement(By.xpath("(//a[@href='/cl/fruits-vegetables/?nc=nb'])[2]"));
	     JavascriptExecutor js = (JavascriptExecutor)driver;		
     js.executeScript("arguments[0].click();", category);
        act.moveToElement(firstmenu).perform();
        Thread.sleep(3000);
        act.moveToElement(menu).build().perform();
        Thread.sleep(4000);
        WebElement rice = driver.findElement(By.xpath("(//a[@ng-href='/pc/foodgrains-oil-masala/rice-rice-products/?nc=nb'])[2]"));
       // WebDriverWait wait = new WebDriverWait(driver,30);
        		//wait.until(ExpectedConditions.visibilityOf(rice));
        js.executeScript("arguments[0].click();", rice);
        driver.findElement(By.xpath("//span[text()='Boiled & Steam Rice']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//i[contains(@class,'cr-icon fa')])[3]")).click ();
		  Thread.sleep(3000);
		  WebElement ponnirice =driver.findElement(By.xpath("//img[@ng-src='https://www.bigbasket.com/media/uploads/p/mm/40075894_6-bb-royal-ponni-boiled-rice-super-premium.jpg']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ponnirice);
		 		  Thread.sleep(3000);
		  WebElement dropdown = driver.findElement(By.xpath("(//i[@class='fa fa-caret-down'])[6]"));
	        js.executeScript("arguments[0].click();", dropdown);
	        Thread.sleep(2000);

		  WebElement opt = driver.findElement(By.xpath("//span[text()='345.00']"));
	        js.executeScript("arguments[0].click();", opt);
		  String price = driver.findElement(By.xpath("//span[text()='345']")).getText();
		  System.out.println("Rice bag price:"+price);
		  driver.findElement(By.xpath("(//button[@qa='add'])[7]")).click();
		  Thread.sleep(2000);
		  //String text = driver.findElement(By.xpath("//div[text()='Successfully added Idli Rice 2 kg to the basket']")).getText(); System.out.println(text);
		 
	WebElement search = driver.findElement(By.id("input"));
	search.sendKeys("dal");
	search.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[@type='submit']//i[1]")).click();
	Thread.sleep(4000);
	WebElement dal = driver.findElement(By.xpath("//img[@ng-src='https://www.bigbasket.com/media/uploads/p/s/10000412_16-bb-popular-toorarhar-dal.jpg']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dal);
	Thread.sleep(2000); 
	driver.findElement(By.xpath("(//i[@class='fa fa-caret-down'])[8]")).click();
	driver.findElement(By.xpath("//span[text()='243.00']")).click();
	//act.moveToElement(selection).click(selection).build().perform();
	driver.findElement(By.xpath("(//input[@ng-model='vm.startQuantity'])[8]")).clear();
	driver.findElement(By.xpath("(//input[@ng-model='vm.startQuantity'])[8]")).sendKeys("2");
	String text2 = driver.findElement(By.xpath("//span[text()='243']")).getText();
	System.out.println("dal price:"+text2);
	driver.findElement(By.xpath("(//button[@qa='add'])[8]")).click();
	Thread.sleep(4000);
	WebElement basket = driver.findElement(By.xpath("//i[contains(@class,'icon svg-basket')]"));
	act.moveToElement(basket).click(basket).build().perform();
	Thread.sleep(3000);
	String subtotal = driver.findElement(By.xpath("//span[@ng-bind='vm.cart.cart_total']")).getText();
	System.out.println("Total:"+subtotal);
	driver.findElement(By.xpath("(//button[text()='−'])[2]")).click();
	Thread.sleep(3000);
	String subtotal1 = driver.findElement(By.xpath("//span[@ng-bind='vm.cart.cart_total']")).getText();
System.out.println("Final total:"+subtotal1);
	}}

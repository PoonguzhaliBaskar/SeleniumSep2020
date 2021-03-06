package day12.Testcase;

import org.testng.annotations.Test;

import day12.PagesZomato.Base;
import day12.PagesZomato.HomePage;


public class Testcase extends Base{
@Test()

public void Testcase() throws InterruptedException {
	new HomePage(driver)
	.select()
	.order()
	.photos();
	
	
	
}

}

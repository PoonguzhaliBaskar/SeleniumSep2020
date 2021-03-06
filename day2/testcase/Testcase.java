package day2.testcase;

import org.testng.annotations.Test;

import day2.Pages.Base;
import day2.Pages.HomePage;

public class Testcase extends Base {
@Test()
	
	public void testcases() throws InterruptedException {
		new HomePage(driver)
		.menulink()
		
		.mousehover()
		.shoes()
		.Womenshoeclk()
		.titlePrice();
}
}
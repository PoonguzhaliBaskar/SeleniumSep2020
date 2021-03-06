package day8.Testcase;

import org.testng.annotations.Test;

import day8.Pages.Base;
import day8.Pages.HomePage;

public class Testcase extends Base {
	
	@Test
	public void testcase() throws InterruptedException {
		new HomePage(driver)
		.search()
		.noOfItems()
		.sort();
		
		
		
	}
}

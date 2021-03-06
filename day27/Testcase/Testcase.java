package day27.Testcase;

import org.testng.annotations.Test;

import day27.Pages.Base;
import day27.Pages.HomePage;

public class Testcase extends Base{
	@Test
	public void testcase() throws InterruptedException {
		
		new HomePage(driver)
		.usedCars();
		
	}

	
}

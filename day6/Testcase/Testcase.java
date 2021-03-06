package day6.Testcase;

import org.testng.annotations.Test;

import day6.Pages.Base;
import day6.Pages.HomePage;


	public class Testcase extends Base {
		
		@Test
		public void testcase() throws InterruptedException {
			new HomePage(driver)
			.clkcategory()
			.setValues()
			.emi()
			.banksemiData();
			
			
		}
	}

	


	
	
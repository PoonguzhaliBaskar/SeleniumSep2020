package day7.Testcase;

import org.testng.annotations.Test;

import day7.Pages.Base;
import day7.Pages.HomePages;

public class Testcase extends Base {
	
	@Test
	public void testcase() throws InterruptedException {
		new HomePages(driver)
		.search()
		.custrating()
		.hightolow()
		.checkforsort()
		.compare()
		.pagedisplay();
		
		
	}
}

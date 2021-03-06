package day13.Testcase;

import org.testng.annotations.Test;

import day13.Pages.Base;
import day13.Pages.loginPage;

public class Testcase extends Base {
	@Test()

	public void Testcase() throws InterruptedException {
		new loginPage(driver)
		.credentials();
		
		
		
	}
	}

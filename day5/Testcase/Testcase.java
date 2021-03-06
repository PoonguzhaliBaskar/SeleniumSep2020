package day5.Testcase;

import org.testng.annotations.Test;

import day5.Pages.Base;
import day5.Pages.Login;

public class Testcase extends Base {
	
	@Test
	public void testcase() throws InterruptedException {
		new Login(driver)
		.Login()
		.clkmenu()
		.clkviewall()
		.clkserviceconsole()
		.clkproductarrow()
		
		.clknew()
		.newprodinfo()
		.proddisplaymsg()
		.clknewcontact()
		.createnewcontact()
		.clksave();
	}
}

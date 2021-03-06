package day4.Testcase;

import org.testng.annotations.Test;

import day4.Pages.Base;
import day4.Pages.Journeystart;

public class testcase extends Base  {

	/*
	 * @BeforeTest public void setdetails() { testAuthor="Poo";
	 * testCategory="Smoke";
	 */

	
	@Test()
	
	public void testcases() throws InterruptedException {
		new Journeystart(driver)
		.clicklink()
		.popular()
		.next()
		.date()
		.next()
		.confirmdate()
		.done()
		.srchresult();
		
		
	}}

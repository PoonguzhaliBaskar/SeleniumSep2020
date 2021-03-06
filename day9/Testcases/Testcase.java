package day9.Testcases;

import org.testng.annotations.Test;


import day9.Pages.Base;
import day9.Pages.HomePage;

public class Testcase extends Base {
	@Test
	public void testcase() throws InterruptedException {
		new HomePage(driver)
		.search()
		.similarItems();
		
}}

package day10.Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import day10.Pages.Base;
import day10.Pages.HomePage;

public class Testcase extends Base {
@Test()
	
	public void testcases() throws InterruptedException, IOException {
		new HomePage(driver)
		.fromTo()
		.buslist()
		.busimage();
		
		
	}}



package com.test.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Safari {
	
	@Test
	public static void Stest() throws InterruptedException {
		// Driver download page:
		// https://github.com/SeleniumHQ/selenium/wiki/SafariDriver
		// Just install the extension (Version 2.48)
		// In Dev. tab "allow remote automation", no need to set property

		WebDriver wd;
		wd = new SafariDriver();
		String baseURL = "http://www.google.com";

		wd.get(baseURL);
		Thread.sleep(2000);

		 wd.quit();
	}
}

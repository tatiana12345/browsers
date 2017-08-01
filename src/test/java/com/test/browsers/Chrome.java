package com.test.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome{

	@Test
	public static void ChromeTest() throws InterruptedException {
		// Chrome
		String baseURL = "http://www.google.com";
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "/Users/tatianakesler/Desktop/Selenium/installation/chromedriver");
		wd = new ChromeDriver();
		wd.get(baseURL);
		
		Thread.sleep(2000);

		wd.quit();
	}
}

package com.test.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {

	@Test
	public static void FirefoxTest() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/tatianakesler/Desktop/Selenium/installation/geckodriver");
		
		WebDriver wd = new FirefoxDriver();
		String baseURL = "https://www.google.com";
		
		wd.get(baseURL);
		
		Thread.sleep(2000);
		wd.quit();
	}

}

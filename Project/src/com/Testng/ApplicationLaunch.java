package com.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplicationLaunch {

	@Test
	public void application() {
		
		
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		
	}
}

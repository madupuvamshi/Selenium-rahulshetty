package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

public class AppUtil {
public static Properties conpro;
public static WebDriver driver;

@BeforeTest
public static void setUp() throws Throwable
{
	conpro=new Properties();
	conpro.load(new FileInputStream("./PropertyFiles/Environment.Properties"));
	if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	
	}
	else if(conpro.getProperty("Browser").equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("Browser is not matching");
	}
}
	
@AfterTest
public void tearDown()
{
	driver.quit();
}
}



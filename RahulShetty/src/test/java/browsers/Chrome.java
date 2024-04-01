package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//WebDriver driver;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("madupuvamshi95@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("");
	driver.findElement(By.name("login")).click();
	
	
	
	
	}
}

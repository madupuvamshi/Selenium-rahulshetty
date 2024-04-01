package browsers;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.cssSelector(".l3tlg0-0.ggoliT")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("‪C:\\Users\\kittu\\OneDrive\\Desktop\\abhiauto.exe");
	}

}

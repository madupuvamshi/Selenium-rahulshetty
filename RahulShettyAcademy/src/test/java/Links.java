import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//*[@id='gf-BIG']//td[1]/ul"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		for(int i=0; i<footer.findElements(By.tagName("a")).size(); i++) 
		{
			String tab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(tab);
		}
		driver.quit();
	}

}

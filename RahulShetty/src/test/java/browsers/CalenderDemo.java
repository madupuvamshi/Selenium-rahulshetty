package browsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/section/div/div/div/div[2]/div/form/div/div[3]/input")).click();
		//driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day "));
		int count=driver.findElements(By.className("flatpickr-day ")).size();
		for (int i=0; i<count; i++)
		{
			String text=driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("30"))
			{
				driver.findElements(By.className("flatpickr-day ")).get(i).click();
				break;
			}
		}
	}

}

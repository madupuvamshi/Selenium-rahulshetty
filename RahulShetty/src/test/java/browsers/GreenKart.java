package browsers;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size(); i++)
		{
			String name=products.get(i).getText();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(name))
			{
				// click on add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
			}
		}
	}

}

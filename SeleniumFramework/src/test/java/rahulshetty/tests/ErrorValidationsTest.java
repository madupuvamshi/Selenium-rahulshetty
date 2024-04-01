package rahulshetty.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshetty.TestComponents.BaseTest;
import rahulshetty.TestComponents.Retry;
import rahulshetty.pageobjects.CartPage;
import rahulshetty.pageobjects.CheckOutPage;
import rahulshetty.pageobjects.ConfirmationPage;
import rahulshetty.pageobjects.LandingPage;
import rahulshetty.pageobjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups= {"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void LoginErrorValidation() throws InterruptedException, IOException
	{
		String productName ="IPHONE 13 PRO";
		landingpage.loginApplication("vamshi@12gmail.com", "Qwerrty@12");
		Assert.assertEquals("Incorrect email or password.", landingpage.getErrorMessage());
		//Assert.assertEquals("Incorrect email  password.", landingpage.getErrorMessage()); // its failed test case
	}
	
	@Test
	public void ProductErrorValidation() throws InterruptedException, IOException
	{
		String productName ="IPHONE 13 PRO";
		ProductCatalogue productCatalogue = landingpage.loginApplication("vamshi@12gmail.com", "Qwerty@12");
		
		// ProductCatalogue productCatalogue=new ProductCatalogue(driver);
		 
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartpage=productCatalogue.goToCartPage();
		Boolean match = cartpage.VerifyProductDisplay("IPHONE 14 PRO");
		Assert.assertFalse(match);
		
	}
}

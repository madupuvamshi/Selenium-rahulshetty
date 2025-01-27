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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshetty.TestComponents.BaseTest;
import rahulshetty.pageobjects.CartPage;
import rahulshetty.pageobjects.CheckOutPage;
import rahulshetty.pageobjects.ConfirmationPage;
import rahulshetty.pageobjects.LandingPage;
import rahulshetty.pageobjects.OrderPage;
import rahulshetty.pageobjects.ProductCatalogue;


public class SubmitOrderTest extends BaseTest {

	String productName ="IPHONE 13 PRO";
	
	@Test(dataProvider="getData",groups= {"Purchase"})
	public void submitOrder(String email , String password , String productName) throws InterruptedException, IOException
	{
		//String productName ="IPHONE 13 PRO";
		ProductCatalogue productCatalogue = landingpage.loginApplication(email, password);
		
		// ProductCatalogue productCatalogue=new ProductCatalogue(driver);
		 
		 List<WebElement> products = productCatalogue.getProductList();
		
		productCatalogue.addProductToCart(productName);
		CartPage cartpage=productCatalogue.goToCartPage();
		Boolean match = cartpage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckOutPage checkoutpage = cartpage.goToCheckout();
		checkoutpage.selectCountry("India");
		ConfirmationPage confirmationpage= checkoutpage.submitOrder();
		String confirmMessage = confirmationpage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
	}
		
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest()
	{
		ProductCatalogue productCatalogue = landingpage.loginApplication("vamshi@12gmail.com", "Qwerty@12");
		OrderPage orderPage = productCatalogue.goToCartOrdersPage();
		Assert.assertTrue(orderPage.VerifyOrderDisplay(productName));
	}
	
		//data provider in testng - help to drive the data and pass multiple datasets	
		
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] { {"vamshi@12gmail.com", "Qwerty@12","IPHONE 13 PRO"},{"vamshi12@gmail.com","Asdf@123","ADIDAS ORIGINAL"} };
	}
		
}

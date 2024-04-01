package rahulshetty.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshetty.pageobjects.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingpage;

	public WebDriver initializeDriver() throws IOException
	{

		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\rahulshetty\\resouces\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			//write firefox code
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			//edge code

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	public String getScreenshot(String testCaseName , WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.setProperty("user.dir", "//reports//"+testCaseName+".png"));
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") +"//reports//"+testCaseName+".png";
	}

	@BeforeMethod(alwaysRun=true)
	public LandingPage launchApplication() throws IOException
	{
		driver = initializeDriver();
		landingpage = new LandingPage (driver);
		landingpage.goTo();
		return landingpage;
	}
	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.close();
	}
}

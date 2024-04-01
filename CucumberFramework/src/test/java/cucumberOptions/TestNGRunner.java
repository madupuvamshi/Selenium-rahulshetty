package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 			// "not @smoketest "means it will not pick
	glue="stepDefinitions", monochrome=true,tags=" @SmokeTest or @RegressionTest " ,
	plugin = {"pretty" , "html:target/cucumber.html" ,"json:target/cucumber.json" }) 

public class TestNGRunner extends AbstractTestNGCucumberTests{

	
}

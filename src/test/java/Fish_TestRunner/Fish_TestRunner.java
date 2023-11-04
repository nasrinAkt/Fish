package Fish_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Fish_Utility.Fish_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = {"src/test/resources/Fish_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Fish_StepDefinition")//tags = {""})
public class Fish_TestRunner extends AbstractTestNGCucumberTests {

	
	@BeforeTest
	public void fiStartURL() {
	Fish_Base fis = new Fish_Base();	
		fis.FiBrowser();
		
	}
	@AfterTest
	public void fiCloseURL() {
	Fish_Base fis = new Fish_Base();	
	fis.driver.quit();	
		
	}
	
	
}

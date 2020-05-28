package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/featureFiles",
		glue= {"stepDefinition"},
		format= {"pretty","html:test-output", "json:json-output/cucumberJson.json","junit:junit-output/cucumber.xml"},
		monochrome = true,
		dryRun = false,
		strict = true
		)

public class Runner 
{
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception 
	{    	
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")    
	public void feature(/*PickleEventWrapper eventwrapper,*/CucumberFeatureWrapper cucumberFeature) throws Throwable 
	{
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		//testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	}

	@DataProvider//(parallel=true)
	public Object[][] features() 
	{
		return testNGCucumberRunner.provideFeatures();    	
		//return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception 
	{    	
		testNGCucumberRunner.finish();        
	}
}

package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature"}
		,glue={"stepDefinition"}
		//,tags = "@Login and @LogOut"
		//,plugin = { "pretty"}
		//,plugin = {"usage"}
		,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true,dryRun=false
		)

public class TestRunner {
	
}
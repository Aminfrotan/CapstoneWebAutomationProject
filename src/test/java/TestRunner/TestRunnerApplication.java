package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFile"},
glue = {"StepDefinitions","CapstoneWebAutomationProject"},
//dryRun = false,
//monochrome = true,
plugin = { "pretty",
		"html:target/cucumber-reports/html", "html:target/cucumber-reports/json/report.json",
		"junit:target/cucumber-reports/junit/report.xml" }
)





public class TestRunnerApplication {
	

}

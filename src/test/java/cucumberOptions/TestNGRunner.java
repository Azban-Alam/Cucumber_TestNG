package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", // Path to the feature files
		glue = "stepDefinitions", // Path to step definition package
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports/Cucumber.json" }, monochrome = true, // Readable console output
		tags = "@SearchPage", // You can run tests with specific tags
		dryRun = false)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "src/test/resources/features",
	glue = "stepDefinitions",
	tags = "@all",
	dryRun = false,
	strict = true,
	monochrome = true,
	plugin = {
			"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"
	},
	publish = true
	)
	
public class Runner {
		
		@AfterClass
		public static void generateReport() {
			CucumberReportingConfig.reportConfig();
		}
}

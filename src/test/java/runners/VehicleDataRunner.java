package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
	//dryRun = true,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = ("src/test/resources/features/vehicle/VehicleData.feature")
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/vehicle/VehicleData", "json:target/cucumber-reports/vehicle/VehicleData/VehicleData.json"}
		,snippets = SnippetType.CAMELCASE
)

public class VehicleDataRunner {

}

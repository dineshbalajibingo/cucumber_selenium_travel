package unitedtest.unitedautomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features={"src/test/java/features/"},
			glue = {"stepDefinition"},
			plugin = {"html:target/myreport"}
		)
public class TestRunner {
	

}

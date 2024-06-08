package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/SmokeTest.feature",
        glue = "samplepackage",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
        //,tags = "@tag1"
)
public class SmokeRunnerTest {
}

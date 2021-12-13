package RenastechBDDTesting.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/RegressionSuit.feature",
        glue = "RenastechBDDTesting.Step_Definitions",
        tags = "@Regression",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumberDemosite.html",
                "json:target/cucumberDemo.json",
                "rerun:target/rerun.txt"},
        publish = false


)
public class Failed_Runner {
}

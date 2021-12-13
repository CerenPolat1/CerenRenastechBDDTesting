package RenastechBDDTesting.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = "RenastechBDDTesting.Steps_Definitions",
        tags = "@Regression",
        dryRun=false

)

public class Test_Runner {

}


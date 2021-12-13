package RenastechBDDTesting.Steps_Definitions;

import RenastechBDDTesting.Utils.ConfigurationReaders;
import RenastechBDDTesting.Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup(Scenario scenario) {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReaders.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


    @After
    public void tearDown(Scenario scenario){



        if(scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }


      Driver.closeDriver();

    }
}

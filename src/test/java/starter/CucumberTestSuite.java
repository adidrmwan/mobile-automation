package starter;

import cucumber.annotation.After;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import test.automation.driver.DriverPool;

import java.util.Optional;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        stepNotifications = true,
        plugin = "pretty"
)
public class CucumberTestSuite {
}

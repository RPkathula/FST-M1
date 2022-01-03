package cucumberTest.ActivitiesRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity2_5"
)

public class ActivitiesRunner {
    //empty
}
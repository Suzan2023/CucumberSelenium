package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features\\ScenarioOutline.feature"},
        glue = {"stepdefinitions", "hooks"}
)
public class HookRunner {
}

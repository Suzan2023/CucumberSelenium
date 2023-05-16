package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/firstFeature.feature"},
        glue = {"stepdefinitions"},
        tags = "@login" //@login yerine @smoke veya @regression veya hangi scenario istenirse o yazilir
)
public class TagRunner {

    // Tag expressions

    // "@tag1" -> tag1 e sahip feature veya senaryolari calistir

    // "@tag1 and @tag2" -> tag1 VE tag2 taglerine sahip feature veya senaryolari calistir

    // "@tag1 and not @tag2" -> tag1 e sahip VE tag2 ye sahip OLMAYAN  sahip feature veya senaryolari calistir

    // "@tag1 or @tag2" -> tag1 VEYA tag2 taglerine sahip feature veya senaryolari calistir
}

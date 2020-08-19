package seasonchecker;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/seasonchecker"}
)
public class TestRunner {
}

//Scenario: Winter isn't Summer
// Given today is last day of December
// When I ask whether it's Summer
// Then I should be told "Nope"

//Scenario: Summer is Summer
// Given today is first day of August
// When I ask whether it's Summer
// Then I should be told "Yes! Summer!"
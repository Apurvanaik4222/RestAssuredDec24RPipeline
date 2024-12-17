package cucumber.Options;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\91762\\IdeaProjects\\RestAPICucumberDec24R\\src\\test\\java\\features\\Places.feature",
        glue="steps",
        dryRun = false,
        tags ="@AddPlace or @DeletePlace",
        plugin ="json:target/cucumber.json"
)
public class TestRunner {


}

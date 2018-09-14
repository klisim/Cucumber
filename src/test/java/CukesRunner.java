import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"/home/marcin/IdeaProjects/Cucumber/src/test/resources/Example.feature"}
)
public class CukesRunner {}



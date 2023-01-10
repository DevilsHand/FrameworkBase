package test.pepino.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
        features = "src/test/resources",
        glue = {"test.pepino.steps", "test.pepino.hooks"},
        tags = "@Login",
        monochrome = true, publish = false,
        snippets = SnippetType.CAMELCASE,
        stepNotifications = true)

public class Runner {

}

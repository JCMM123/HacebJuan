package runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/homeHaceb.feature",
        tags = "@addProduct",
        glue = "stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class HomeHaceb {
}

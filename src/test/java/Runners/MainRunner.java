package Runners;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        monochrome = true,
        publish = true,
        features = "src/test/resources/features/",
        glue = "Definitions",
        tags = "@Login",
        plugin = { "pretty" ,
               // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class MainRunner {

}

package co.com.demoblaze.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/sign_up.feature",
        tags="@Register",
        glue = "co.com.demoblaze",
        snippets = SnippetType.CAMELCASE)
public class RunnerRegister {
}

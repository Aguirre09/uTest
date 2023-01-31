package co.com.demoblaze.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RegisterStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Alejandro");
    }
    private EnvironmentVariables environmentVariables;
    Properties config = new Properties();
    @Managed
    private WebDriver driver;
    @Given("User without credentials")
    public void userWithoutCredentials() {
        String urlWeb = environmentVariables.getProperty("environments.dev.dev.url");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url(urlWeb)
        );



        getDriver().manage().window().maximize();
    }

    @When("User got information for to make a new credentials")
    public void userGotInformationForToMakeANewCredentials() {
        System.out.println("When");

    }

    @Then("System show that register was successful")
    public void systemShowThatRegisterWasSuccessful() {
        System.out.println("Then");

    }
}

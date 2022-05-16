package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("android user on landing screen")
    public void onLandingScreen() {
        Assert.assertTrue(loginPage.isOnPage());
    }

    @When("android user input unregistered email")
    public void userInputUnregisteredEmail(){
        loginPage.inputEmail("awan12@gamil.com");
    }

    @And("android user input password")
    public void userInputPassword() {
        loginPage.inputPassword("password!2");
    }
    @And("android user tap login button")
    public void userTapLoginButton(){
        loginPage.tapLoginButton();
    }
    @Then("android user see error message is displayed")
    public void userSeeErrorMessage(){
        Assert.assertTrue(loginPage.errorMessageIsdisplayed());
    }
}

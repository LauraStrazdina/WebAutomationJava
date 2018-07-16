package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        selectMyAccountMenu();
    }

    @And("^I select Login from my account menu$")
    public void iSelectLoginFromMyAccountMenu() throws Throwable {
        selectLogInButtonMyAccountMenu();
    }

    @And("^I enter Email in login form $")
    public void iEnterEmailAddressInLoginForm() throws Throwable {
        enterEmailAddressLoginForm();
    }

    @And("^I enter PasswordInLoginForm$")
    public void iEnterPasswordLoginForm() throws Throwable {
        enterPassword();
    }

    @And("^I select login from login form$")
    public void iConfirmPassword() throws Throwable {
        selectLogInButtonLoginForm();
    }

    @Then("^I  have logged in$")
    public void iHaveLoggedIn() throws Throwable {
        System.out.println("YOU HAVE LOGGED IN!");
    }
}


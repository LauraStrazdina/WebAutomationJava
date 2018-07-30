package stepdefinitions;

import cucumber.api.java.en.Then;

public class AccountSteps {

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }


    @Then("^I have logged in$")
    public void iHaveLoggedIn() throws Throwable {
        System.out.println("YOU HAVE LOGGED IN!");
    }
}

package stepdefinitions;

import cucumber.api.java.en.And;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.*;

public class SignupSteps {

    private SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signup.enterFirstName(generateRandomString());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signup.enterLastName(generateRandomString());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signup.enterMobileNumber(generateRandomPhoneNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signup.enterEmail(generateRandomEmail());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signup.enterPassword(generateRandomString());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signup.enterConfirmationPassword(generateRandomString());
    }

    /*@And("^I select Sign up button from sign up form$")
    public void iSelectSignUpButtonFromSignUpForm() throws Throwable {
        selectSignUpButtonSignUpForm();
    }*/
}



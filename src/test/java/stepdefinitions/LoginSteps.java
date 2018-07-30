package stepdefinitions;

import cucumber.api.java.en.And;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject login = new LoginPageObject();
    private User user = new User();

    @And("^I enter Email in login form $")
    public void iEnterEmailAddressInLoginForm() throws Throwable {
        login.enterEmail(user.getEmailAddress());
    }

    @And("^I enter PasswordInLoginForm$")
    public void iEnterPasswordLoginForm() throws Throwable {
        login.enterPassword(user.getPassword());
    }

    @And("^I select login from login form$")
    public void iConfirmPassword() throws Throwable {
        login.selectLoginButton();
    }

}


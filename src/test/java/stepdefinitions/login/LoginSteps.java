package stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.login.LoginPage;
import utils.Constants;

import java.util.List;
import java.util.Map;

import static factory.DriverFactory.getDriver;

public class LoginSteps {

    public LoginPage loginPage = new LoginPage(getDriver());

    @Given("YS User open the Login Page")
    public void ysUserOpenTheLoginPage() {
        getDriver().get(Constants.YSWEBURL);
    }

    @And("YS User try to login")
    public void ysUserTryToLogin(List<Map<String, String>> elementsList) {
        Map<String, String> parameter = elementsList.get(0);
        loginPage.fillSellerLoginForm(parameter.get("username"), parameter.get("password"))
                .clickSignInButton();

    }

    @Then("YS User should logged-in")
    public void ysUserShouldLoggedIn() {
       loginPage.loginChecked();
    }

    @Then("YS User have fail message {string} at Login Page")
    public void ysUserHaveFailMessageAtLoginPage(String failMessage) {
        loginPage.checkFailMessageAs(failMessage);
    }
}

package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.LoginPage;
import io.loop.utiilities.BrowserUtils;
import io.loop.utiilities.ConfigurationReader;
import io.loop.utiilities.DocuportConstants;
import io.loop.utiilities.Driver;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("env"));
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
        assertTrue(3==4);
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user clicks login button")
    public void user_click_login_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {
        // Write code here that turns the phrase above into concrete actions

    }

}

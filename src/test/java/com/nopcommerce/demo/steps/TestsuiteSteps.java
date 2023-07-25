package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TestsuiteSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I Click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I verify  message display that {string}")
    public void iVerifyMessageDisplayThat(String welcomeMessage) {
        Assert.assertEquals(new LoginPage().getTextFromWelcomeText(),welcomeMessage);
    }

    @And("I  Enter EmailId")
    public void iEnterEmailId() {
    new LoginPage().enterEmail();
    }

    @And("I  Enter Password")
    public void iEnterPassword() {
        new LoginPage().enterPassword();
    }

    @And("I Click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I Verify that the Error message")
    public void iVerifyThatTheErrorMessage() {
        Assert.assertEquals(new LoginPage().getTextFromErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }

    @And("I  Enter validEmailId")
    public void iEnterValidEmailId() {
        new LoginPage().entervalidEmail();
    }

    @And("I  Enter validPassword")
    public void iEnterValidPassword() {
        new LoginPage().enterValidPassword();
    }


    @Then("I Verify that link is display {string}")
    public void iVerifyThatLinkIsDisplayLogOut(String logout) {
        Assert.assertEquals(new LoginPage().verifyLogOutLinkDisplay(),logout);
    }
}

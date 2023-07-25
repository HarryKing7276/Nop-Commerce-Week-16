package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterSteps {
    @And("I Click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I Verify text {string}")
    public void iVerifyText(String register) {
        Assert.assertEquals(new RegisterPage().getMessageRegisterText(),register);
    }
    @And("I Click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }



    @And("I Verify the error messageFirstName {string}")
    public void iVerifyTheErrorMessageFirstName(String firstName) {
        Assert.assertEquals(new RegisterPage().getMessageFirsNameError(),firstName);
    }

    @And("I Verify the error messageLastName {string}")
    public void iVerifyTheErrorMessageLastName(String lastName) {
        Assert.assertEquals(new RegisterPage().getMessageLastNameError(),lastName);
    }

    @And("I Verify the error messageEmail {string}")
    public void iVerifyTheErrorMessageEmail(String email) {
        Assert.assertEquals(new RegisterPage().getMessageFromEmailError(),email);
    }

    @And("I Verify the error messagePassword {string}")
    public void iVerifyTheErrorMessagePassword(String password) {
        Assert.assertEquals(new RegisterPage().getMessageFromPasswordError(),password);
    }

    @And("I Verify the error messageConfirmPassword {string}")
    public void iVerifyTheErrorMessageConfirmPassword(String confirmPassword) {
        Assert.assertEquals(new RegisterPage().getMessageFromConfirmPasswordError(),confirmPassword);
    }


    @And("I Select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGenderFemale();
    }

    @And("I Enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName();
    }

    @And("I Enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName();
    }

    @And("I Select day")
    public void iSelectDay() {
        new RegisterPage().selectBirthDay();
    }

    @And("I Select month")
    public void iSelectMonth() {
        new RegisterPage().selectBirthMonth();
    }

    @And("I Select year")
    public void iSelectYear() {
        new RegisterPage().selectBirthYear();
    }

    @And("I Enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail();
    }

    @And("I Enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword();
    }

    @And("I Enter Confirm Password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword();
    }

    @Then("I Verify message {string}")
    public void iVerifyMessage(String registration) {
        Assert.assertEquals(new RegisterPage().getMessageAfterRegister(),registration);






    }
}

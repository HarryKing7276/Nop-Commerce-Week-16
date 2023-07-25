package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;

    public String getTextFromWelcomeText(){
       log.info("getTextFromWelcomeText");
        return getTextFromElement(welcomeText);
    }

    public void verifyWelcomeText(){
        log.info("verifyWelcomeText");
        String expectedWelcomeText = "Welcome, Please Sign In!";
       // Assert.assertTrue(expectedWelcomeText.equals(getTextFromWelcomeText()));
    }
    public void enterEmail() {
        log.info("enterEmail");
        clickOnElement(email);
        sendTextToElement(email, "prime@gmail.com");
    }
        public void enterPassword(){
        log.info("enterPassword");
            clickOnElement(password);
            sendTextToElement(password,"prime123");
    }
    public void clickOnLoginButton(){
        log.info("clickOnLoginButton");
        clickOnElement(loginButton);
    }
    public String getTextFromErrorMessage(){
        log.info("getTextFromErrorMessage");
        return getTextFromElement(errorMessage);
    }
    public void entervalidEmail() {
        log.info("enterEmail");
        clickOnElement(email);
        sendTextToElement(email, "doracosta@gmail.com");
    }
    public void enterValidPassword(){
        log.info("enterPassword");
        clickOnElement(password);
        sendTextToElement(password,"dora@11");
    }


    public void verifyLogOutMessage(){
        log.info("verifyErrorMessage");
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
       // Assert.assertTrue(expectedErrorMessage.equals(getTextFromErrorMessage()));

    }
    public String  verifyLogOutLinkDisplay(){
        return getTextFromElement(logOutLink);
    }
}

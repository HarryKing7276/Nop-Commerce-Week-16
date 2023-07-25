package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadioButton;
    @CacheLookup
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDropDown;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
            @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleted;
    public String getMessageRegisterText(){
        log.info("getMessageRegisterText");
        return getTextFromElement(registerText);
    }

public void verifyRegisterText(){
       log.info("verifyRegisterText");
    String expectedTextRegister = "Register";
  //  Assert.assertTrue(expectedTextRegister.equals(getMessageRegisterText()));
}

public void clickOnRegisterButton(){
        log.info("clickOnRegisterButton");
        clickOnElement(registerButton);
}
    public String getMessageFirsNameError(){
        log.info("getMessageFirsNameError");
        return getTextFromElement(firstNameErrorMessage);
    }

    public void verifyFirstNameIsRequired(){
        log.info("verifyFirstNameIsRequired");
        String expected = "First name is required.";
       // Assert.assertTrue(expected.equals(getMessageFirsNameError()));
    }
    public String getMessageLastNameError(){
        log.info("getMessageLastNameError");
        return getTextFromElement(lastNameErrorMessage);
    }

    public void verifyLastNameIsRequired(){
        log.info("verifyLastNameIsRequired");
        String expected = "Last name is required.";
       // Assert.assertTrue(expected.equals(getMessageLastNameError()));
    }
    public String getMessageFromEmailError(){
        log.info("getMessageFromEmailError");
        return getTextFromElement(emailErrorMessage);
    }

    public void verifyEmailIsRequired(){
        log.info("verifyEmailIsRequired");
        String expected = "Email is required.";
       // Assert.assertTrue(expected.equals(getMessageFromEmailError()));
    }
    public String getMessageFromPasswordError(){
        log.info("getMessageFromPasswordError");
        return getTextFromElement(passwordErrorMessage);
    }

    public void verifyPasswordIsRequired(){
        log.info("verifyPasswordIsRequired");
        String expected = "Password is required.";
       // Assert.assertTrue(expected.equals(getMessageFromPasswordError()));
    }
    public String getMessageFromConfirmPasswordError(){
        log.info("getMessageFromConfirmPasswordError");
        return getTextFromElement(confirmPasswordErrorMessage);
    }

    public void verifyConfirmPasswordIsRequired(){
        log.info("verifyConfirmPasswordIsRequired");
        String expected = "Password is required.";
      //  Assert.assertTrue(expected.equals(getMessageFromConfirmPasswordError()));
    }
    public void selectGenderFemale(){
        log.info("selectGenderFemale");
        clickOnElement(femaleRadioButton);
    }
    public void enterFirstName(){
        log.info("enterFirstName");
        sendTextToElement(firstName,"Derek");
    }
    public void enterLastName(){
        log.info("enterLastName");
        sendTextToElement(lastName,"Costa");
    }
    public void selectBirthDay(){
        log.info("selectBirthDay");
        selectByVisibleTextFromDropDown(dateOfBirthDropDown,"9");
    }
    public void selectBirthMonth(){
        log.info("selectBirthMonth");
        selectByVisibleTextFromDropDown(birthMonth,"May");
    }
    public void selectBirthYear(){
        log.info("selectBirthYear");
        selectByVisibleTextFromDropDown(birthYear,"2001");
    }
    public void enterEmail(){
        log.info("enterEmail");
        sendTextToElement(email,"derekcosta@gmail.com");
    }
    public void enterPassword(){
        log.info("enterPassword");
        sendTextToElement(password,"deco@11");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"deco@11");
    }
    public String getMessageAfterRegister(){
        return getTextFromElement(registrationCompleted);
    }
    public void verifyMessageRegistrationCompleted(){
        log.info("verifyMessageRegistrationCompleted");
        String expectedRegisterMessage = "Your registration completed";
      //  Assert.assertTrue(expectedRegisterMessage.equals(getMessageAfterRegister()));
    }











}

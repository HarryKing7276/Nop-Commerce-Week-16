package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);


    @CacheLookup
    @FindBy()
    WebElement allMenu;
    @CacheLookup
    @FindBy(partialLinkText = "Compute")
    WebElement computer;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy()
    WebElement nopCommerceLogo;
    @CacheLookup
    @FindBy()
    WebElement myAccountLink;
    @CacheLookup
    @FindBy()
    WebElement logoutLink;

    public void clickOnLoginLink(){
        log.info("clickOnLoginLink");
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        log.info("clickOnRegisterLink");
        mouseHoverToElement(registerLink);
        clickOnElement(registerLink);
    }
    public void clickOnComputer(){
        log.info("clickOnComputer");
        clickOnElement(computer);
    }

}

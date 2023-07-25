package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy()
    WebElement sortBy;
    @CacheLookup
    @FindBy()
    WebElement display;
    @CacheLookup
    @FindBy()
    WebElement selectProductList;

    public String getTextFromDesktop() {
        log.info("getTextFromDesktop");
        return getTextFromElement(desktopsText);
    }

    public void verifyTextDesktop(){
        log.info("verifyTextDesktop");
        String expectedDesktopText = "Desktops";
       // Assert.assertTrue(expectedDesktopText.equals(getTextFromDesktop()));
    }
}

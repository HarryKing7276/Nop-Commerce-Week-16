package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ComputerTestSteps {
    @Then("I Click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @And("I Verify computerText {string}")
    public void iVerifyComputerText(String computerText) {
        Assert.assertEquals(new ComputerPage().getTextFromComputer(),computerText);
    }

    @And("I Click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @And("I Verify deskTopsText {string}")
    public void iVerifyDeskTopsText(String textDeskTop) {
        Assert.assertEquals(new DesktopsPage().getTextFromDesktop(),textDeskTop);
    }


    @And("I Click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new ComputerPage().clickOnBuildYourOwnComputer();

    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectprocessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHdd(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }
    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }


    @Then("I Verify shoppingMessage {string}")
    public void iVerifyShoppingMessage(String shoppingCartMessage) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getTextProductAdded(),shoppingCartMessage);

    }


}

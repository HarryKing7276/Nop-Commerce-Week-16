package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
     private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class);
    @CacheLookup
    @FindBy()
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hddRadios1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddRadios2;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[6]/dl[1]/dd[4]/ul[1]")
    WebElement osRadios;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osRadios1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadios2;


    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareCheckBox1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareCheckBox2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareCheckBox3;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedMessage;
    public void selectprocessor(String processor){
        log.info("selectprocessor");
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRam(String ram){
       log.info("selectRam");
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }
    public void selectHdd(String hdd){
        log.info("selectHdd");
        if (hdd == "320 GB"){
            clickOnElement(hddRadios1);
        }else {
            clickOnElement(hddRadios2);
        }
    }
    public void selectOs(String os){
        log.info("selectOs");
        if (os == "Vista Home [+$50.00]"){
            clickOnElement(osRadios1);
        }else {
            clickOnElement(osRadios2);
        }
        //selectByVisibleTextFromDropDown(osRadios, os);
    }
    public void selectSoftware(String software){
        log.info("selectSoftware");
        if (software == "Microsoft Office [+$50.00]"){
            clickOnElement(softwareCheckBox1);
        }else if(software=="Acrobat Reader [+$10.00]"){
            clickOnElement(softwareCheckBox2);
        }else {
            clickOnElement(softwareCheckBox3);
        }
       // selectByVisibleTextFromDropDown(softwareCheckBoxes, software);
    }

public void buildYourOwnComputer(String processor, String ram, String hdd, String os, String software)
    {
     log.info("buildYourOwnComputer");
        selectprocessor(processor);
        selectRam(ram);
        selectHdd(hdd);
        selectOs(os);
        selectSoftware(software);
}
public void clickOnAddToCartButton(){
        log.info("clickOnAddToCartButton");
        clickOnElement(addToCartButton);
}
public String  getTextProductAdded(){
        return getTextFromElement(productAddedMessage);
}

}

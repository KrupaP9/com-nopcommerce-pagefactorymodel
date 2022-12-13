package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1" )
    WebElement cellPhonesText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='viewmode-icon list']" )
    WebElement listTab;
    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020" )
    WebElement productNokiaLumiaLink;

    public String getCellPhonesText() {
        Reporter.log("Getting cell phones text " + cellPhonesText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Cell Phones");
        return getTextFromElement(cellPhonesText);
    }
    public void clickListTab(){
        Reporter.log("Clicking on list tab " + listTab.toString());
        clickOnElement(listTab);
        CustomListeners.test.log(Status.PASS,"Click on list tab");
    }
    public void clickOnNokiaLumia(){
        Reporter.log("Clicking on Nokia Lumia " + productNokiaLumiaLink.toString());
        clickOnElement(productNokiaLumiaLink);
        CustomListeners.test.log(Status.PASS,"Click on nokia lumia");
    }

}

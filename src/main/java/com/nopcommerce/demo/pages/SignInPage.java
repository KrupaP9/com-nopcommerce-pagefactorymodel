package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1" )
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']" )
    WebElement checkoutAsGuest;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]" )
    WebElement registerButton;

    public String getWelcomeText() {
        Reporter.log("Getting welcome text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Welcome");
        return getTextFromElement(welcomeText);
    }

    public void clickCheckoutAsGuest() throws InterruptedException{
        Reporter.log("Clicking on checkout as guest " + checkoutAsGuest.toString());
        Thread.sleep(1000);
        clickOnElement(checkoutAsGuest);
        CustomListeners.test.log(Status.PASS,"Click on checkout as guest");
    }
    public void clickOnRegister(){
        Reporter.log("Clicking on register " + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click on register");
    }



}

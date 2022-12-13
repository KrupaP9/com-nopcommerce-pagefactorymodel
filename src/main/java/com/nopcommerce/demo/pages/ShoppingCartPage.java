package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-2 update-cart-button']")
    WebElement updateButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@name='termsofservice']")
    WebElement termsOfService;
    @CacheLookup
    @FindBy(xpath = "//input[@name='termsofservice']")
    WebElement termsOfServiceRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@name='checkout']")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//button[@name='checkout']")
    WebElement checkoutButton;


    public String getShoppingCartMessage() {
        Reporter.log("Getting shopping cart text " + shoppingCartMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Shopping Cart");
        return getTextFromElement(shoppingCartMessage);
    }
    public String verifyShoppingCartMessage() {
        Reporter.log("Getting shopping cart text " + shoppingCartMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Shopping Cart");
        return getTextFromElement(shoppingCartText);
    }

    public void clearQuantity() {
        Reporter.log("Clearing quantity");
        quantity.clear();
        CustomListeners.test.log(Status.PASS,"Click on clear quantity");
    }

    public void sendQuantity(String quantityNum) {
        Reporter.log("Enter quantity "+quantityNum+ "to email field "+quantity.toString());
        sendTextToElement(quantity, quantityNum);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + quantityNum);
    }

    public void clickOnUpdateShoppingCart() {
        Reporter.log("Clicking on update shopping cart Button " + updateButton.toString());
        clickOnElement(updateButton);
        CustomListeners.test.log(Status.PASS,"Click on update shopping cart button");
    }

    public String getTotalPriceShoppingCart() {
        Reporter.log("Getting total price " + totalPrice.toString());
        CustomListeners.test.log(Status.PASS,"Get total price");
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService() {
        Reporter.log("Clicking on terms of service " + termsOfService.toString());
        clickOnElement(termsOfService);
        CustomListeners.test.log(Status.PASS,"Click on terms of service");
    }
    public void selectTermsOfService() {
        Reporter.log("Clicking on terms of service " + termsOfService.toString());
        clickOnElement(termsOfServiceRadioButton);
        CustomListeners.test.log(Status.PASS,"Click on terms of service");
    }

    public void clickOnCheckout() {
        Reporter.log("Clicking on checkout Button " + checkout.toString());
        clickOnElement(checkout);
        CustomListeners.test.log(Status.PASS,"Click on checkout");
    }
    public void clickOnCheckoutButton() {
        Reporter.log("Clicking on checkout Button " + checkout.toString());
        clickOnElement(checkoutButton);
        CustomListeners.test.log(Status.PASS,"Click on checkout");
    }

    public String getQuantity() {
        Reporter.log("Getting quantity " + quantity.getAttribute("value"));
        CustomListeners.test.log(Status.PASS,"Get quantity");
        return quantity.getAttribute("value");
    }
}

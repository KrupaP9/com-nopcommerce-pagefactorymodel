package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]" )
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']" )
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']" )
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']" )
    WebElement radioHDD400GB;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']" )
    WebElement radioOSVistaPremium;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']" )
    WebElement totalCommanderRadio;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']/span" )
    WebElement actualPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']" )
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/p" )
    WebElement actualProductAddedToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/span" )
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]" )
    WebElement shoppingCartHover;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]" )
    WebElement goToCartButton;
    //******************************************************************
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]" )
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(id = "price-value-20" )
    WebElement nokiaLumiaPrice;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20" )
    WebElement quantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20" )
    WebElement addToCartButtonNokia;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]" )
    WebElement successfullyAddedMessage;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]" )
    WebElement successCloseButton;


    public String getBuildYourOwnComputerText() {
        Reporter.log("Getting build your own computer text " + buildYourOwnComputerText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Build your own computer");
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String inputProcessor) throws InterruptedException {
        Reporter.log("selecting processor " + inputProcessor.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(processorDropDown, inputProcessor);
        CustomListeners.test.log(Status.PASS,"Select processor "+ inputProcessor.toString());

    }

    public void selectRAM(String inputRAM) throws InterruptedException {
        Reporter.log("selecting RAM " + inputRAM.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(ramDropDown, inputRAM);
        CustomListeners.test.log(Status.PASS,"Select processor "+ inputRAM.toString());
    }

    public void clickHDD() throws InterruptedException {
        Reporter.log("Clicking on HDD 400GB " + radioHDD400GB.toString());
        Thread.sleep(1000);
        clickOnElement(radioHDD400GB);
        CustomListeners.test.log(Status.PASS,"Click on HDD 400GB");
    }

    public void clickOS() throws InterruptedException {
        Reporter.log("Clicking on OS Vista Premium " + radioOSVistaPremium.toString());
        Thread.sleep(1000);
        clickOnElement(radioOSVistaPremium);
        CustomListeners.test.log(Status.PASS,"Click on OS Vista Premium");
    }

    public void clickTotalCommander() throws InterruptedException {
        Reporter.log("Clicking on total commander Button " + totalCommanderRadio.toString());
        Thread.sleep(1000);
        clickOnElement(totalCommanderRadio);
        CustomListeners.test.log(Status.PASS,"Click on total commander");
    }

    public String getTextActualPrice() throws InterruptedException {
        Reporter.log("Getting actual price text " + actualPrice.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Welcome Back");
        Thread.sleep(1000);
        return getTextFromElement(actualPrice);
    }

    public void clickAddToCartButton() throws InterruptedException {
        Reporter.log("Clicking on add to cart Button " + addToCartButton.toString());
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Click on add to cart");
    }

    public String getProductAddedToCartMessage() {
        Reporter.log("Getting added to cart message " + actualProductAddedToShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From add to cart");
        return getTextFromElement(actualProductAddedToShoppingCart);
    }

    public void clickCloseButton() {
        Reporter.log("Clicking on close button " + closeButton.toString());
        clickOnElement(closeButton);
        CustomListeners.test.log(Status.PASS,"Click on close button");
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("hovering on shopping cart " + shoppingCartHover.toString());
        mouseHoverToElement(shoppingCartHover);
        CustomListeners.test.log(Status.PASS,"Hover on Shopping Cart");
    }

    public void clickOnGoToCart() {
        Reporter.log("Clicking on go to cart Button " + goToCartButton.toString());
        clickOnElement(goToCartButton);
        CustomListeners.test.log(Status.PASS,"Click on go to cart");
    }

    public String getNokiaLumiaText() {
        Reporter.log("Getting Nokia Lumia text " + nokiaLumiaText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Nokia Lumia");
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaLumiaPrice() {
        Reporter.log("Getting nokia lumia text " + nokiaLumiaPrice.toString());
        CustomListeners.test.log(Status.PASS,"Get Text from nokia lumia description");
        return getTextFromElement(nokiaLumiaPrice);
    }

    public void clearQuantity() {
        Reporter.log("Clearing quantity");
        quantity.clear();
        CustomListeners.test.log(Status.PASS,"Click on clear quantity");
    }

    public void sendQuantity(String inputQuantity) {
        Reporter.log("Enter quantity"+inputQuantity+ "to field "+quantity.toString());
        sendTextToElement(quantity, inputQuantity);
        CustomListeners.test.log(Status.PASS,"Enter quantity " + inputQuantity);
    }

    public void clickaddToCartNokia() throws InterruptedException{
        Reporter.log("Clicking on add to cart" + addToCartButtonNokia.toString());
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButtonNokia);
        CustomListeners.test.log(Status.PASS,"Click on add to cart");
    }
    public String getSuccessfullyAddedMessage() {
        Reporter.log("Getting successfully added text " + successfullyAddedMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Successfully added message");
        return getTextFromElement(successfullyAddedMessage);
    }
    public void closeSuccessMessage(){
        Reporter.log("Clicking close on success message " + successCloseButton.toString());
        clickOnElement(successCloseButton);
        CustomListeners.test.log(Status.PASS,"Click close on success message");
    }




}

package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName" )
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName" )
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId" )
    WebElement countrySelect;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId" )
    WebElement stateSelect;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email" )
    WebElement email;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City" )
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1" )
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode" )
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber" )
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']" )
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']" )
    WebElement nextDayRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']" )
    WebElement continueFromShipping;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']" )
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(id = "CreditCardType" )
    WebElement paymentMethodDropDown;
    @CacheLookup
    @FindBy(id = "CardholderName" )
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber" )
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']" )
    WebElement expiryMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']" )
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']" )
    WebElement cVV;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']" )
    WebElement continueAfterBilling;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[@class='value']" )
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[@class='value']" )
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']" )
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]" )
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='section order-completed']/div[@class='title']/strong" )
    WebElement orderSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']" )
    WebElement confirmMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[4]" )
    WebElement continueAfterRegistrationBilling;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']" )
    WebElement continueAfterOrderPlaced;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']" )
    WebElement continueAfterPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']" )
    WebElement radioSecondDayAir;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]" )
    WebElement logoutLink;
    public void sendFirstName(String inputFirstName) {
        Reporter.log("Enter first name"+inputFirstName+ "to field "+firstName.toString());
        sendTextToElement(firstName, inputFirstName);
        CustomListeners.test.log(Status.PASS,"Enter first name " + inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        Reporter.log("Enter last name"+inputLastName+ "to field "+lastName.toString());
        sendTextToElement(lastName, inputLastName);
        CustomListeners.test.log(Status.PASS,"Enter last name " + inputLastName);
    }

    public void sendEmail(String inputEmail) {
        Reporter.log("Enter email"+inputEmail+ "to email field "+email.toString());
        sendTextToElement(email, inputEmail+getRandomAlphaNumericString(3)+"@gmail.com");
        CustomListeners.test.log(Status.PASS,"Enter email " + inputEmail);
    }

    public void selectCountryName(String inputCountry) {
        Reporter.log("selecting " + inputCountry.toString());
        selectByVisibleTextFromDropDown(countrySelect, inputCountry);
        CustomListeners.test.log(Status.PASS,"Select Country Name");
    }

    public void selectStateName(String inputstateName) {
        Reporter.log("selecting " + inputstateName.toString());
        selectByVisibleTextFromDropDown(stateSelect, inputstateName);
        CustomListeners.test.log(Status.PASS,"Select State Name");
    }

    public void sendCityName(String inputCityName) {
        Reporter.log("Enter city "+inputCityName+ "to field "+city.toString());
        sendTextToElement(city, inputCityName);
        CustomListeners.test.log(Status.PASS,"Enter city " + inputCityName);
    }

    public void sendAddressName(String inputAddressName) {
        Reporter.log("Enter address"+inputAddressName+ "to address field "+address.toString());
        sendTextToElement(address, inputAddressName);
        CustomListeners.test.log(Status.PASS,"Enter address " + inputAddressName);
    }

    public void sendPostCode(String inputPostCode) {
        Reporter.log("Enter postcode"+inputPostCode+ "to field "+postCode.toString());
        sendTextToElement(postCode, inputPostCode);
        CustomListeners.test.log(Status.PASS,"Enter postcode " + inputPostCode);
    }

    public void sendPhoneNumber(String inputPhoneNumber) {
        Reporter.log("Enter phone number"+inputPhoneNumber+ "to field "+phoneNumber.toString());
        sendTextToElement(phoneNumber, inputPhoneNumber);
        CustomListeners.test.log(Status.PASS,"Enter phone number " + inputPhoneNumber);
    }

    public void clickContinue() {
        Reporter.log("Clicking on continue Button " + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }

    public void chooseShipping() {
        Reporter.log("Clicking on shipping Button " + nextDayRadioButton.toString());
        clickOnElement(nextDayRadioButton);
        CustomListeners.test.log(Status.PASS,"Click on shipping");
    }

    public void clickContinueFromShipping() {
        Reporter.log("Clicking on continue Button " + continueFromShipping.toString());
        clickOnElement(continueFromShipping);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }

    public void selectPaymentTypeRadioButton() {
        Reporter.log("Clicking on credit card payment type radio button " + creditCardPaymentMethod.toString());
        clickOnElement(creditCardPaymentMethod);
        CustomListeners.test.log(Status.PASS,"Click on button credit card payment type radio");

    }

    public void selectCardType(String paymentMethodOption) {
        Reporter.log("selecting " + paymentMethodOption.toString());
        selectByVisibleTextFromDropDown(paymentMethodDropDown, paymentMethodOption);
        CustomListeners.test.log(Status.PASS,"select"+paymentMethodOption);
    }

    public void sendCardholderName(String inputcardHolderName) {
        Reporter.log("Enter card holder name"+inputcardHolderName+ "to field "+cardHolderName.toString());
        sendTextToElement(cardHolderName, inputcardHolderName);
        CustomListeners.test.log(Status.PASS,"Enter cardholder name " + inputcardHolderName);
    }

    public void sendCardNumber(String inputcardNumber) {
        Reporter.log("Enter card number"+inputcardNumber+ "to card number field "+cardNumber.toString());
        sendTextToElement(cardNumber, inputcardNumber);
        CustomListeners.test.log(Status.PASS,"Enter card number " + inputcardNumber);
    }

    public void selectExpiryMonth(String inputExpiryMonth) {
        Reporter.log("selecting " + inputExpiryMonth.toString());
        selectByVisibleTextFromDropDown(expiryMonth, inputExpiryMonth);
        CustomListeners.test.log(Status.PASS,"select"+inputExpiryMonth);
    }

    public void selectExpiryYear(String inputExpiryYear) {
        Reporter.log("selecting " + inputExpiryYear.toString());
        selectByVisibleTextFromDropDown(expiryYear, inputExpiryYear);
        CustomListeners.test.log(Status.PASS,"select"+inputExpiryYear);
    }

    public void sendCVVCode(String inputCVV) {
        Reporter.log("Enter CVV code"+inputCVV+ "to field "+cVV.toString());
        sendTextToElement(cVV, inputCVV);
        CustomListeners.test.log(Status.PASS,"Enter CVV code " + inputCVV);
    }

    public void clickContinueAfterBilling() {
        Reporter.log("Clicking on continue Button " + continueAfterBilling.toString());
        clickOnElement(continueAfterBilling);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }
    public void clickContinueAfterPaymentMethod() {
        Reporter.log("Clicking on continue Button " + continueAfterPaymentMethod.toString());
        clickOnElement(continueAfterPaymentMethod);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }

    public String getTextPaymentMethod() {
        Reporter.log("Getting payment method text " + paymentMethod.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From payment method");
        return getTextFromElement(paymentMethod);
    }

    public String getTextShippingMethod() {
        Reporter.log("Getting shipping text " + shippingMethod.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From shipping");
        return getTextFromElement(shippingMethod);
    }

    public String getTextExpectedTotalAmount() {
        Reporter.log("Getting expected total amount text " + totalAmount.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From total amount");
        return getTextFromElement(totalAmount);
    }

    public void clickConfirm() {
        Reporter.log("Clicking on confirm " + confirmMessage.toString());
        clickOnElement(confirmMessage);
        CustomListeners.test.log(Status.PASS,"Click on confirm");
    }

    public String getTextThankYou() throws InterruptedException{
        Reporter.log("Getting thank you text " + thankYouText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Thank you");
        Thread.sleep(1000);
        return getTextFromElement(thankYouText);
    }

    public String getTextOrderSuccessfullyPlaced() {
        Reporter.log("Getting order successfully placed message " + orderSuccessMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From order placed");
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickContinueAfterOrderPlaced(){
        Reporter.log("Clicking on continue Button " + continueAfterOrderPlaced.toString());
        clickOnElement(continueAfterOrderPlaced);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }

    public void clickContinueAfterRegistrationBilling(){
        Reporter.log("Clicking on continue Button " + continueAfterRegistrationBilling.toString());
        clickOnElement(continueAfterRegistrationBilling);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }
    public void clickRadioShipping(){
        Reporter.log("Clicking on shipping radio Button " + radioSecondDayAir.toString());
        clickOnElement(radioSecondDayAir);
        CustomListeners.test.log(Status.PASS,"Click on second day air radio button");
    }
    public void clickLogoutLink(){
        Reporter.log("Clicking on logout Button " + logoutLink.toString());
        clickOnElement(logoutLink);
        CustomListeners.test.log(Status.PASS,"Click on logout");
    }
    public String getCurrentURL(){
        Reporter.log("Getting current URL " );
        CustomListeners.test.log(Status.PASS,"Get current URL");
        return driver.getCurrentUrl();
    }

}

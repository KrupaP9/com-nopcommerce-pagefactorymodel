package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]" )
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "FirstName" )
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName" )
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "DateOfBirthDay" )
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth" )
    WebElement monthOfBirth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear" )
    WebElement yearOfBirth;
    @CacheLookup
    @FindBy(id = "Email" )
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password" )
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword" )
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button" )
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]" )
    WebElement registrationSuccess;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]" )
    WebElement continueButton;

    public String getRegisterText() {
        Reporter.log("Getting Register text " + registerText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Register Message");
        return getTextFromElement(registerText);
    }
    public void enterFirstName(String inputFirstName) {
        Reporter.log("Enter first name"+inputFirstName+ "to field "+firstName.toString());
        sendTextToElement(firstName, inputFirstName);
        CustomListeners.test.log(Status.PASS,"Enter first name " + inputFirstName);
    }

    public void enterLastName(String inputLastName) {
        Reporter.log("Enter last name"+inputLastName+ "to field "+lastName.toString());
        sendTextToElement(lastName, inputLastName);
        CustomListeners.test.log(Status.PASS,"Enter last name " + inputLastName);
    }

    public void enterDateOfBirthDay(String inputDay) {
        Reporter.log("Select Day from Date Of Birth " + inputDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, inputDay);
        CustomListeners.test.log(Status.PASS,"Select Day "+ inputDay.toString());
    }

    public void enterMonthOfBirth(String inputMonth) {
        Reporter.log("Select Month from Date Of Birth " + inputMonth.toString());
        selectByVisibleTextFromDropDown(monthOfBirth, inputMonth);
        CustomListeners.test.log(Status.PASS,"Select Month "+ inputMonth.toString());
    }

    public void enterYearofBirth(String inputYear) {
        Reporter.log("Select Year from Date Of Birth " + inputYear.toString());
        selectByVisibleTextFromDropDown(yearOfBirth, inputYear);
        CustomListeners.test.log(Status.PASS,"Select Year "+ inputYear.toString());
    }

    public void enterEmail(String inputEmail) {
        Reporter.log("Enter email"+inputEmail+ "to field "+email.toString());
        sendTextToElement(email, inputEmail+getRandomAlphaNumericString(3)+"@gmail.com");
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + inputEmail);
    }

    public void enterPassword(String inputPassword) {
        Reporter.log("Enter password"+inputPassword+ "to field "+password.toString());
        sendTextToElement(password, inputPassword);
        CustomListeners.test.log(Status.PASS,"Enter password " + inputPassword);
    }

    public void enterConfirmPassword(String inputConfirmPassword) {
        Reporter.log("Enter password"+inputConfirmPassword+ "to confirm password field "+confirmPassword.toString());
        sendTextToElement(confirmPassword, inputConfirmPassword);
        CustomListeners.test.log(Status.PASS,"Enter confirm password " + inputConfirmPassword);
    }

    public void clickRegisterButton() {
        Reporter.log("Clicking on register Button " + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click on register button");
    }

    public String registrationCompleteMessage() {
        Reporter.log("Getting registration complete text " + registrationSuccess.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Registration Complete");
        return getTextFromElement(registrationSuccess);
    }
    public void clickContinueButton(){
        Reporter.log("Clicking on continue Button " + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on continue button");
    }

}

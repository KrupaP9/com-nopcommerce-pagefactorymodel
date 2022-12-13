package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BooksPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]" )
    WebElement books;

    public String getBooksText() {
        Reporter.log("Getting books text " + books.toString());
        CustomListeners.test.log(Status.PASS,"Get books test");
        return getTextFromElement(books);
    }
}

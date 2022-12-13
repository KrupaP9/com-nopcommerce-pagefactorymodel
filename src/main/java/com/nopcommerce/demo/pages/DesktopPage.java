package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']" )
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//div[@data-productid='1']//button[text()='Add to cart']" )
    WebElement addToCartButton;

    public void sortByZtoA(String sortByZToA){
        Reporter.log("Clicking on sort by Z to A " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,sortByZToA);
        CustomListeners.test.log(Status.PASS,"Click on sort by Z to A");
    }
    public void sortByAtoZ(String sortByAToZ){
        Reporter.log("Clicking on credit card payment type radio button " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,sortByAToZ);
        CustomListeners.test.log(Status.PASS,"Click on button credit card payment type radio");
    }
    public void selectSortByAtoZ(String sortByAToZ){
        Reporter.log("Clicking on credit card payment type radio button " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,sortByAToZ);
        CustomListeners.test.log(Status.PASS,"Click on button credit card payment type radio");
    }
    public void addToCart() throws InterruptedException{
        Reporter.log("Clicking on add to cart button " + addToCartButton.toString());
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Click on add to cart button");
    }

}

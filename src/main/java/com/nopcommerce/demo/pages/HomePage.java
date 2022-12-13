package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'header-menu']/ul/li" )
    List<WebElement> headerMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Computers ']" )
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Computers ']" )
    WebElement computer;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Desktops ']" )
    WebElement desktopOption;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Desktops ']" )
    WebElement desktopOptionTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='topic-block-title']/h2" )
    WebElement welcomeToOurStoreText;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']" )
    WebElement electronicsTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul[@class='sublist first-level']/li/a[text()='Cell phones ']" )
    WebElement cellPhonesTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']" )
    WebElement pageTitle;
    public String getTitleOfPage(){
        return getTextFromElement(pageTitle);
    }
    public void selectMenu(String menu) {
        List<WebElement> menuList = headerMenu;
        try {
            //loop through list with for loop
            for (WebElement menuOption : menuList) {
                System.out.println(menuOption.getText());
                //if option matches with the parameter then click
                if (menuOption.getText().equals(menu)) {
                    menuOption.click();
                }
            }
            //catch exceptions
        } catch (StaleElementReferenceException e) {
            menuList = headerMenu;
        }
    }

    public void hoverOnComputer() {
        Reporter.log("Hovering over Computer " + computerTab.toString());
        mouseHoverToElement(computer);
        CustomListeners.test.log(Status.PASS,"Hover on computer");
    }
    public void hoverOnComputerTab() {
        Reporter.log("Hovering over Computer " + computerTab.toString());
        mouseHoverToElement(computerTab);
        CustomListeners.test.log(Status.PASS,"Hover on computer");
    }

    public void hoverOnElectronics() {
        Reporter.log("Hovering over Electronics " + electronicsTab.toString());
        mouseHoverToElement(electronicsTab);
        CustomListeners.test.log(Status.PASS,"Hover on electronics");
    }
    public void clickOnCellPhones() {
        Reporter.log("Hovering on Cell Phones " + cellPhonesTab.toString());
        clickOnElement(cellPhonesTab);
        CustomListeners.test.log(Status.PASS,"Hover on Cell Phones");
    }

    public void clickOnDesktop() {
        Reporter.log("Clicking on desktop " + desktopOption.toString());
        mouseHoverToElementAndClick(desktopOption);
        CustomListeners.test.log(Status.PASS,"Click on desktop");
    }
    public void clickOnDesktopTab() {
        Reporter.log("Clicking on desktop " + desktopOption.toString());
        mouseHoverToElementAndClick(desktopOptionTab);
        CustomListeners.test.log(Status.PASS,"Click on desktop");
    }

    public String getWelcomeToOurStoreText() {
        Reporter.log("Getting welcome text " + welcomeToOurStoreText.toString());
        CustomListeners.test.log(Status.PASS,"Get Text From Welcome");
        return getTextFromElement(welcomeToOurStoreText);
    }

}

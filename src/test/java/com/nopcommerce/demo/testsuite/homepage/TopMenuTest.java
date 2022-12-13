package com.nopcommerce.demo.testsuite.homepage;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    HomePage homePage;
    BooksPage booksPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        booksPage = new BooksPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyPageNavigation(){
        homePage.selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(),"Books","Page Navigated Successfully");
    }

}

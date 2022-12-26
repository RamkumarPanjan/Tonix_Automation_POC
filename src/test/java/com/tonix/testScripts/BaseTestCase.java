package com.tonix.testScripts;

import com.utility.Utilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
    protected com.business.tonixPages.WelcomePage welcomePage;
    protected com.business.tonixPages.LoginPage loginPage;
    protected com.business.tonixPages.BasePage basePage;
    protected com.business.tonixPages.MainPage mainPage;
    @BeforeTest
    public void Before() throws InterruptedException {
        Utilities.relaunch = false;
        basePage = new com.business.tonixPages.BasePage("tonix");
        welcomePage = new com.business.tonixPages.WelcomePage();
        loginPage = new com.business.tonixPages.LoginPage();
        mainPage = new com.business.tonixPages.MainPage();
    }

    @AfterTest
    public void tonixAppQuit() throws Exception{
        basePage.TearDown();
    }

}

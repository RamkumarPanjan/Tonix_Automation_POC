package com.tonix.testScripts;

import com.business.tonixPages.StashClosePage;
import com.utility.Utilities;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
    protected com.business.tonixPages.WelcomePage welcomePage;
    protected com.business.tonixPages.LoginPage loginPage;
    protected com.business.tonixPages.BasePage basePage;
    protected com.business.tonixPages.MainPage mainPage;
    protected com.business.tonixPages.Stash_StashHomePage stashHomePage;
    protected com.business.tonixPages.Stash_SetupYourStashPage stashSetupPage;
    protected com.business.tonixPages.Stash_StashClosePage stashClosePage;
    protected com.business.tonixPages.Stash_StartNewStashPage startNewStaShPage;
    
    
    Utilities util=new Utilities();
    @BeforeTest
    public void Before() throws InterruptedException, IOException {
        Utilities.relaunch = false;
      //  util.clearBackgroundApps();
        basePage = new com.business.tonixPages.BasePage("tonix");
        welcomePage = new com.business.tonixPages.WelcomePage();
        loginPage = new com.business.tonixPages.LoginPage();
        mainPage = new com.business.tonixPages.MainPage();
        stashHomePage=new com.business.tonixPages.Stash_StashHomePage();
        stashSetupPage=new com.business.tonixPages.Stash_SetupYourStashPage();
        stashClosePage=new com.business.tonixPages.Stash_StashClosePage();
        startNewStaShPage=new com.business.tonixPages.Stash_StartNewStashPage();
    }

    @AfterTest
    public void tonixAppQuit() throws Exception{
        basePage.TearDown();
    }

}

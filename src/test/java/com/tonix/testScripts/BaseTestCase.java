package com.tonix.testScripts;


import com.propertyfilereader.PropertyFileReader;
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
    protected com.business.tonixPages.Stash_SetInitialSavingPage setInitialSavingPage;
    protected com.business.tonixPages.Stash_ReviewStashDetailsPage reviewStashDetailsPage;
    protected com.business.tonixPages.Stash_SoloStashCreatedPage  soloStashCreatedPage;
    protected com.business.tonixPages.Stash_ManageStashPage manageStashPage;
    protected com.business.tonixPages.Stash_ModifyStashPage modifyStashPage;
    protected com.business.tonixPages.Stash_UpdatedYourStashPage updatedStashPage;
    
    public static PropertyFileReader prop = new PropertyFileReader(".\\properties\\testdata.properties");
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
        setInitialSavingPage=new com.business.tonixPages.Stash_SetInitialSavingPage();
        reviewStashDetailsPage=new com.business.tonixPages.Stash_ReviewStashDetailsPage();
        soloStashCreatedPage=new com.business.tonixPages.Stash_SoloStashCreatedPage();
        manageStashPage=new com.business.tonixPages.Stash_ManageStashPage();
        modifyStashPage=new com.business.tonixPages.Stash_ModifyStashPage();
        updatedStashPage=new com.business.tonixPages.Stash_UpdatedYourStashPage();
        
    }

  /*  @AfterTest
    public void tonixAppQuit() throws Exception{
        basePage.TearDown();
    }*/

}

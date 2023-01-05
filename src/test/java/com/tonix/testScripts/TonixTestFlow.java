package com.tonix.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.extent.ExtentReporter;

public class TonixTestFlow extends BaseTestCase {

	@Test(priority = 0)
    public void createStash() throws Exception {
		//welcomePage.RingPayAppLaunch();
		loginPage.performLogin();
		mainPage.clickTotalStashBalance();
		// Harish
		stashHomePage.clickStartANewStash();
		startNewStaShPage.clickOpenANewStash();
		startNewStaShPage.selectSoloStashType();
		stashSetupPage.enterDetailsIntoSetupYourStash(prop.getproperty("educationStash"),"1000");
		setInitialSavingPage.clickOnSkipForNow();
		reviewStashDetailsPage.verifyDetailsAndCreateStash();
		soloStashCreatedPage.soloStashCreated();
		ExtentReporter.jiraID = "TON-2";
	}

	@Test(priority = 1)
	public void addToStash() throws Exception {
		// Nithya
		stashHomePage.clickAddToStash();
		stashAddToStashPage.addToStash("500");
		stashConfirmTransferToStashPage.confirmTransferToStash("500.00", prop.getproperty("mainAccount"),prop.getproperty("educationStash"),prop.getproperty("ownerStash"));
		stashMoneyStashPage.moneyStashed();
		stashHomePage.verifyStashAchieved();
		ExtentReporter.jiraID = "TON-3";
	}

	@Test(priority = 2)
	public void addToStashAgain() throws Exception {
		// Nithya
		stashHomePage.clickAddToStash();
		stashAddToStashPage.addToStash("500");
		stashConfirmTransferToStashPage.confirmTransferToStash("500.00", prop.getproperty("mainAccount"),prop.getproperty("educationStash"),prop.getproperty("ownerStash"));
		stashMoneyStashPage.moneyStashed();
		ExtentReporter.jiraID = "TON-3";
	}

	@Test(priority = 3)
	public void verifyGoalAchieved() throws Exception {
		stashHomePage.verifyGoalAchieved();
		ExtentReporter.jiraID = "TON-9";
	}

	@Test(priority = 4)
	public void withDrawStash() throws Exception {
		// Ramkumar
		stashHomePage.clickManage();
		manageStashPage.clickWithdrawToYourTonikAccount();
		withdrawFromYourStashPage.verifyPageLoaded();
		withdrawFromYourStashPage.withDrawAmount("1000");
		reviewWithdrawPage.reviewWithdrawalInfo("1,000.00", prop.getproperty("educationStash"), prop.getproperty("mainAccount"));
		withdrawConfirmationPage.verifyConfirmationMessage("₱1,000",prop.getproperty("educationStash"));
		ExtentReporter.jiraID = "TON-7";
	}

	@Test(priority = 5)
	public void closeStash() throws Exception {
		//Harish - Close the stash
		stashHomePage.clickManage();
		manageStashPage.clickClose();
		manageStashPage.handleCloseStashConfirmation();
		stashClosePage.brokeTheStash();
		ExtentReporter.jiraID = "TON-8";

	}

}

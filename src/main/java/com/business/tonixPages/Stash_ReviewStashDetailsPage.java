package com.business.tonixPages;

import com.android.selectors.Stash_ReviewStashDetailsSelectors;


public class Stash_ReviewStashDetailsPage extends BasePage{
	
	public Stash_ReviewStashDetailsPage() throws InterruptedException {
		super();	
	}
	
	public void verifyDetailsAndCreateStash() throws Exception {
		
		extent.HeaderChildNode("verify Review Stash details and Click on Create Stash");
		waitTime(2000);
		if(verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtReviewStashDetails, getText(Stash_ReviewStashDetailsSelectors.txtReviewStashDetails)))
		{
			waitTime(2000);
			Swipe("up", 1);
			
			verifyStashAccountDetails();
			explicitWaitClickable(Stash_ReviewStashDetailsSelectors.btnTickedRadioButton, 10);
			String focused_before = getAttributValue("focused",Stash_ReviewStashDetailsSelectors.btnTickedRadioButton);
			System.out.println(focused_before);
			softAssertion.assertEquals("false", focused_before);

		//	click(Stash_ReviewStashDetailsSelectors.btnTickedRadioButton,  " Radio button");
			click(Stash_ReviewStashDetailsSelectors.btnTickedRadioButton,  " Radio button");
			String focused_after = getAttributValue("focused",Stash_ReviewStashDetailsSelectors.btnTickedRadioButton);
			System.out.println(focused_after);
			softAssertion.assertEquals("false", focused_after);

			extent.extentLoggerPass("Radio Button", "Clicked on Radio Button in Review Stash Details page");
			explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.btnCreateStash, 10);
			click(Stash_ReviewStashDetailsSelectors.btnCreateStash, "create stash button");
			extent.extentLoggerPass("create stash button", "Clicked on create stash button in Review Stash Details page");
		}
		else
		{
			extent.extentLoggerFail("Radio Button", "Clicked on Radio Button in Review Stash Details page");
			extent.extentLoggerFail("create stash button", "Clicked on create stash button in Review Stash Details page");
		}
		}
	
	public  void verifyStashAccountDetails() throws Exception {
		extent.HeaderChildNode("Stash Account Review Details");
		logger.info("Review Stash Account Details");
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtReviewStashDetails, 10);
		if(verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtReviewStashDetails, "Review Stash details Text"))
		{
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtTargetAmount, 10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtTargetAmount, getText(Stash_ReviewStashDetailsSelectors.txtTargetAmount)+"-->"+(getText(Stash_ReviewStashDetailsSelectors.txtTargetAmountCurreny)));
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtInitialSaving, 10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtInitialSaving, getText(Stash_ReviewStashDetailsSelectors.txtInitialSaving)+"-->"+(getText(Stash_ReviewStashDetailsSelectors.txtInitialSavingCurreny)));

		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtTransferFrom, 10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtTransferFrom, getText(Stash_ReviewStashDetailsSelectors.txtTransferFrom)+"-->"+(getText(Stash_ReviewStashDetailsSelectors.txtTargetAmountCurreny)));

		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtInterestRate, 10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtTargetAmount, getText(Stash_ReviewStashDetailsSelectors.txtInterestRate)+"-->"+(getText(Stash_ReviewStashDetailsSelectors.txtInterestRatePercentage)));
		}
	
			
		
	}
}

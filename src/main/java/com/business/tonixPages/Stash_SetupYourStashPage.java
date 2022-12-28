package com.business.tonixPages;

import com.android.selectors.Stash_SetupYourStashSelectors;

public class Stash_SetupYourStashPage  extends BasePage {
	
	
	public Stash_SetupYourStashPage() throws InterruptedException {
		super();
	}
	
	public void enterDetailsIntoSetupYourStash() throws Exception {
		
		extent.HeaderChildNode("Enter Stash For and Target Amount");
		logger.info("Setup Your Stash Details");
		waitTime(2000);
		explicitWaitVisibility(Stash_SetupYourStashSelectors.txtSetupYourStash, 10);		
		if(verifyElementPresent(Stash_SetupYourStashSelectors.txtSetupYourStash, "Setup Your Stash text"))
		{
			verifyElementPresent(Stash_SetupYourStashSelectors.txtSetupYourStash, getText(Stash_SetupYourStashSelectors.txtSetupYourStash));
			waitTime(2000);
			
			explicitWaitVisibility(Stash_SetupYourStashSelectors.txtStashFor,10);
			verifyElementPresent(Stash_SetupYourStashSelectors.txtStashFor, "Stash For");
			Aclick(Stash_SetupYourStashSelectors.edittxtStashFor, "text field");
			type(Stash_SetupYourStashSelectors.edittxtStashFor, prop.getproperty("stashfor"), " into stash For text Field");
			logger.info("Entered the Stash For Name");
			waitTime(3000);
			hideKeyboard();
			
			explicitWaitVisibility(Stash_SetupYourStashSelectors.txtTargetamount, 10);
			verifyElementPresent(Stash_SetupYourStashSelectors.txtTargetamount, "Target Amount");
			Aclick(Stash_SetupYourStashSelectors.edittxtTargetamount, "text field");
			type(Stash_SetupYourStashSelectors.edittxtTargetamount, prop.getproperty("targetamount"), " into target amount Field");
            logger.info("Entered the Target Amount");
			explicitWaitVisibility(Stash_SetupYourStashSelectors.btnNext, 10);
			verifyElementPresentAndClick(Stash_SetupYourStashSelectors.btnNext, "Next button");

			extent.extentLoggerPass("Open a New Stash", "Clicked on Open a New Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Open a New Stash", "Clicked on Open a New Stash text in Start New stash  page");
		}

}
}
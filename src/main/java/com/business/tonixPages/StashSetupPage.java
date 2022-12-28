package com.business.tonixPages;



import com.android.selectors.Stash_ReviewStashDetailsSelectors;
import com.android.selectors.Stash_StashHomeSelectors;
import com.android.selectors.Stash_StashSetupSelectors;
import com.android.selectors.Stash_setInitialSavingselectors;

public class StashSetupPage  extends BasePage {
	
	
	public StashSetupPage() throws InterruptedException {
		super();
	}
	
	public void stashSetupPage() throws Exception {
		
		extent.HeaderChildNode("Stash setup and Stash type Flow");
		
		logger.info("creating a solo stash");
		
	//	explicitWaitVisibility(Stash_StashSetupSelectors.txtStashPageTitle, 20);
	//	verifyElementPresent(Stash_StashSetupSelectors.txtStashPageTitle, getText(Stash_StashSetupSelectors.txtStashPageTitle));
		
	    	    explicitWaitVisibility(Stash_StashHomeSelectors.txtStartNewStashBox, 10);
	    	    verifyElementPresentAndClick(Stash_StashHomeSelectors.txtStartNewStashBox, "start a new stash text");
		    	/*verifyElementPresent(Stash_StashHomeSelectors.txtStartNewStash, "start a new stash text");
		    	click(Stash_StashHomeSelectors.txtStartNewStash,"start a new stash text");
		    	click(Stash_StashHomeSelectors.txtStartNewStash,"start a new stash text");*/

		explicitWaitVisibility(Stash_StashSetupSelectors.txtOpenNewStash, 10);
		click(Stash_StashSetupSelectors.txtOpenNewStash,"open new stash text");
		
		explicitWaitVisibility(Stash_StashSetupSelectors.txtSelectstashType, 10);
		verifyElementPresent(Stash_StashSetupSelectors.txtSelectstashType, "Select stash Type");
		verifyElementPresentAndClick(Stash_StashSetupSelectors.txtSoloStash, "Solo stash Text");
		logger.info("Select stash type pop-up is displayed");
		
		explicitWaitVisibility(Stash_StashSetupSelectors.txtSetupYourStash, 10);
		verifyElementPresent(Stash_StashSetupSelectors.txtSetupYourStash, getText(Stash_StashSetupSelectors.txtSetupYourStash));
		
		waitTime(2000);
		
		explicitWaitVisibility(Stash_StashSetupSelectors.txtStashFor,10);
		verifyElementPresent(Stash_StashSetupSelectors.txtStashFor, "Stash For");
		Aclick(Stash_StashSetupSelectors.edittxtStashFor, "text field");
		type(Stash_StashSetupSelectors.edittxtStashFor, prop.getproperty("stashfor"), " into stash For text Field");
		
		waitTime(3000);
		hideKeyboard();
		
		explicitWaitVisibility(Stash_StashSetupSelectors.txtTargetamount, 10);
		verifyElementPresent(Stash_StashSetupSelectors.txtTargetamount, "Target Amount");
		Aclick(Stash_StashSetupSelectors.edittxtTargetamount, "text field");
		type(Stash_StashSetupSelectors.edittxtTargetamount, prop.getproperty("targetamount"), " into target amount Field");

		explicitWaitVisibility(Stash_StashSetupSelectors.BtnNext, 10);
		verifyElementPresentAndClick(Stash_StashSetupSelectors.BtnNext, "Next button");
		
		explicitWaitVisibility(Stash_setInitialSavingselectors.txtSkipForNow, 10);
		verifyElementPresentAndClick(Stash_setInitialSavingselectors.txtSkipForNow, "Skip for Now text");
		waitTime(3000);
		Swipe("up", 1);
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.BtnTickedRadioButton, 10);
		String focused_before = getAttributValue("focused",Stash_ReviewStashDetailsSelectors.BtnTickedRadioButton);
		System.out.println(focused_before);
		softAssertion.assertEquals("false", focused_before);

		click(Stash_ReviewStashDetailsSelectors.BtnTickedRadioButton,  " Radio button");
		click(Stash_ReviewStashDetailsSelectors.BtnTickedRadioButton,  " Radio button");
		
		//waitForElementAndClickIfPresent(ReviewStashDetailsPageSelectors.objTickRadioButton, 5, "click on Radio button");
		//String focused_before1 = getAttributValue("focused",ReviewStashDetailsPageSelectors.objCreateStashBtn);
		//System.out.println(focused_before1);
	//	softAssertion.assertEquals("false", focused_before1);

		click(Stash_ReviewStashDetailsSelectors.BtnCreateStash, "create stash button");
		click(Stash_ReviewStashDetailsSelectors.BtnCreateStash, "create stash button");
		
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtSoloStashCreated,10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtSoloStashCreated, getText(Stash_ReviewStashDetailsSelectors.txtSoloStashCreated));
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtAddManyMore, 10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtAddManyMore, getText(Stash_ReviewStashDetailsSelectors.txtAddManyMore));
		
		verifyElementPresentAndClick(Stash_ReviewStashDetailsSelectors.BtnDone, "Done button");
		waitTime(5000);
		
		logger.info("Solo stash is created successfully");
		
		
		extent.extentLogger("TBS_ST_001", "Verify if account holder can create solo stash is created");
	}

	

}

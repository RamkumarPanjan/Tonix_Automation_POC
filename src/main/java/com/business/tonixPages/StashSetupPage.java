package com.business.tonixPages;



import com.android.selectors.Stash_ReviewStashDetailsSelectors;
import com.android.selectors.Stash_StashHomeSelectors;
import com.android.selectors.Stash_SetupYourStashSelectors;
import com.android.selectors.Stash_StartNewStashSelectors;
import com.android.selectors.Stash_SetInitialSavingSelectors;

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

		explicitWaitVisibility(Stash_StartNewStashSelectors.txtOpenNewStash, 10);
		click(Stash_StartNewStashSelectors.txtOpenNewStash,"open new stash text");
		
		explicitWaitVisibility(Stash_StartNewStashSelectors.txtSelectStashType, 10);
		verifyElementPresent(Stash_StartNewStashSelectors.txtSelectStashType, "Select stash Type");
		verifyElementPresentAndClick(Stash_StartNewStashSelectors.txtSoloStash, "Solo stash Text");
		logger.info("Select stash type pop-up is displayed");
		
		explicitWaitVisibility(Stash_SetupYourStashSelectors.txtSetupYourStash, 10);
		verifyElementPresent(Stash_SetupYourStashSelectors.txtSetupYourStash, getText(Stash_SetupYourStashSelectors.txtSetupYourStash));
		
		waitTime(2000);
		
		explicitWaitVisibility(Stash_SetupYourStashSelectors.txtStashFor,10);
		verifyElementPresent(Stash_SetupYourStashSelectors.txtStashFor, "Stash For");
		Aclick(Stash_SetupYourStashSelectors.edittxtStashFor, "text field");
		type(Stash_SetupYourStashSelectors.edittxtStashFor, prop.getproperty("stashfor"), " into stash For text Field");
		
		waitTime(3000);
		hideKeyboard();
		
		explicitWaitVisibility(Stash_SetupYourStashSelectors.txtTargetamount, 10);
		verifyElementPresent(Stash_SetupYourStashSelectors.txtTargetamount, "Target Amount");
		Aclick(Stash_SetupYourStashSelectors.edittxtTargetamount, "text field");
		type(Stash_SetupYourStashSelectors.edittxtTargetamount, prop.getproperty("targetamount"), " into target amount Field");

		explicitWaitVisibility(Stash_SetupYourStashSelectors.btnNext, 10);
		verifyElementPresentAndClick(Stash_SetupYourStashSelectors.btnNext, "Next button");
		
		explicitWaitVisibility(Stash_SetInitialSavingSelectors.txtSkipForNow, 10);
		verifyElementPresentAndClick(Stash_SetInitialSavingSelectors.txtSkipForNow, "Skip for Now text");
		waitTime(3000);
		Swipe("up", 1);
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.btnTickedRadioButton, 10);
		String focused_before = getAttributValue("focused",Stash_ReviewStashDetailsSelectors.btnTickedRadioButton);
		System.out.println(focused_before);
		softAssertion.assertEquals("false", focused_before);

		click(Stash_ReviewStashDetailsSelectors.btnTickedRadioButton,  " Radio button");
		click(Stash_ReviewStashDetailsSelectors.btnTickedRadioButton,  " Radio button");
		
		//waitForElementAndClickIfPresent(ReviewStashDetailsPageSelectors.objTickRadioButton, 5, "click on Radio button");
		//String focused_before1 = getAttributValue("focused",ReviewStashDetailsPageSelectors.objCreateStashBtn);
		//System.out.println(focused_before1);
	//	softAssertion.assertEquals("false", focused_before1);

		click(Stash_ReviewStashDetailsSelectors.btnCreateStash, "create stash button");
		click(Stash_ReviewStashDetailsSelectors.btnCreateStash, "create stash button");
		
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtSoloStashCreated,10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtSoloStashCreated, getText(Stash_ReviewStashDetailsSelectors.txtSoloStashCreated));
		
		explicitWaitVisibility(Stash_ReviewStashDetailsSelectors.txtAddManyMore, 10);
		verifyElementPresent(Stash_ReviewStashDetailsSelectors.txtAddManyMore, getText(Stash_ReviewStashDetailsSelectors.txtAddManyMore));
		
		verifyElementPresentAndClick(Stash_ReviewStashDetailsSelectors.btnDone, "Done button");
		waitTime(5000);
		
		logger.info("Solo stash is created successfully");
		
		
		extent.extentLogger("TBS_ST_001", "Verify if account holder can create solo stash is created");
	}

	

}

package com.business.tonixPages;

import com.android.selectors.Stash_ModifyStashSelectors;

public class Stash_ModifyStashPage extends BasePage {
	
	public Stash_ModifyStashPage() throws InterruptedException {
		super();
	}

	
	public void modifyStashDetails() throws Exception {
		extent.HeaderChildNode("Modify Existing Stash Details");
		logger.info("Modify Stash Page is displayed");
		explicitWaitVisibility(Stash_ModifyStashSelectors.txtModifyStash, 10);
		if(verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, getText(Stash_ModifyStashSelectors.txtModifyStash)))
		{
			verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, getText(Stash_ModifyStashSelectors.txtModifyStash));
		}
			waitTime(2000);
			
			explicitWaitVisibility(Stash_ModifyStashSelectors.txtStashFor,10);
			verifyElementPresent(Stash_ModifyStashSelectors.txtStashFor, "Stash For");
			clearField(Stash_ModifyStashSelectors.edittxtStashFor, "Stash For text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtStashFor, "text field");
			type(Stash_ModifyStashSelectors.edittxtStashFor, prop.getproperty("stashfor1"), " into stash For text Field");
			logger.info("Entered the Stash For Name");
			waitTime(3000);
			hideKeyboard();
			
			explicitWaitVisibility(Stash_ModifyStashSelectors.txtTargetamount, 10);
			verifyElementPresent(Stash_ModifyStashSelectors.txtTargetamount, "Target Amount");
			clearField(Stash_ModifyStashSelectors.edittxtTargetamount, "Target Amount text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtTargetamount, "text field");
			type(Stash_ModifyStashSelectors.edittxtTargetamount, prop.getproperty("targetamount1"), " into target amount Field");
            logger.info("Entered the Target Amount");
            
            explicitWaitVisibility(Stash_ModifyStashSelectors.btnSave, 10);
            verifyElementPresent(Stash_ModifyStashSelectors.btnSave, "Save button");
            click(Stash_ModifyStashSelectors.btnSave, "Save button");
            			
		}
	
}

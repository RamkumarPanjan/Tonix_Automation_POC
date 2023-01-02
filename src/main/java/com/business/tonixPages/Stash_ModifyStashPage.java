package com.business.tonixPages;

import com.android.selectors.Stash_ModifyStashSelectors;

public class Stash_ModifyStashPage extends BasePage {

	public Stash_ModifyStashPage() throws InterruptedException {
		super();
	}


	public void modifyStashDetails(String stashName, String stashAmount) throws Exception {
		extent.HeaderChildNode("Modify Existing Stash Details");
		logger.info("Modify Stash Page is displayed");
		explicitWaitVisibility(Stash_ModifyStashSelectors.txtModifyStash, 10);
		if(verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, "Modify Stash Text "))
		{
			explicitWaitVisibility(Stash_ModifyStashSelectors.txtStashFor,10);
			verifyElementPresent(Stash_ModifyStashSelectors.txtStashFor, "Stash For");
			String stashName_before = getText(Stash_ModifyStashSelectors.edittxtStashFor);
			System.out.println(stashName_before);
			softAssertion.assertEquals(stashName, stashName_before);
			clearField(Stash_ModifyStashSelectors.edittxtStashFor, "Stash For text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtStashFor, "text field");
			type(Stash_ModifyStashSelectors.edittxtStashFor, stashName, " into stash For text Field");
			logger.info("Entered the Stash For Name");
			waitTime(3000);
			hideKeyboard();

			explicitWaitVisibility(Stash_ModifyStashSelectors.txtTargetamount, 10);
			verifyElementPresent(Stash_ModifyStashSelectors.txtTargetamount, "Target Amount");
			String stashAmount_before = getText(Stash_ModifyStashSelectors.edittxtTargetamount);
			System.out.println(stashAmount_before);
			softAssertion.assertEquals(stashAmount, stashAmount_before);
			clearField(Stash_ModifyStashSelectors.edittxtTargetamount, "Target Amount text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtTargetamount, "text field");
			type(Stash_ModifyStashSelectors.edittxtTargetamount, stashAmount, " into target amount Field");
			logger.info("Entered the Target Amount");

			explicitWaitVisibility(Stash_ModifyStashSelectors.btnSave, 10);
			verifyElementPresent(Stash_ModifyStashSelectors.btnSave, "Save button");
			click(Stash_ModifyStashSelectors.btnSave, "Save button");

		}
	}

	public void modifyStashName(String stashName) throws Exception {

		extent.HeaderChildNode("Modify Existing Stash Name");
		logger.info("Modify Stash Page is displayed");
		explicitWaitVisibility(Stash_ModifyStashSelectors.txtModifyStash, 10);
		if(verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, "Modify Stash Text "))
		{
			explicitWaitVisibility(Stash_ModifyStashSelectors.txtStashFor,10);
			verifyElementPresent(Stash_ModifyStashSelectors.txtStashFor, "Stash For");
			String stashName_before = getText(Stash_ModifyStashSelectors.edittxtStashFor);
			System.out.println(stashName_before);
			softAssertion.assertEquals(stashName, stashName_before);
			clearField(Stash_ModifyStashSelectors.edittxtStashFor, "Stash For text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtStashFor, "text field");
			type(Stash_ModifyStashSelectors.edittxtStashFor, stashName, " into stash For text Field");
			logger.info("Entered the Stash For Name");
			waitTime(3000);
			hideKeyboard();

			explicitWaitVisibility(Stash_ModifyStashSelectors.btnSave, 10);
			verifyElementPresent(Stash_ModifyStashSelectors.btnSave, "Save button");
			click(Stash_ModifyStashSelectors.btnSave, "Save button");
		}
		}
	
	public void modifyStashAmount(String stashAmount) throws Exception {
		
		extent.HeaderChildNode("Modify Existing Stash Details");
		logger.info("Modify Stash Page is displayed");
		explicitWaitVisibility(Stash_ModifyStashSelectors.txtModifyStash, 10);
		if(verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, "Modify Stash Text "))
		{
			explicitWaitVisibility(Stash_ModifyStashSelectors.txtTargetamount, 10);
			verifyElementPresent(Stash_ModifyStashSelectors.txtTargetamount, "Target Amount");
			String stashAmount_before = getText(Stash_ModifyStashSelectors.edittxtTargetamount);
			System.out.println(stashAmount_before);
			softAssertion.assertEquals(stashAmount, stashAmount_before);
			clearField(Stash_ModifyStashSelectors.edittxtTargetamount, "Target Amount text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtTargetamount, "text field");
			type(Stash_ModifyStashSelectors.edittxtTargetamount, stashAmount, " into target amount Field");
			logger.info("Entered the Target Amount");

			explicitWaitVisibility(Stash_ModifyStashSelectors.btnSave, 10);
			verifyElementPresent(Stash_ModifyStashSelectors.btnSave, "Save button");
			click(Stash_ModifyStashSelectors.btnSave, "Save button");

		}
	}
	}

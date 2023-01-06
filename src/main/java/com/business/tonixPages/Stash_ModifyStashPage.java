package com.business.tonixPages;

import com.android.selectors.Stash_ModifyStashSelectors;

public class Stash_ModifyStashPage extends BasePage {

	public Stash_ModifyStashPage() throws InterruptedException {
		super();
	}
	/**
	 * This Business Method is used to Modify Stash Name and Stash Amount in Modify Stash Page
	 * @param stashName    -->Travelling
	 * @param stashAmount  -->3000
	 * @throws Exception
	 */
	public void modifyStashDetails(String stashName, String stashAmount) throws Exception
	{
		extent.HeaderChildNode("Modify Existing Stash Details");
		logger.info("Modify Stash Page is displayed");
		verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, "Modify Stash Text ");
		if(verifyElementPresent(Stash_ModifyStashSelectors.txtStashFor, "Stash For"))
		{
			String stashName_before = getText(Stash_ModifyStashSelectors.edittxtStashFor);
			System.out.println(stashName_before);
			softAssertion.assertEquals(stashName, stashName_before);
			clearField(Stash_ModifyStashSelectors.edittxtStashFor, "Stash For text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtStashFor, "text field");
			type(Stash_ModifyStashSelectors.edittxtStashFor, stashName, " into stash For text Field");
			logger.info("Entered the Stash For Name");
			waitTime(3000);
			hideKeyboard();
			verifyElementPresent(Stash_ModifyStashSelectors.txtTargetamount, "Target Amount");
			String stashAmount_before = getText(Stash_ModifyStashSelectors.edittxtTargetamount);
			System.out.println(stashAmount_before);
			softAssertion.assertEquals(stashAmount, stashAmount_before);
			clearField(Stash_ModifyStashSelectors.edittxtTargetamount, "Target Amount text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtTargetamount, "text field");
			type(Stash_ModifyStashSelectors.edittxtTargetamount, stashAmount, " into target amount Field");
			logger.info("Entered the Target Amount");
			waitTime(2000);
			verifyElementPresentAndClick(Stash_ModifyStashSelectors.btnSave, "Save button");
			extent.extentLoggerPass("Modify Stash Name and Stash Amount", "Modified Stash Name and Stash Amount Modify stash page");
		}
		else
		{
			extent.extentLoggerFail("Modify stash Name and Stash Amount", "Unable to modify stash Name and Stash Amount in Modify Stash page");
		}
	}
	/**
	 * This Business Method is to modify Stash Name in Modify Stash Page
	 * @param stashName
	 * @throws Exception
	 */
	public void modifyStashName(String stashName) throws Exception 
	{
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
			waitTime(2000);
			verifyElementPresentAndClick(Stash_ModifyStashSelectors.btnSave, "Save button");
			extent.extentLoggerPass("Modify Stash Name", "Modified Stash Name successfully in Modify stash page");
		}
		else
		{
			extent.extentLoggerFail("Modify stash Name", "Unable to modify stash Name in Modify Stash page");
		}
	}
	
	/**
	 * This Business Method is to Modify Stash Amount in Modify Stash Page
	 * @param stashAmount
	 * @throws Exception
	 */
	  public void modifyStashAmount(String stashAmount) throws Exception
	  {
		extent.HeaderChildNode("Modify Existing Stash Details");
		logger.info("Modify Stash Page is displayed");
		if(verifyElementPresent(Stash_ModifyStashSelectors.txtModifyStash, "Modify Stash Text "))
		{
			waitTime(2000);
			verifyElementPresent(Stash_ModifyStashSelectors.txtTargetamount, "Target Amount");
			String stashAmount_before = getText(Stash_ModifyStashSelectors.edittxtTargetamount);
			System.out.println(stashAmount_before);
			softAssertion.assertEquals(stashAmount, stashAmount_before);
			clearField(Stash_ModifyStashSelectors.edittxtTargetamount, "Target Amount text Field");
			Aclick(Stash_ModifyStashSelectors.edittxtTargetamount, "text field");
			type(Stash_ModifyStashSelectors.edittxtTargetamount, stashAmount, " into target amount Field");
			logger.info("Entered the Target Amount");
			waitTime(2000);
			verifyElementPresentAndClick(Stash_ModifyStashSelectors.btnSave, "Save button");
			extent.extentLoggerPass("Modify Stash Amount", "Modified Stash Amount successfully in Modify stash page");
		}
		else
		{
			extent.extentLoggerFail("Modify stash Amount", "Unable to modify stash Amount in Modify Stash page");
		}
	}
}

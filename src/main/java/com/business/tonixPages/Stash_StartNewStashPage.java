package com.business.tonixPages;

import com.android.selectors.Stash_StartNewStashSelectors;



public class Stash_StartNewStashPage extends BasePage {
	
	public Stash_StartNewStashPage() throws InterruptedException {
		super();
	}
	
	public void clickOpenANewStash() throws Exception {
		
		extent.HeaderChildNode("Click on 'Open a New Stash' text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtOpenNewStash, "Open a New Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtOpenNewStash, "Open a New Stash");
			extent.extentLoggerPass("Open a New Stash", "Clicked on Open a New Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Open a New Stash", "Clicked on Open a New Stash text in Start New stash  page");
		}
	}
	
	public void clickEmergencyStash() throws Exception {
		
		extent.HeaderChildNode("Click on Emergency Stash text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtEmergencyStash, "Emergency Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtEmergencyStash, "Emergency Stash");
			
			extent.extentLoggerPass("Emergency Stash", "Clicked on Emergency Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Emergency Stash", "Unable to click on Emergency Stash text in Start New stash  page");
		}
	}
	/**
	 * Vacation Stash
	 * @throws Exception
	 */
	public void clickVacationStash() throws Exception {
		
		extent.HeaderChildNode("Click on Vacation Stash text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtVacationStash, "Vacation Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtVacationStash, "Vacation Stash");
			
			extent.extentLoggerPass("Vacation Stash", "Clicked on Vacation Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Vacation Stash", "Unable to click on Vacation Stash text in Start New stash  page");
		}
	}
	
	public void clickTuitionStash() throws Exception {
		
		extent.HeaderChildNode("Click on Tuition Stash text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtTuitionStash, "Tuition Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtTuitionStash, "Tuition Stash");
			
			extent.extentLoggerPass("Vacation Stash", "Clicked on Tuition Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Vacation Stash", "Unable to click on Tuition Stash text in Start New stash  page");
		}
	}
	
	public void clickNewRideStash() throws Exception {
		
		extent.HeaderChildNode("Click on New Ride Stash text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtNewRideStash, "New Ride Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtNewRideStash, "New Ride Stash");
			
			extent.extentLoggerPass("New Ride Stash", "Clicked on New Ride Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("New Ride Stash", "Unable to click on New Ride Stash text in Start New stash  page");
		}
	}
	/**
	 * Game Console Stash
	 * @throws Exception
	 */
	public void clickGameConsoleStash() throws Exception {
		
		extent.HeaderChildNode("Click on Game Console Stash text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtGameConsleStash, "Game Console Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtGameConsleStash, "Game Console Stash");
			
			extent.extentLoggerPass("Game Console Stash", "Clicked on Game Console Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Game Console Stash", "Unable to click on Game Console Stash text in Start New stash  page");
		}
	}
	
	/**
	 * Function to click on Solo Stash
	 * @throws Exception
	 */
	
	public void selectSoloStashType() throws Exception {
		
		extent.HeaderChildNode("Select Solo Stash Type");
		logger.info("Select stash type pop-up is displayed");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtSelectStashType, "Select stash Type"))
		{		
		explicitWaitVisibility(Stash_StartNewStashSelectors.txtSelectStashType, 10);
		verifyElementPresentAndClick(Stash_StartNewStashSelectors.txtSoloStash, "Solo stash Text");
		logger.info("clicked on Solo Stash type");
		extent.extentLoggerPass("Select Stash type", "select Stash Type text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Select Solo Stash type", "Unable to select Solo Stash Type text in Start New stash  page");
		}
	}
	
	public void selectGroupStashType() throws Exception {
		
		extent.HeaderChildNode("Select Group Stash Type");
		logger.info("Select stash type pop-up is displayed");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtSelectStashType, "Select stash Type"))
		{		
		explicitWaitVisibility(Stash_StartNewStashSelectors.txtSelectStashType, 10);
		verifyElementPresentAndClick(Stash_StartNewStashSelectors.txtGroupStash, "Group Stash Text");
		logger.info("clicked on Group Stash type");
		extent.extentLoggerPass("Select Stash type", "select Group Stash Type text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Select Group Stash type", "Unable to select Group Stash Type text in Start New stash  page");
		}
		
	}
}

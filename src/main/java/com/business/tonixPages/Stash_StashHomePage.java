package com.business.tonixPages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.android.selectors.Stash_StartNewStashSelectors;
import com.android.selectors.Stash_StashHomeSelectors;

public class Stash_StashHomePage extends BasePage {

	public Stash_StashHomePage() throws InterruptedException {
		super();
	}
	
	/**
     * Verify Add to stash page is loaded successfully
	 * Checking if add to stash is displayed
     * Checking stash achieved and goal achieved validations are displayed
     */

	public void clickStartANewStash() throws Exception {
		extent.HeaderChildNode("Click on Start a new stash");
		waitTime(2000);
		if(verifyElementPresent(Stash_StashHomeSelectors.txtStartNewStash, "stashes text"))
		{
			click(Stash_StashHomeSelectors.txtStartNewStash, "Start a new stash");
			extent.extentLoggerPass("Start a new stash", "Clicked on 'Start a new stash' text in main page");
		}
		else
		{
			extent.extentLoggerFail("Start a new stash", "Unable to click on 'Start a new stash' link in stash home page");
		}
	}

	public void clickManage() throws Exception {
		extent.HeaderChildNode("Click on 'Manage' text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StashHomeSelectors.txtManage, "Manage text"))
		{
			click(Stash_StashHomeSelectors.txtManage, "Manage stash");
			extent.extentLoggerPass("Manage stash", "Clicked on 'Manage' text in stash main page");
		}
		else
		{
			extent.extentLoggerFail("Manage stash", "Unable to click on 'Manage' link in stash home page");
		}
	}

	public void clickAddToStash() throws Exception 
	{
		extent.HeaderChildNode("Click on 'Add to stash' text");
		waitTime(2000);
        if(waitForElementToBePresent(Stash_StashHomeSelectors.txtAddToStash, 60, "'Add to Stash' text"))
        {
            click(Stash_StashHomeSelectors.txtAddToStash,"Click 'Add to Stash' text in stash page");
            logger.info("Adding to stash");
            extent.extentLoggerPass("Add to Stash", "Clicked on 'Add to Stash' text in stash page");
        }
        else 
        {
            logger.info("Not added to stash");
            extent.extentLoggerFail("Add to Stash", "Not clicked on 'Add to stash' text in stash page");
        }
	}
	
   public void verifyStashAchieved(String achievedAmount, String targetAmount) throws InterruptedException, Exception 
   {
        extent.HeaderChildNode("Verify 'Achieved' text");	
    	waitTime(2000);
    	if(waitForElementToBePresent(Stash_StashHomeSelectors.txtStash, 60, "'Achieved' text"))
    	{
    	String actualMessage = getText(Stash_StashHomeSelectors.txtAchieved);
		String expectedMessage = "Achieved "+achievedAmount+" of "+targetAmount;
		softAssertion.assertEquals(actualMessage, expectedMessage);
		softAssertion.assertAll();
		
        logger.info("Achieved");
        extent.extentLoggerPass("Achieved", "Verified 'Achieved' text in stash page");
        }
        else 
        {
            logger.info("Not achieved");
            extent.extentLoggerFail("Achieved", "Not verified 'Achieved' text in stash page");
        }
    }
        
       public void verifyGoalAchieved() throws Exception
       {
    		extent.HeaderChildNode("Verify 'Goal achieved' text");
    		String actualMessage = getText(Stash_StashHomeSelectors.txtgoalachieved);
    		String expectedMessage = "Congrats! Goal achieved!";
    		softAssertion.assertEquals(actualMessage, expectedMessage);
    		softAssertion.assertAll();
    		System.out.println("actualMessage: "+actualMessage);
    	}
       
       public void clickEducationStash() throws Exception
       
       {
    	    waitTime(2000);
    	    extent.HeaderChildNode("Click on 'Education' text");
    	    
   		    if(waitForElementToBePresent(Stash_StashHomeSelectors.txtStash, 60, "Education text"))
   		{
   			click(Stash_StashHomeSelectors.txtStash, "Education text");
   			extent.extentLoggerPass("Education text", "Clicked on 'Education' text in stash main page");
   		}
   		else
   		{
   			extent.extentLoggerFail("Education text not clicked", "Unable to click on 'Education' text in stash home page");
   		}  
       }
   
       public void verifyStashClosed( String str) throws Exception {
    	   
    	  if( verifyElementNotPresentInList(Stash_StashHomeSelectors.txtStash, str)) {
    		  
    		  logger.info("Stash is closed");
    		  extent.extentLoggerPass("Stash is closed", "Selected stash is closed in stash page");
     		}
     		else
     		{
     			logger.info("Stash is not closed");
     			extent.extentLoggerFail("Stash is not closed", "Selected stash is closed in stash page");
     		}
       }
       }	






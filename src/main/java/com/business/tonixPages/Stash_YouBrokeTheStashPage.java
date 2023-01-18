package com.business.tonixPages;

import com.android.selectors.Stash_YouBrokeTheStashSelectors;

public class Stash_YouBrokeTheStashPage extends BasePage {

	public Stash_YouBrokeTheStashPage() throws InterruptedException {
		super();
	}
	/**
	 * This Business Method is for confirmation of the Updated Stash Details 
	 * @return 
	 * @throws Exception
	 */
	
	public boolean verifyPageLoaded() throws InterruptedException, Exception
	   {
		
		waitTime(2000);
		if(waitForElementToBePresent(Stash_YouBrokeTheStashSelectors.txtYouBrokeTheStash, 60,"Withdrawal Confirmation text"))
		{
			extent.extentLoggerPass("Page loaded ('Modify Stash')", "'Modify Stash' page loaded successfully");
			return true;
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Modify Stash')", "'Modify Stash' page not loaded successfully");
			return false;
		}
	}
	
	public void clickLater() throws InterruptedException, Exception
	   {
		   
		    if(this.verifyPageLoaded()) {
	    	waitForElementToBePresent(Stash_YouBrokeTheStashSelectors.txtLater, 60, "Money stashed text");
	        click(Stash_YouBrokeTheStashSelectors.txtLater, "Click Done");
	        logger.info("Confirming money stashed");
	        extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }	  
	   }
	
	public void clickStartTimeDeposit() throws InterruptedException, Exception{
		
		    Thread.sleep(9000);
	        if(this.verifyPageLoaded()) {
	    	waitForElementToBePresent(Stash_YouBrokeTheStashSelectors.btnStartTimeDeposit, 60, "Money stashed text");
	        click(Stash_YouBrokeTheStashSelectors.btnStartTimeDeposit, "Click Done");
	        logger.info("Confirming money stashed");
	        extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }	  
	   }
	    
}

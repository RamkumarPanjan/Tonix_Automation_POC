package com.business.tonixPages;


import com.android.selectors.Stash_ManageStashselectors;
import com.android.selectors.Stash_StashHomeSelectors;
import com.android.selectors.Stash_CreatedStashSelectors;
	
public class Stash_StashClosePage extends BasePage{
	
	public Stash_StashClosePage() throws InterruptedException {
		super();	
	}
	
	public void stashclosePage() throws Exception {
		extent.HeaderChildNode(" Stash close Flow");
		
	//	explicitWaitVisibility(StashSetupSelectors.TxtZerooOfTwoAvailablestatshes, 10);
	//	if(verifyElementPresent(StashSetupSelectors.TxtZerooOfTwoAvailablestatshes, "zero of two stashes"))
		//{
		
		//verifyElementPresent(Stash_ManageStashselectors.txtManageStash, "Manage stash text");
		
		    explicitWaitVisibility(Stash_StashHomeSelectors.txtManage, 10);
			click(Stash_StashHomeSelectors.txtManage,"manage text");
			click(Stash_StashHomeSelectors.txtManage,"manage text");
			
			explicitWaitVisibility(Stash_CreatedStashSelectors.txtManageBox, 10);
			click(Stash_CreatedStashSelectors.txtManage1,"manage text");
			click(Stash_CreatedStashSelectors.txtManage1,"manage text");
			
			explicitWaitVisibility(Stash_ManageStashselectors.btnClose, 10);
			click(Stash_ManageStashselectors.btnClose,"close button");
			waitTime(2000);
			explicitWaitVisibility(Stash_ManageStashselectors.txtYesCloseStash, 10);
			click(Stash_ManageStashselectors.txtYesCloseStash, "Yes close the stash");
			
			waitTime(3000);
			click(Stash_ManageStashselectors.btnDone, "Done button");
			
			logger.info("stash is closed successfully..");
		//}
	}

}

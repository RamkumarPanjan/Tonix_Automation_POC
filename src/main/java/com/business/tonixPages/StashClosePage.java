package com.business.tonixPages;

import com.android.selectors.Stash_ManageStashselectors;
import com.android.selectors.Stash_StashHomeSelectors;
import com.android.selectors.Stash_createdStashSelectors;
	
public class StashClosePage extends BasePage{
	
	public StashClosePage() throws InterruptedException {
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
			
			explicitWaitVisibility(Stash_createdStashSelectors.txtManageBox, 10);
			click(Stash_createdStashSelectors.txtManage1,"manage text");
			click(Stash_createdStashSelectors.txtManage1,"manage text");
			
			explicitWaitVisibility(Stash_ManageStashselectors.BtnClose, 10);
			click(Stash_ManageStashselectors.BtnClose,"close button");
			waitTime(2000);
			explicitWaitVisibility(Stash_ManageStashselectors.txtYesCloseStash, 10);
			click(Stash_ManageStashselectors.txtYesCloseStash, "Yes close the stash");
			
			waitTime(3000);
			click(Stash_ManageStashselectors.DoneBtn1, "Done button");
			
			logger.info("stash is closed successfully..");
		//}
	}

}

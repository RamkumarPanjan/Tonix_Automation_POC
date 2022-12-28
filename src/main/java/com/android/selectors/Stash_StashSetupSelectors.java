package com.android.selectors;

import org.openqa.selenium.By;

public class Stash_StashSetupSelectors {
	
	
		
	//Different Stashes Page
	
	public static By txtOpenNewStash=By.xpath("//*[contains(@text,'Open a new Stash')]");
	
	public static By txtStashPageTitle=By.xpath("//*[contains(@text,'Stash')]");
	
	
	
	public static By txtSelectstashType=By.xpath("//*[@class='android.widget.TextView' and @text='Select Stash Type']");
	
	public static By txtSoloStash=By.xpath("//*[@class='android.widget.TextView' and @text='Solo Stash']");
	
	// Setup your stash page
	
	public static By txtSetupYourStash=By.xpath("//*[@class='android.widget.TextView' and @text='Setup your Stash']");
	
	public static By txtStashFor=By.xpath("//*[@text='Stash for']");
	
	
	public static By edittxtStashFor=By.xpath("(//*[@class='android.widget.EditText'])[1]");
	
	public static By txtTargetamount=By.xpath("//*[@text='Target amount']");
	
	public static By edittxtTargetamount=By.xpath("(//*[@class='android.widget.EditText'])[2]");
	
	
	public static By BtnNext=By.xpath("//*[@class='android.view.ViewGroup']/child::android.widget.TextView[@text='Next']");
	
	
	
	

}

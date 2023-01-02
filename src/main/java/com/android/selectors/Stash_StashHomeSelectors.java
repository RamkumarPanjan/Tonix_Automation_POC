package com.android.selectors;

import org.openqa.selenium.By;

public class Stash_StashHomeSelectors {
	
    public static By txtStartNewStash=By.xpath("//*[@class='android.widget.TextView' and contains(@text,'Start a New Stash')]");
    
    public static By txtStartNewStashBox=By.xpath("//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/(child::android.view.ViewGroup)[1]/child::android.view.ViewGroup/child::android.view.ViewGroup");
	
	public static By txtTwoOfTwoAvailablestatshesTxt=By.xpath("//*[contains(@text,'2 of 2 available stashes')]");
	
	public static By txtZerooOfTwoAvailablestatshes=By.xpath("//*[contains(@text,'0 of 2 available stashes')]");
	
	public static By txtOneOfTwoAvailablestashes=By.xpath("//*[@class='android.widget.TextView' and contains(@text,'1 of 2 available stashes')]");
	
	public static By txtManage=By.xpath("(//*[@class='android.widget.TextView' and @text='Manage'])[1]");
	
	public static By txtManage1=By.xpath("//*[@class='android.widget.TextView' and @text='Manage']");
	
	public static By txtManageBox=By.xpath("(//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/(child::android.view.ViewGroup)[2]/descendant::android.view.ViewGroup)[9]");
	
    //public static By txtAddtoStash=By.xpath("//*[@class='android.widget.TextView' and @text='Add to Stash']");
    
    public static By txtAddToStashBox=By.xpath("(//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/(child::android.view.ViewGroup)[2]/descendant::android.view.ViewGroup)[7]");
	
    public static By imgStashNameBox=By.xpath("//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/(child::android.view.ViewGroup)[2]/descendant::android.widget.ImageView");
    
    public static By txtStashNameInBox=By.xpath("//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/(child::android.view.ViewGroup)[2]/descendant::android.widget.ImageView/(following-sibling::android.widget.TextView)[1]");
   
    public static By txtStashNameActual=By.xpath("//*[@text='Start a New Stash']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/(descendant::android.widget.TextView)[1]");
   
    public static By txtStashNameActual2=By.xpath("(//*[@text='Start a New Stash']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/(descendant::android.widget.TextView)[1])[2]");
    
    public static By txtAchieved=By.xpath("//*[contains(@text,'Achieved')]");
    
    public static By txtgoalachieved=By.xpath("//*[@text='Congrats! Goal achieved!']");
    
    //Add to stash page
    //public static By txtAddToStash=By.xpath("//*[@class='android.widget.TextView' and @text='Add to Stash']");
    
    public static By txtAddToStash=By.xpath("//android.widget.TextView[@text='Add to Stash']");
    
    public static By edittxtAddTostash=By.xpath("(//*[@class='android.widget.EditText'])[2]");
    
    public static By btnNext=By.xpath("//*[@class='android.widget.TextView' and @text='Next']");
}

package com.android.selectors;

import org.openqa.selenium.By;

public class Stash_ReviewStashDetailsSelectors {
	
	public static By BtnTickedRadioButton=By.xpath("(//*[@text='I accept the']/preceding-sibling::android.view.ViewGroup)[3]");

	
	public static By txtIAccept=By.xpath("//*[@text='I accept the']");
	
	public static By txtTermsAndConditions=By.xpath("//*[@text=' terms and conditions']");
	
	
	public static By BtnCreateStash=By.xpath("//*[@class='android.view.ViewGroup']/child::android.widget.TextView[@text='Create Stash']");
	
	
	// Solo stash created Page
	
	public static By txtSoloStashCreated=By.xpath("//*[@class='android.view.ViewGroup']/child::android.widget.TextView[@text='Solo Stash created, luv!']");
	
	public static By txtAddManyMore=By.xpath("//*[@class='android.view.ViewGroup']/child::android.widget.TextView[@text='“You add many more money, you stash regularly.” - Chinese Proverb (maybe?)']");
	
	public static By BtnDone=By.xpath("//*[@text='Done']");
}

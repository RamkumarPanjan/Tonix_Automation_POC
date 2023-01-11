package com.business.tonixPages;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.android.selectors.Stash_StashDetailsSelectors;

public class Stash_StashDetailsPage extends BasePage
{

  public String actualStartingDate=null;

  public Stash_StashDetailsPage() throws InterruptedException 
  {
		super();
  }
	/**
	 * This Business Method is to verify Stash Details header
	 * @throws Exception
	 */
	public void VerifystashDetailsHeader() throws Exception {
		extent.HeaderChildNode("Page loaded verification: Stash Details text");

		waitTime(2000);
		if(verifyElementPresent(Stash_StashDetailsSelectors.txtStashDetailsHeader, "Stash Details  text"))
		{
			extent.extentLoggerPass("Page loaded ('Stash Details ')", "'Stash Details ' page loaded successfully");
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Stash Details ')", "'Stash Details ' page loaded successfully");
		}
	}

	/**
	 *  This Business Method to verify stash details
	 * @param targetAmount
	 * @throws Exception
	 */
	public void stashDetails(String targetAmount) throws Exception {
		extent.HeaderChildNode("stash Details");
		String actualstashID = getText(Stash_StashDetailsSelectors.txtStashID);
		System.out.println("Stash ID --->"+actualstashID);
		dateComparison();
		actualStartingDate= getText(Stash_StashDetailsSelectors.txtStartingDate);
		System.out.println("Starting Date -->"+actualStartingDate);
		softAssertion.assertEquals(formattedDate, actualStartingDate);
		String actualTargetAmount = getText(Stash_StashDetailsSelectors.txtTargetAmount);
		System.out.println("Target Amount -->"+actualTargetAmount);
		softAssertion.assertEquals(targetAmount, actualTargetAmount);
		Back(1);
		softAssertion.assertAll();
	}
	//Utility Method for getting current Date 
	public String formattedDate =null;
	public  String dateComparison() {
		LocalDateTime myDateObj = LocalDateTime.now(ZoneId.of("UTC+08:00"));
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd MMM YYYY");
		formattedDate= myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
		ZoneId zone = ZoneId.of("UTC+08:00");
		ZonedDateTime zdt = myDateObj.atZone(zone);
		Instant instant = zdt.toInstant();
		instant.toString();
		return formattedDate;
	}

}

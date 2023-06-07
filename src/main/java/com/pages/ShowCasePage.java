package com.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class ShowCasePage extends Utility
{

	
	public String validateShowCasePageTitle()
	{
		return driver.getTitle();
	}
	
	public ShowCasePage() throws IOException
	{
		PageFactory.initElements(driver,this);
		
	}
	
}

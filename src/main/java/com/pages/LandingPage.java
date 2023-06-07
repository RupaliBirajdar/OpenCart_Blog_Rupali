package com.pages;
import com.utility.Utility;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage extends Utility
{
	
	
	
//	@FindBy(xpath="a[@class='btn btn-link navbar-btn']")
//	private WebElement loginbutton;
	
	@FindBy(xpath="//a[@href='https://www.opencart.com/blog']")
	private WebElement blogLink;
	

	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public String validateLandingPageTitle()
	{
		
		return driver.getTitle();
	}
	
//	blog link
	public BlogPage BlogLink() throws IOException
	{
		blogLink.click();
		return new BlogPage();
	}
	
	

	/*@FindBy(xpath="(//*[text()=\"Login\"])[2]")
	private WebElement login;
	
	public LoginPage Login() throws IOException
	{
		login.click();
		return new LoginPage();
	}
	
	*/
	
	
//	public BlogPage blogPageNavigation() throws IOException
//	{
//		return new BlogPage();
//	}
}

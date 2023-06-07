package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPage extends Utility
{
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	
	public void loginEmail(String em)
	{
	   email.sendKeys(em);	
	}
	
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	public void loginPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
	private WebElement loginBtn;
	
	public BlogPage loginBtn() throws IOException
	{
		loginBtn.click();
		return new BlogPage();
		
	}
	
	
	
	
	
	
}
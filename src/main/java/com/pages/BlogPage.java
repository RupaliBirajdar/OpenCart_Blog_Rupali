package com.pages;
import com.utility.Utility;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BlogPage extends Utility
{
	
//	page title
	
	public String validateBlogPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public BlogPage() throws IOException
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
//	heading check - UI 
	
	@FindBy(xpath="//h1")
	private WebElement heading;
	
	public String Heading() 
	{
		return heading.getText();
	   
	}
	
	
	
//	Logo check - UI
	
	@FindBy(xpath="//img[@title='OpenCart - Blog']")
	private WebElement logo;
	
	public boolean Logo()
	{
		  System.out.println(logo.isDisplayed());
		  return logo.isDisplayed();
//		  assert logo.isDisplayed();

	}
	
	
//	backgound image
	@FindBy(xpath="//div[@class='page-header']")
	private WebElement BgImage;
	
	public boolean BackgroundImg()
	{
		return BgImage.isDisplayed();
	}
	
	
	
//	All Link check - UI
	
//	Features
	@FindBy(xpath="(//*[text()='Features'])[1]")
	private WebElement features;
	
	
//	Demo
	@FindBy(xpath="(//*[text()='Demo'])[1]")
	private WebElement demo;
	
	
//	Marketplace
	@FindBy(xpath="(//*[text()='Marketplace'])[1]")
	private WebElement marketplace;
	
	
//	Blog
	@FindBy(xpath="(//*[text()='Blog'])[1]")
	private WebElement blog;
	
	
	
//	Download
	@FindBy(xpath="(//*[text()='Download'])[1]")
	private WebElement download;
	
	
	
//	Resources - DropDown
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	private WebElement resources;
	


	public void Links()
	{
//		feature link	
		assert features.isDisplayed();
		System.out.println(features.isDisplayed()+" "+features.getText());
		
		assert features.isEnabled();
		System.out.println(features.isEnabled());
		
//		demo link
		assert demo.isDisplayed();
		System.out.println(demo.isDisplayed()+" "+demo.getText());
		
		assert demo.isEnabled();
		System.out.println(demo.isEnabled());
		
		
//		marketplace link
		
		assert marketplace.isDisplayed();
		System.out.println(marketplace.isDisplayed()+" "+marketplace.getText());
		
		assert marketplace.isEnabled();
		System.out.println(marketplace.isEnabled());
		
		
//		blog link
		
		assert blog.isDisplayed();
		System.out.println(blog.isDisplayed()+" "+blog.getText());
		
		assert blog.isEnabled();
		System.out.println(blog.isEnabled());
		
		
//		download link
		
		assert download.isDisplayed();
		System.out.println(download.isDisplayed()+" "+download.getText());
		
		assert download.isEnabled();
		System.out.println(download.isEnabled());
	
		
//		resources link
		
		assert resources.isDisplayed();
		System.out.println(resources.isDisplayed()+" "+resources.getText());
		
		assert resources.isEnabled();
		System.out.println(resources.isEnabled());
		
		
	}
	


//Search Box

	@FindBy(xpath="//input[@name='filter_search']")
	private WebElement searchBox;
	

	public void searchBox() 
	{
		searchBox.click();
	}
	
	

	
	
//	search method 
	public void SearchKeyword(String searchkeyword)
	{
		searchBox.sendKeys(searchkeyword);
	}
	

	
	
//	searchbutton
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchButton;
	
	
	public void searchButton()
	{
		searchButton.click();
	
	}
	
	
//	after searching particular article their is only 1 heading h2 in the page	
	
	@FindBy(xpath="//h2[@class='blog-title']")
	private WebElement HeadingArticle;
	
	public String HeadingArticle() throws IOException
	{
	    return HeadingArticle.getText();

		
	}
	
//	error msg for invalid data - after searching particular article their is only 1 h3 tag is avialable on the page
	
	@FindBy(xpath="//h3")
	private WebElement Msg;
	
	public String DisplayMsg() 
	{
		return Msg.getText();
		
	}
	
	
	
//	@FindBy(xpath = "//a[@class='btn btn-primary hidden-xs']")
	
//	continue button 
	
	@FindBy(xpath="//a[text()='Continue Reading']")
	private WebElement ContinueButton;
	
	public void ContinueBtn() 
	{
		ContinueButton.click();
	
	}
	
//	fecthing the page title after clicking on continue button
	
	public String validateBlogPageTitle_ContBtn()
	{
		return driver.getTitle();
	}
	

	
	
//	image 
	
	@FindBy(xpath="//img[@title='Opencart Cloud']")
	private WebElement image;
	
	public LandingPage image() throws IOException
	{
		image.click();
		return new LandingPage();
	}
	
//	dropdown
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	private WebElement dropdown;
	
	public void dropDown()
	{
		dropdown.click();
	}
	
	
//	dropdown item
	
	@FindBy(xpath="//*[text()='Showcase']")
	   private WebElement dropdownItem;
	   
	   public ShowCasePage selectItem() throws IOException
	   {
		   dropdownItem.click();
		   return new ShowCasePage();
	   }
	
	
	   
	   
	   
	   
	   
	   
	   
	  /*
	   
//	subscribe textbox click method
	   
	   @FindBy(xpath="(//input[@name='newsletter'])[2]")
       private WebElement subscribeInput;
	   
	   public void subscribeInput()
	   {
		   subscribeInput.click();
	   }
	   
//	   subscribe textbox enter email id
	   
	   public void enterEmailId()
	   {
		   subscribeInput.sendKeys("birajdarupali@gmail.com");
	   }
	   
	   
//	   subscribe search button
	   
	   @FindBy(xpath="(//i[@class='fa fa-angle-right'])[2]")
	   private WebElement subscribeSearchBtn;
	   
	   public void SubscribeSearchBtn()
	   {
		   subscribeSearchBtn.click();
		   
	   }
	   
	   
	   
//	   subscribe form 
	   
	   @FindBy(xpath="//h4[@class='modal-title']")
	   private WebElement subscribeForm;
	   
	   
	   public String subscribeForm()
	   {
		   return subscribeForm.getText();
	   }
	   
//	   subscribe form - click on dropdown list
	   @FindBy(xpath="//select[@id='fieldjrayki']")
	   private WebElement dropdownlist;
	   
	   public void subscribeDropdownList()
	   {
		   dropdownlist.click();
	   }
	   
//	 subscribe form - select country name
	 
	   @FindBy(xpath="//option[@value='4155665']")
	   private WebElement countryName;
	   
	   public void countryName()
	   {
		   countryName.click();
	   }
	 
//	  subscribe form - select the  "Other" option for type field
	   @FindBy(xpath="//input[@id='fieldjrydjiy-3']")
	   private WebElement type;
	   
	   public void Type()
	   {
		   type.click();
	   }
	   
//	   subscribe form - select the checkbox for additional subscriptions
	   @FindBy(xpath="//input[@id='fieldjrayky-0']")
	   private WebElement subscriptions;
	   
	   public void Subscriptions()
	   {
		   subscriptions.click();
	   }
	   
	   
//	   subscribe form - click on subscribe button
	   
	   @FindBy(xpath="//button[@id='button-newsletter']")
	   private WebElement subscribeBtn;
	   
	   public void subscribeBtn()
	   {
		   subscribeBtn.click();
	   }
	   
	   
	   
//	   subscribe form - alert box
	   public String alertBox()
	   {
		 return driver.switchTo().alert().getText();
		
		   
	   }
	   
//	   subscribe form - click OK of alert box
	   
	  public void alert()
	  {
		 driver.switchTo().alert().accept();
	  }
	   
	  
//	  subscribe form - click on cancel button
	  @FindBy(xpath="//button[@class='close']")
	  private WebElement close;
	  
	  public void close()
	  {
		  close.click();
	  }
	  
	/*   
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement textarea;
	
   public BlogPage Comment() throws IOException
   {
	   textarea.click();
	   return new BlogPage();
   }
	
   
   
	
	@FindBy(xpath="//button[@id='button-comment']")
	private WebElement commentButton;
	
	*/
	
	
	
	
	
	
	
	
}






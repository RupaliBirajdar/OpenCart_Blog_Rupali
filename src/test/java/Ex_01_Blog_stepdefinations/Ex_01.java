package Ex_01_Blog_stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import com.pages.BlogPage;
import com.pages.LandingPage;
import com.pages.ShowCasePage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.aventstack.extentreports.Status;



public class Ex_01 extends Utility
{
	
	public LandingPage ldp;
	public BlogPage bp;
	
	public ShowCasePage sp;
	
	public void objectMethod() throws IOException
	{
		ldp = new LandingPage();
		bp = new BlogPage();
		
		sp = new ShowCasePage();
	}
	
	
//	Scenario1
	
	@Given("chrome is opened and opencart app is opened")
	public void chrome_is_opened_and_opencart_app_is_opened() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(2000);
//	    Utility.implicitWait();
	    
	    logger = report.createTest("test1");
	    logger.log(Status.INFO,"Validating landing page title");
	    
	    
	    String actualtitle = ldp.validateLandingPageTitle();
	    String expectedtitle = "OpenCart - Open Source Shopping Cart Solution";
	    
	    try
	    {
	    	logger.log(Status.INFO,"Step1 is executed" );
	        assertEquals(expectedtitle,actualtitle);
	        logger.log(Status.PASS,"Step1 is passed");
	        System.out.println(actualtitle);
	        assert true;
	    }
	    
	    catch(AssertionError e)
	    {
	    	e.printStackTrace();
	    	logger.log(Status.FAIL,"Step1 is failed");
	    	captureScreenshotOnFailure();
	    	assert false;
	    }
	    
	    Thread.sleep(2000);
//	    Utility.implicitWait();

	}

	

	
	@When("user click on the blog")
	public void user_click_on_the_blog() throws IOException, InterruptedException 
	{
	   objectMethod();
	   Thread.sleep(1000);
//	    Utility.implicitWait();
	   bp = ldp.BlogLink();
	   
	   logger.log(Status.INFO,"Step2 is executed");
	   
	   System.out.println("clicked");
	}
	
	
	@Then("user navigate to blog page")
	public void user_navigate_to_blog_page() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(2000);
//	    Utility.implicitWait();
		
		logger.log(Status.INFO,"Validating blog page title");
		
		String actualtitle = bp.validateBlogPageTitle();
		String expectedtitle = "OpenCart - Blog";
		
		try
		{
		   logger.log(Status.INFO,"Step3 is executed");
		   assertEquals(expectedtitle,actualtitle);
		   logger.log(Status.PASS,"Step3 is passed");
		   System.out.println(actualtitle);
		   assert true;
		}
		
		catch(AssertionError e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL,"Step3 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
		
	    Thread.sleep(2000);
	}
	
	@Then("user able to see the heading of blog page")
	public void user_able_to_see_the_heading_of_blog_page() throws IOException, InterruptedException 
	{
		    objectMethod();
		    Thread.sleep(1000);
//		    Utility.implicitWait();

		    
		    logger.log(Status.INFO,"Validating the heading of the blog page");
		    
		    String actualtext = bp.Heading();
		    String expectedtext = "Welcome to OpenCart Ecommerce Blog";
		    
		    try
		    {
		    	logger.log(Status.INFO,"Step4 is executed");
		        assertEquals(expectedtext,actualtext);
		        logger.log(Status.PASS,"Step4 is passed");
		        System.out.println(actualtext);
		        assert true;
		    }
		    
		    catch(AssertionError e)
		    {
		       e.printStackTrace();
		       logger.log(Status.FAIL,"Step4 is failed");
		       captureScreenshotOnFailure();
		       assert false;
		    }
		    Thread.sleep(1000);

	}
	
	
//	Scenario2
	
	
	@Then("user able to see the logo")
	public void user_able_to_see_the_logo() throws IOException, InterruptedException 
	{
	   objectMethod();
	   Thread.sleep(1000);
//	    Utility.implicitWait();

	   boolean checkLogo = bp.Logo();
	   assertTrue(checkLogo);
	   logger.log(Status.INFO,"Step5 is executed");
	   System.out.println("logo");
	   Thread.sleep(1000);
	   
	}


	
	
	@Then("user able to see the all links")
	public void user_able_to_see_the_all_links() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    bp.Links();
	    logger.log(Status.INFO,"Step6 is executed");
	    Thread.sleep(1000);
	}

	
	@Then("user able to see the background image")
	public void user_able_to_see_the_background_image() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();
	    
	    boolean checkBgImg = bp.BackgroundImg();
	    assertTrue(checkBgImg);
	    logger.log(Status.INFO,"Step7 is executed");
	    System.out.println("BG image");
	    Thread.sleep(1000);
	    
	}
	
//	Scenario3
	@When("user clicks on search box")
	public void user_clicks_on_search_box() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    bp.searchBox();
	    logger.log(Status.INFO,"Step8 is executed");
	    System.out.println("clicked");

	}
	
	
	@When("user enter the {string} in search box")
	public void user_enter_the_in_search_box(String searchKeyword) throws IOException, InterruptedException
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

//	    bp.EnterSearch(searchKeyword);
	    bp.SearchKeyword(searchKeyword);
	   
	    logger.log(Status.INFO,"Step9 is executed");
	    System.out.println("enter cloud accounting");
	}
	
	
	@When("press enter button")
	public void press_enter_button() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    bp.searchButton();
	    logger.log(Status.INFO,"Status10 is executed");
	    System.out.println("enter button pressed");
	}
	
	
	@Then("it shows that particular article")
	public void it_shows_that_particular_article() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    
	    logger.log(Status.INFO,"Validating the heading of article");

	    String actualtext = bp.HeadingArticle();
	    String expectedtext = "Cloud Accounting for Small Businesses";
	    
	    try
	    {
	    	logger.log(Status.INFO,"Step11 is executed");
	        assertEquals(expectedtext,actualtext);
	        logger.log(Status.PASS,"Step11 is passed");
	        System.out.println(actualtext);
	        assert true;
	        
	    }
	    
	    catch(AssertionError e)
	    {
	    	e.printStackTrace();
	    	logger.log(Status.FAIL,"Step11 is failed");
	    	captureScreenshotOnFailure();
	    	assert false;
	    }
	    Thread.sleep(2000);

	}
	
	
	
	
	@When("user click on continue reading button of particular article")
	public void user_click_on_continue_reading_button_of_particular_article() throws IOException, InterruptedException 
	{
	   objectMethod();
	   Thread.sleep(1000);
//	    Utility.implicitWait();

	   bp.ContinueBtn();
	   logger.log(Status.INFO,"Step12 is executed");
	   System.out.println("Continue Reading button clicked");
	   Thread.sleep(1000);

	}
	
	
	@Then("user able to see whole article")
	public void user_able_to_see_whole_article() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
//	    Utility.implicitWait();

		
		logger.log(Status.INFO,"Validating the blog page title");
		
		String actualtitle = bp.validateBlogPageTitle_ContBtn();
		String expectedtitle = "Financial Bookkeeping: Cloud Accounting for Small Businesses";
		
		try
		{
		logger.log(Status.INFO,"Step13 is executed");
		assertEquals(expectedtitle,actualtitle);
		logger.log(Status.PASS,"Step13 is passed");
		System.out.println(actualtitle);
		assert true;
		}
		
		catch(AssertionError e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL,"Step13 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
		Thread.sleep(1000);

	    
	}
	
	
//	Scenario 4
	
	@When("user click on the image")
	public void user_click_on_the_image() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    bp.image();
	    logger.log(Status.INFO,"Step14 is executed");
	    System.out.println("img clicked");
	    Thread.sleep(1000);

	}
	
	@Then("user navigate to landing page")
	public void user_navigate_to_landing_page() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    
	    logger.log(Status.INFO,"Validating landing page title");
	    
	    String actualtitle = ldp.validateLandingPageTitle();
	    String expectedtitle = "OpenCart Cloud";
	    
	    try
	    {
	    logger.log(Status.INFO,"Step15 is executed");
	    assertEquals(expectedtitle,actualtitle);
	    logger.log(Status.PASS,"Step15 is passed");
	    System.out.println(actualtitle);
	    assert true;
	    }
	    
	    catch(AssertionError e)
	    {
	    	e.printStackTrace();
	    	logger.log(Status.FAIL,"Step15 is failed");
	    	captureScreenshotOnFailure();
	    	assert false;
	    }
	    
	    Thread.sleep(1000);

	}
	
//	Scenario 5
	
	
	@When("user click on resources dropdown")
	public void user_click_on_resources_dropdown() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    bp.dropDown();
	    logger.log(Status.INFO,"Step16 is executed");
	    System.out.println("Dropdown clicked");
	    Thread.sleep(1000);

	}
	
	
	@When("click on showcase")
	public void click_on_showcase() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
//	    Utility.implicitWait();

	    bp.selectItem();
	    logger.log(Status.INFO,"Step17 is executed");
	    System.out.println("List item selected");
	    Thread.sleep(1000);

	    
	}
	
	
	@Then("user navigate to showcase page")
	public void user_navigate_to_showcase_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
//	    Utility.implicitWait();

		
		logger.log(Status.INFO,"Validating the showcase page title");
		
		String actualtitle = sp.validateShowCasePageTitle();
		String expectedtitle = "OpenCart - Showcase";
		
		try
		{
		logger.log(Status.INFO,"Step18 is executed");
		assertEquals(actualtitle,expectedtitle);
		logger.log(Status.PASS,"Step18 is passed");
		System.out.println("user navigated SP");
		assert true;
		}
		
		catch(AssertionError e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL,"Step18 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	Scenario4-: comment button 
	/*
	@When("user want to write the comment")
	public void user_want_to_write_the_comment() 
	{
	   System.out.println("want to write comment");
	}
	
	
	@When("user click on Login my opencart account")
	public void user_click_on_login_my_opencart_account() throws IOException, InterruptedException 
	{
		  objectMethod();
		  Thread.sleep(1000);
		  bp.LoginAccount();
		  System.out.println("click on login account button");
	}
	
	@Then("user navigate onto login page")
	public void user_navigate_onto_login_page() throws IOException, InterruptedException 
	{
		objectMethod();
	    Thread.sleep(1000);
	    String actualtitle = lp.validateLoginPageTitle();
	    String expectedtitle = "OpenCart - Account Login";
	    assertEquals(expectedtitle,actualtitle);
	    System.out.println("Navigate to login button");
	    
	}
	
	
	@When("user enter email id and password")
	public void user_enter_email_id_and_password() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		lp.loginEmail("birajdarupali@gmail.com");
		lp.loginPassword("Rupali@123");
		System.out.println("enter email & password");

	}
	
	
	@When("click on login button")
	public void click_on_login_button() throws IOException, InterruptedException 
	{
		objectMethod();
	    Thread.sleep(1000);
	    lp.loginBtn();
	    System.out.println("login button clicked");
	    Thread.sleep(2000);
	}
	
	
	@Then("user navigate onto blog page")
	public void user_navigate_onto_blog_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		String actualtitle = bp.validateBlogPageTitle();
//		String actualtitle = lp.validateLoginPageTitle();
		String expectedtitle = "Just moment...";
		Thread.sleep(1000);
		System.out.println(actualtitle);
		Thread.sleep(2000);
		
	}
	
	@When("user click on comment box")
	public void user_click_on_comment_box() throws IOException, InterruptedException 
	{
//		objectMethod();
//		Thread.sleep(1000);
//		bp.Comment();
//		System.out.println("click on comment");
		

	}
	
	
	@When("user write the comment in comment box")
	public void user_write_the_comment_in_comment_box() 
	{
	    
	}
	
	
	@When("click on comment button")
	public void click_on_comment_button() 
	{
	    
	}
	
	
	
	@Then("it shows the  Your comment has been added to our moderation queue! this pop message.")
	public void it_shows_the_your_comment_has_been_added_to_our_moderation_queue_this_pop_message() 
	{
	    
	}
*/
	
	
	

	
	
}
	
	
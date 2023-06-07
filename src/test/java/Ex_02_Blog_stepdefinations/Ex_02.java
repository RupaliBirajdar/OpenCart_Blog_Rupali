package Ex_02_Blog_stepdefinations;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.BlogPage;
import com.pages.LandingPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex_02 extends Utility
{
	
	public LandingPage ldp;
	public BlogPage bp;
	
	public void objectMethod() throws IOException
	{
		ldp = new LandingPage();
		bp = new BlogPage();
	}
	
//	Scenario-1
	@Given("chrome is opened and opencart app is opened")
	public void chrome_is_opened_and_opencart_app_is_opened() throws IOException, InterruptedException 
	{
		    objectMethod();
		    Utility.implicitWait();
		    
		    logger = report.createTest("test2");
		    logger.log(Status.INFO,"Validating landing page title");
		    
		    String actualtitle = ldp.validateLandingPageTitle();
		    String expectedtitle = "OpenCart - Open Source Shopping Cart Solution";
		    
		    try
		    {
		    logger.log(Status.INFO,"Step1 is executed");
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
		    
		    Utility.implicitWait();
		   
	}
	
	
	
	@When("user clicks on blog page link")
	public void user_clicks_on_blog_page_link() throws IOException, InterruptedException 
	{
		   objectMethod();
		   Utility.implicitWait();
		   bp = ldp.BlogLink();
		   logger.log(Status.INFO,"Step2 is executed");
		   System.out.println("clicked");
		   Utility.implicitWait();
	    
	}
	
	
	
	@Then("user navigate to blog page")
	public void user_navigate_to_blog_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Utility.implicitWait();
		
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
		Utility.implicitWait();
	}
	
	
	
	@When("user clicks on search box")
	public void user_clicks_on_search_box() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Utility.implicitWait();
	    bp.searchBox();
	    logger.log(Status.INFO,"Step4 is executed");
	    System.out.println("clicked");
	}
	
	
	
	@When("user enter the {string} in search box")
	public void user_enter_the_in_search_box(String searchKeyword) throws IOException, InterruptedException 
	{
	   objectMethod();
	   Utility.implicitWait();

	   bp.SearchKeyword(searchKeyword);
	 
	   logger.log(Status.INFO,"Step5 is executed");
	   System.out.println("enter keyword");
	}
	
	
	@When("press enter button")
	public void press_enter_button() throws IOException, InterruptedException
	{
	    objectMethod();
	    Utility.implicitWait();
	    bp.searchButton();
	    logger.log(Status.INFO,"Step6 is executed");
	    System.out.println("click search button");
	   
	}
	
	
	@Then("it shows that particular article")
	public void it_shows_that_particular_article() throws IOException, InterruptedException 
	{
	    bp.HeadingArticle();
	    logger.log(Status.INFO,"Step7 is executed");
	    Utility.implicitWait();
	}
	
	
	@When("user enter the {string}  in search box")
	public void user_enter_the_in_search_box1(String searchKeyword) throws IOException, InterruptedException 
	{
		objectMethod();
		Utility.implicitWait();

		bp.SearchKeyword(searchKeyword);
		logger.log(Status.INFO,"Step8 is executed");
		System.out.println("Invalid data");
		
	    
	}
	
	@Then("it shows the Sorry but we couldn’t find what you are looking for this message.")
	public void it_shows_the_sorry_but_we_couldn_t_find_what_you_are_looking_for_this_message() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Utility.implicitWait();
	    
	    logger.log(Status.INFO,"Validating the error msg");
	    
	    String actualtext = bp.DisplayMsg();
	    String expectedtext ="Sorry but we couldn't find what you are looking for. Here are our latest posts.";
	    
	    try
	    {
	      logger.log(Status.INFO,"Step9 is executed");
	      assertEquals(actualtext,expectedtext);
	      logger.log(Status.PASS,"Step9 is passed");
	      System.out.println(actualtext);
	      assert true;
	    }
	    
	    catch(AssertionError e)
	    {
	    	e.printStackTrace();
	    	logger.log(Status.FAIL,"Step9 is failed");
	    	captureScreenshotOnFailure();
	    	assert false;
	    	
	    }
	    Utility.implicitWait();
	    
	}



}

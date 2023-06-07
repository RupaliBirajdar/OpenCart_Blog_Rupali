package Ex_03_Blog_stepdefinations;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import com.pages.BlogPage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.ShowCasePage;
import com.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex_03 extends Utility
{
	public LandingPage ldp;
	public BlogPage bp;
	public LoginPage lp;
	public ShowCasePage sp;
	
	public void objectMethod() throws IOException
	{
		ldp = new LandingPage();
		bp = new BlogPage();
		lp = new LoginPage();
		sp = new ShowCasePage();
	}
	
	/*
	@Given("chrome is opened and opencart app is opened")
	public void chrome_is_opened_and_opencart_app_is_opened() throws IOException, InterruptedException 
	{
		objectMethod();
	    Thread.sleep(2000);
	    
	    logger = report.createTest("test3");
	    logger.log(Status.INFO,"Validating landing page title");
	    
	    
	    String actualtitle = ldp.validateLandingPageTitle();
	    String expectedtitle = "OpenCart - Open Source Shopping Cart Solution";
	    
	    try
	    {
	    logger.log(Status.INFO,"Step1 is executed");
	    assertEquals(expectedtitle,actualtitle);
	    logger.log(Status.PASS, "Step1 is passed");
	    System.out.println(actualtitle);
	    assert true;
	    }
	    
	    catch(AssertionError e)
	    {
	    	e.printStackTrace();
	    	logger.log(Status.FAIL, "Step1 is failed ");
	    	captureScreenshotOnFailure();
	    	assert false;
	    }
	    

	    Thread.sleep(2000);
	}
	
	
	@When("user click on the blog")
	public void user_click_on_the_blog() throws IOException, InterruptedException 
	{
		   objectMethod();
		   Thread.sleep(1000);
		   bp = ldp.BlogLink();
		   logger.log(Status.INFO,"Step2 is executed");
		   System.out.println("clicked");
		  
	}
	
	
	@Then("user naviagte to blog page")
	public void user_naviagte_to_blog_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(2000);
		
		logger.log(Status.INFO,"Validating blog page title");
		
		String actualtitle = bp.validateBlogPageTitle();
		String expectedtitle = "OpenCart - Blog";
		
		try
		{
		  logger.log(Status.INFO,"Step3 is executed");
		
		  assertEquals(expectedtitle,actualtitle);
		  
		  logger.log(Status.PASS,"Test is passed");
		  System.out.println(actualtitle);
		  
		  assert true;
		}
		
		catch(AssertionError e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL,"Test is failed");
			captureScreenshotOnFailure();
			assert false;
			
		}
		
	    Thread.sleep(2000);
	}
	
	
	@When("user click on subscribe textbox")
	public void user_click_on_subscribe_textbox() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
	    bp.subscribeInput();
	    
	    logger.log(Status.INFO,"Test4 is executed");
	    
	    System.out.println("textbox clicked");
	    Thread.sleep(2000);
	    
	}
	
	@When("enter the email id")
	public void enter_the_email_id() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
	    
	    bp.enterEmailId();
	    
	    logger.log(Status.INFO,"Step5 is executed");
	    System.out.println("entered email id");
	    Thread.sleep(1000);
	}
	
	@When("click on search button")
	public void click_on_search_button() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(1000);
		bp.SubscribeSearchBtn();
		
		logger.log(Status.INFO,"Step6 is executed");
		
		System.out.println("search button pressed");
		Thread.sleep(2000);
	    
	}
	
	@Then("user able to see the form")
	public void user_able_to_see_the_form() throws IOException, InterruptedException 
	{
	   objectMethod();
	   Thread.sleep(1000);
	   
	   logger.log(Status.INFO,"Validating the subscribe form");
	   String actualresult = bp.subscribeForm();
	   String expectedresult = "Sign up to our newsletter";
	   
	   try
	   {
		   logger.log(Status.INFO,"Step7 is executed");
		 
	       assertEquals(expectedresult,actualresult);
	       
	       logger.log(Status.PASS,"Step7 is passed");
	       
	       System.out.println(actualresult);
	   }
	   
	   catch(AssertionError e)
	   {
		   e.printStackTrace();
		   logger.log(Status.FAIL,"Step7 is failed");
		   captureScreenshotOnFailure();
		   assert false;
		   
		   
	   }
	   
	   Thread.sleep(1000);
	}
	
	@Then("user click on country name dropdown list")
	public void user_click_on_country_name_dropdown_list() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		bp.subscribeDropdownList();
		
		logger.log(Status.INFO,"Step8 is executed");
		System.out.println("dropdown clicked");
		Thread.sleep(1000);
	    
	}
	
	@And("user selects the country name from dropdown list")
	public void user_selects_the_country_name_from_dropdown_list() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
	    bp.countryName();
	    
	    logger.log(Status.INFO,"Step9 is executed");
	    System.out.println("selected the name");
	    Thread.sleep(1000);
	    
	}
	
	
	@Then("user select the Other option for type field")
	public void user_select_the_other_option_for_type_field() throws IOException, InterruptedException
	{
	    objectMethod();
	    Thread.sleep(1000);
	    bp.Type();
	    
	    logger.log(Status.INFO,"Step10 is executed");
	    System.out.println("select the checkbox");
	    Thread.sleep(1000);
	}
	
	
	@Then("user select the checkbox for additional subscription")
	public void user_select_the_checkbox_for_additional_subscription() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
	    bp.Subscriptions();
	    
	    logger.log(Status.INFO,"Step11 is execute");
	    System.out.println("Select the attional subscription option");
	    Thread.sleep(1000);
	    
	}
	
	@Then("user click on subscribe button")
	public void user_click_on_subscribe_button() throws IOException, InterruptedException 
	{
	   objectMethod();
	   Thread.sleep(1000);
	   bp.subscribeBtn();
	   
	   logger.log(Status.INFO,"Step12 is executed");
	   System.out.println("clicked button");
	   Thread.sleep(1000);
	}
	
	@Then("user able to see the alert box")
	public void user_able_to_see_the_alert_box() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		
		logger.log(Status.INFO,"Validating the alert box");
		
	    String actualtext =	bp.alertBox();
	    String expectedtext = "Error: This subscribe form requires that you fill in a CAPTCHA to be added to the list.";
	    
	    try
	    {
	        assertEquals(expectedtext,actualtext);
	        logger.log(Status.PASS,"Step13 is passed");
	        System.out.println(actualtext);
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
	
	@Then("click on OK button of alert box")
	public void click_on_ok_button_of_alert_box() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
	    bp.alert();
	    
	    logger.log(Status.INFO,"Step14 is executed");
	    
	    System.out.println("click on OK");
	    Thread.sleep(2000);
	}

	
	@Then("click on close icon")
	public void click_on_close_icon() throws IOException, InterruptedException 
	{
	    objectMethod();
	    Thread.sleep(1000);
	    bp.close();
	    
	    logger.log(Status.INFO,"Step15 is executed");
	    
	    System.out.println("closed");
	    Thread.sleep(1000);
	}
	*/
	
}

package Excel_stepdefinations;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.utility.Config;
import com.utility.ExcelReader;

import com.aventstack.extentreports.Status;
import com.pages.BlogPage;
import com.pages.LandingPage;
import com.pages.ShowCasePage;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Ex_01 extends Utility
{
	
	public LandingPage ldp;
	public BlogPage bp;
	
	public ShowCasePage sp;
	ExcelReader reader;
	
	public void objectMethod() throws IOException
	{
		ldp = new LandingPage();
		bp = new BlogPage();
		
		sp = new ShowCasePage();
	}
	
    
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
	
	
	@When("user clicks on blog page link")
	public void user_clicks_on_blog_page_link() throws IOException, InterruptedException 
	{
		  objectMethod();
		   Thread.sleep(1000);
		   bp = ldp.BlogLink();
		   logger.log(Status.INFO,"Step2 is executed");
		   System.out.println("clicked");
		  
	}
	
	
	@Then("user navigate to blog page")
	public void user_navigate_to_blog_page() throws IOException, InterruptedException 
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
	
	
	@When("user clicks on search box")
	public void user_clicks_on_search_box() throws IOException 
	{
		objectMethod();
	    Utility.implicitWait();
	    bp.searchBox();
	    logger.log(Status.INFO,"Step4 is executed");
	    System.out.println("clicked");
	}
	
	
	
	
	@When("user fills the data from given sheetname {string}  and rownumber {int}")
	public void user_fills_the_data_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InterruptedException, IOException, InvalidFormatException 
	{
		Thread.sleep(1000);
	    objectMethod();
	    
	    reader = new ExcelReader();
	    
	    List<Map<String,String>> testData = reader.getData(Config.excelPath,sheetName);
	    String searchKeyword = testData.get(rowNumber).get("searchkeyword");
	   
	    
	    bp.SearchKeyword(searchKeyword);
	    
        logger.log(Status.INFO, "Step2 is executed");
        Thread.sleep(1000);        

	}
	
	
	@When("press enter button")
	public void press_enter_button() throws IOException 
	{
		objectMethod();
	    Utility.implicitWait();
	    bp.searchButton();
	    logger.log(Status.INFO,"Step6 is executed");
	    System.out.println("click search button");
	}
	
	
	@Then("it shows that particular article")
	public void it_shows_that_particular_article() throws IOException 
	{
		bp.HeadingArticle();
	    logger.log(Status.INFO,"Step7 is executed");
	    Utility.implicitWait();
	    
	}


}

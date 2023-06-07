package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"src/test/resources/Features/Blog_2.feature"},
		glue = {"Ex_02_Blog_stepdefinations", "apphooks"},
				 plugin= {"pretty" ,
						 "html:Cucumber Report/cucumber",
						 "json:Cucumber Report/cucumber.json",
				 		 "junit:Cucumber Report/cucumber.xml"}
		
		)

public class Ex_02_Blog_TestRunner extends AbstractTestNGCucumberTests
{
 
}

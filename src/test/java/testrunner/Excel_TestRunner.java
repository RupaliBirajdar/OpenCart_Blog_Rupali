package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Features/Excel.feature"},
		glue = {"Excel_stepdefinations", "apphooks"},
				 plugin= {"pretty" ,
						 "html:Cucumber Report/cucumber",
						 "json:Cucumber Report/cucumber.json",
				 		 "junit:Cucumber Report/cucumber.xml"}
		
		)

public class Excel_TestRunner extends AbstractTestNGCucumberTests
{
  
}

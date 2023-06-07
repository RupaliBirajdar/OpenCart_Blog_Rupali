Feature: Blog


Scenario: Validate user navigate on to blog
Given chrome is opened and opencart app is opened
When user click on the blog 
Then user navigate to blog page
Then user able to see the heading of blog page




Scenario: Validate blog page UI 
Given chrome is opened and opencart app is opened
When user click on the blog 
Then user navigate to blog page
Then user able to see the heading of blog page
And user able to see the logo
And user able to see the all links 
And user able to see the background image




Scenario: Validate continue reading field
Given chrome is opened and opencart app is opened
When user click on the blog 
Then user navigate to blog page
Then user able to see the heading of blog page
When user clicks on search box 
And user enter the "Cloud Accounting" in search box
And press enter button 
Then it shows that particular article
When user click on continue reading button of particular article
Then user able to see whole article



Scenario: Validate the image
Given chrome is opened and opencart app is opened
When user click on the blog 
Then user navigate to blog page
Then user able to see the heading of blog page
When user click on the image
Then user navigate to landing page




Scenario: Validate the Dropdown List
Given chrome is opened and opencart app is opened
When user click on the blog 
Then user navigate to blog page
Then user able to see the heading of blog page
When user click on resources dropdown
And click on showcase
Then user navigate to showcase page





















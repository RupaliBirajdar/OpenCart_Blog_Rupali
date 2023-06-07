Feature: Blog


Scenario Outline: Validate the Search box with valid data
Given chrome is opened and opencart app is opened
When user clicks on blog page link
Then user navigate to blog page
When user clicks on search box 
And user enter the "<searchkeyword>" in search box
And press enter button 
Then it shows that particular article

Examples:
| searchkeyword| 
|cloud accounting|
|community management strategies|




Scenario Outline: Validate the Search box with invalid data
Given chrome is opened and opencart app is opened
When user clicks on blog page link
Then user navigate to blog page
When user clicks on search box
And user enter the "<searchkeyword>"  in search box
And press enter button 
Then it shows the Sorry but we couldn’t find what you are looking for this message.

Examples:
|searchkeyword|
|@@@|


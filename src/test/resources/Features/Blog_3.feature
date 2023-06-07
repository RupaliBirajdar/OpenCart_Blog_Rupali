Feature:

Scenario: Validate subscribe button
Given chrome is opened and opencart app is opened
When user click on the blog 
Then user naviagte to blog page
When user click on subscribe textbox
And enter the email id
And click on search button
Then user able to see the form
Then user click on country name dropdown list
And user selects the country name from dropdown list
And user select the Other option for type field
And user select the checkbox for additional subscription
And user click on subscribe button
Then user able to see the alert box
And click on OK button of alert box
And click on close icon




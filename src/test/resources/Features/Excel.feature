Feature:


Scenario: Validate the Search box with valid data
Given chrome is opened and opencart app is opened
When user clicks on blog page link
Then user navigate to blog page
When user clicks on search box 
And user fills the data from given sheetname "<SheetName>"  and rownumber <RowNumber>
And press enter button 
Then it shows that particular article



Examples:
| SheetName | RowNumber |
| Sheet1    |     0     |

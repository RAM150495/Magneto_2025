@Login
Feature: To validate Login in Magento Application



Scenario Outline: To Validate User valid and invalid Login in Magento Application 
When The user has to click sigin in button
And The user has to enter "<email>" and "<password>"
Then The user has to click signin button 

Examples:
|email|password|
|ramaneeyan154@gmail.com|ram15495|
|frank3421@gmail.com|fas@11234|
|elam123@gmail.com|ela345|
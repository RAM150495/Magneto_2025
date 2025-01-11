@Reg
Feature: To validate User Registration in Magento Application



Scenario: To Validate User valid and invalid Registration in Magento Application 

When The user has to click Create an account button
And The user has to enter the details in required fields
|fname|lname|email|password|repass|
|ramaneeyan|saravanan|ramaneeyan154@gmail.com|ram@@15495|ram@@15495|
|frankline|r|frank12@gmail.com|1234|34567|
|ela|mathi|ela@gmail.com|sdfg|ertyu|
Then The user has to click create account button 


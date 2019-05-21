Feature: BDD Demo
Implementation of Cross Site Scripting (XSS) automation testing for Tracking Inbox Tab

Scenario: Verify the login functionality
   Given they launch the application
   And they login with credentials
   Then home Page is displayed


Scenario: Verify the login functionality
   Given they launch the application
   And they login with "TestUser7" and "Test@123"
   Then home Page is displayed


Scenario Outline: Verify the login functionality
   Given they launch the application
   And they login with "TestUser7" and "Test@123"
   Then home Page is displayed

Examples:
| username  | password |
| TestUser7 | Test@123 |
| TestUser7 | Test@123 | 
| TestUser7 | Test@123 | 
| TestUser7 | Test@123 |


Scenario: Verify the login functionality
   Given they launch the application
   And they login with below credentials:
   | TestUser7 | Test@123 |
   Then home Page is displayed


Scenario: Verify the login functionality using Map in Data Tables
   Given they launch the application
   And they login with given credentials:
   | username  | password  |
   | TestUser7 | Test@123  |
   | TestUser7 | Test@123  |
   
@DataDriven @Demo
Scenario: Verify the login functionality using Map in Data Tables
   Given they launch the application
   And they login with credentials coming from "Sheet1" of "TestData.xlsx"
   Then home Page is displayed
  
@Smoke
Scenario: Verify the login functionality using Map in Data Tables
   Given they launch the application
   And they login with given credentials:
   | username  | password  |
   | TestUser7 | Test@123  |
   | TestUser7 | Test@123  |
   Then home Page is displayed 
   

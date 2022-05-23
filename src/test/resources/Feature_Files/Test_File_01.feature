Feature: To validate if the required text box and buttons are working

  Background: Flow till Login Page
    When One_Driver is loaded
    When One_Property File is loaded
    Then One_Directed to the site

  Scenario: Valid credentials to login
    And One_Enter the user name
    Then One_Enter the password
    And One_Click on Login
    Then One_Log Out
    Then One_Driver is closed

  Scenario: Invalid credentials to login
    And One_Enter the invalid user name
    Then One_Enter the invalid password
    And One_Click on Login
    Then One_Driver is closed

  Scenario: Forgot Password
    And One_Click on Forgot your password
    Then One_Driver is closed

Feature: To verify whether admin should be able to View all employee details

  Scenario: To validate if admin able to View all employee details
    When Four_Driver is loaded
    When Four_Property File is loaded
    Then Four_Directed to the site
    And Four_Enter valid credentials and login
    Then Four_Click on Employee List
    Then Four_Log Out
    Then Four_Driver is closed

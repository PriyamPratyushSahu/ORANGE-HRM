Feature: To verify whether admin should be able to Add employee on the list.

  Scenario: To validate if admin able to add employee on the list
    When Five_Driver is loaded
    When Five_Property File is loaded
    Then Five_Directed to the site
    And Five_Enter valid credentials and login
    Then Five_Click on PIM
    Then Five_Click on Add Employee
    Then Five_Enter New Employee data
    Then Five_Log Out
    Then Five_Driver is closed

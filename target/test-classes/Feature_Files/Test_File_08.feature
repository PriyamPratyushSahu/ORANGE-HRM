Feature: To verify whether the ESS-Employee  can view his personal details under the ‘My Info’ Module.

  Scenario: To validate if ESS-Employee  can view his personal details under the ‘My Info’ Module.
    When Eight_Driver is loaded
    When Eight_Property File is loaded
    Then Eight_Directed to the site
    And Eight_Enter the user name
    Then Eight_Enter the password
    And Eight_Click on Login
    Then Eight_Log Out
    Then Eight_Driver is closed

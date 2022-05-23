Feature: To verify whether  ESS-Supervisor should be able to View his personal details as well as his/her subordinates.

  Scenario: To validate if ESS-Supervisor able to view his personal details
    When Seven_Driver is loaded
    When Seven_Property File is loaded
    Then Seven_Directed to the site
    And Seven_Enter valid credentials and login
    Then Seven_Click on PIM
    Then Seven_Click on Employee List
    Then Seven_Log Out
    Then Seven_Driver is closed

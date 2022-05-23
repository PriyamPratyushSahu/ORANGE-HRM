Feature: To verify whether  admin should be able to Generate employee report

  Scenario: To validate if admin able to generate employee report
    When Six_Driver is loaded
    When Six_Property File is loaded
    Then Six_Directed to the site
    And Six_Enter valid credentials and login
    Then Six_Click on PIM
    Then Six_Click on Reports
    Then Six_Add a new Report
    Then Six_Log Out
    Then Six_Driver is closed

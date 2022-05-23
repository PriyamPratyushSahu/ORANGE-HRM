Feature: To check relevant employee related information

  Scenario: Different types of personal information, detailed qualifications, work experience, job related information etc.
    When Two_Driver is loaded
    When Two_Property File is loaded
    Then Two_Directed to the site
    And Two_Enter valid credentials and login
    Then Two_Click on PIM
    Then Two_Click on Employee List
    Then Two_Log Out
    Then Two_Driver is closed
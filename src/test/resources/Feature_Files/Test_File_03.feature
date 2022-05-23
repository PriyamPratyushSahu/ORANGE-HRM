Feature: To verify whether admin should be able to Configure optional and custom fields

  Background: Flow till PIM
    When Three_Driver is loaded
    When Three_Property File is loaded
    Then Three_Directed to the site
    And Three_Enter valid credentials and login
    Then Three_Click on PIM
    Then Three_Click on Configuration

  Scenario: Configure optional fields
    Then Three_Click on Optional Fields
    Then Three_Log Out
    Then Three_Driver is closed

  Scenario: Configure custom fields
    Then Three_Click on Custom fields
    Then Three_Log Out
    Then Three_Driver is closed

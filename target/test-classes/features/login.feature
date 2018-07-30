Feature: This feature is about logging into the system

  Scenario: Successful login
    Given I have opened homepage
    When I select My account menu
    And I select Login from my account menu
    And I enter Email in login form
    And I enter Password in login form
    And I select login from login form
    Then I have logged in
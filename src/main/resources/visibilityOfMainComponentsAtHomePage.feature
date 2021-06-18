Feature: visibilityOfMainComponentsAtHomePage
  As a user
  I want to see all main components at site
  So that I can be sure that site loaded correctly

  Scenario Outline: Check visibility of all main components at home page
    Given User opens '<homePage>' page
    When User checks that current url contains '<homePage>'
    Then User checks header visibility
    And User checks footer visibility
    And User checks cart visibility
    And User checks language button visibility
    And User checks sign in button visibility
    And User checks register button visibility
    And User checks search field visibility
    And User checks search button visibility

    Examples:
      | homePage             |
      | https://www.ebay.com |
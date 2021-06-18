Feature: registrationForm
  As a user
  I want to test registration form
  So that I can be sure that I can register to the site

  Scenario Outline: Check that user can register to the site with valid data
    Given User opens '<homePage>' page
    And User clicks 'Register' button
    And User checks registration form visibility
    When User fill first name field '<firstName>'
    And User fill last name field '<lastName>'
    And User fill email field '<email>'
    And User fill password field '<password>'
    Then User clicks 'Create account' button
    And User checks alert message visibility

    Examples:
      | homePage              | firstName | lastName | email            | password |
      | https://www.ebay.com/ | qwerty    | qwerty   | qwerty@gmail.com | zdcvb123 |

  Scenario Outline: First name field validation
    Given User opens '<homePage>' page
    And User clicks 'Register' button
    And User checks registration form visibility
    When User fill first name field '<firstName>'
    And User fill last name field '<lastName>'
    And User fill email field '<email>'
    And User fill password field '<password>'
    Then User checks first name error message visibility

    Examples:
      | homePage             | firstName | lastName | email            | password |
      | https://www.ebay.com |           | qwerty   | qwerty@gmail.com | zdcvb123 |

  Scenario Outline: Last name field validation
    Given User opens '<homePage>' page
    And User clicks 'Register' button
    And User checks registration form visibility
    When User fill first name field '<firstName>'
    And User fill last name field '<lastName>'
    And User fill email field '<email>'
    And User fill password field '<password>'
    Then User checks second name error message visibility

    Examples:
      | homePage             | firstName | lastName | email            | password |
      | https://www.ebay.com | qwerty    |          | qwerty@gmail.com | zdcvb123 |

  Scenario Outline: Email field validation
    Given User opens '<homePage>' page
    And User clicks 'Register' button
    And User checks registration form visibility
    When User fill first name field '<firstName>'
    And User fill last name field '<lastName>'
    And User fill email field '<email>'
    And User fill password field '<password>'
    Then User checks email error message visibility

    Examples:
      | homePage             | firstName | lastName | email | password |
      | https://www.ebay.com | qwerty    | qwerty   |       | zdcvb123 |

  Scenario Outline: Password field validation
    Given User opens '<homePage>' page
    And User clicks 'Register' button
    And User checks registration form visibility
    When User fill first name field '<firstName>'
    And User fill last name field '<lastName>'
    And User fill email field '<email>'
    And User fill password field '<password>'
    And User clicks first name field
    Then User checks password error message visibility

    Examples:
      | homePage             | firstName | lastName | email            | password |
      | https://www.ebay.com | qwerty    | qwerty   | qwerty@gmail.com |          |
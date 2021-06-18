Feature: buyingFormat
  As a user
  I want to test buying format filter
  So that I can be sure that I can filter products

  Scenario Outline: Check buying format filter
    Given User opens '<homePage>' page
    And User hover 'Electronics category button'
    And User checks 'Xiaomi Category' button visibility
    And User clicks 'Xiaomi Category' button]
    And User checks 'Xiaomi smartphones category' button visibility
    And User clicks 'Xiaomi smartphones category' button
    When User checks title visibility
    And User clicks 'Best offer' button
    Then User checks that current url contains '<bestOffer>'
    And User clicks 'Auction' button
    And User checks that current url contains '<auction>'
    And User clicks 'Buy It Now' button
    And User checks that current url contains '<BuyItNow>'

    Examples:
      | homePage             | bestOffer | auction   | BuyItNow |
      | https://www.ebay.com | BO=1      | Auction=1 | BIN=1    |
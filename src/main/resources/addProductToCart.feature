Feature: Add product to cart
  As a user
  I want to add product to cart
  So that I can buy several products at one time

  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<eBayItemNumber>'
    And User clicks search button
    And User clock click close pop up button
    And User checks product title visibility
    And User clicks on product title
    And User clicks 'Select color' button
    And User clicks 'Gray color' button
    And User clicks 'Add to Cart' button on product
    And User makes search by keyword '<anotherEBayItemNumber>'
    And User clicks search button
    And User checks product title visibility
    And User clicks on product title
    And User clicks 'Add to Cart' button on product
    Then User checks items amount in product cart
    And User clicks 'Go to checkout' button
    And User clicks 'Continue as guest' button
    And User checks 'confirm and pay' button visibility



    Examples:
      | homePage             | eBayItemNumber | anotherEBayItemNumber |
      | https://www.ebay.com | 154456792931   | 294156394061          |


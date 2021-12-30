Feature: I want to search item, add item to the cart, check presence of the item in the cart, delete item and check presence again

  Background: Open page and search
    When I open the main page
    Then Page opened

  Scenario: Search
    When I send keys to the search
    And I wait three sec
    #Add some waiting because site freezes due to load, can be deleted easily
    Then Search completed

  Scenario: Add to cart and check items in cart
    Given I send keys to the search
    And Search completed
    When I click add to cart
    And I click go to cart
    And I wait three sec
    #Add some waiting because site freezes due to load, can be deleted easily
    Then Cart is not empty

  Scenario: Delete from cart and check items in cart
    Given I send keys to the search
    And Search completed
    When I click add to cart
    And I click go to cart
    And I click delete item from cart
    Then Cart is empty












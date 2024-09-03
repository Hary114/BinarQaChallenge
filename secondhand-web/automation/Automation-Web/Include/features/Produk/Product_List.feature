@Product_List
Feature: Product List
  To see the list of products

  @PLis001 @Positive
  Scenario: User want to see the product list
    When User redirected to product list page
    Then User can see the product list
    And There are product cards
    And There are Image of the products
    And There are Name of the products
    And There are Category of the products
    And There are Price of the products

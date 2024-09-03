@App_Search_Product
Feature: App Search Product
  As a User
  I want to search for product
  So that I can find items I am interested in

  @ASP001 @Positive
  Scenario: User successfully searches for a product
    #Given User open Secondhand Binaracademy application
    When User press on Search Product field
    When User input "ikan" on the Search Product field
    #Then The system displays a list of product related to "Man T-shirt"

  @ASP002 @Positive
  Scenario: User successfully searches for a product and see the product details page
  	When User press on Search Product field
    And User input "Man T-Shirt4" on the Search Product field
    And User press on the "Man T-Shirt4" product name
    Then User redirected to product detail page "Detail Produk"
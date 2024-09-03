@App_Product_Detail
Feature: App Product Detail
  To see the details in a product available for offer

  @APD001 @Positive
  Scenario: User successfully searches for a product and see the product details
    #Given User press on Search Product field
    #When User input "Man T-Shirt" on the Search Product field
    #And The system displays a list of product related to the searched products
    #And User press on the "Man T-Shirt" product name
    #And User redirected to product detail page "Detail Produk"
    And User can see the seller product image
    And User can see the seller product name
    And User can see the seller product price
    And User can see the seller name
    And User can see the seller location
    And User can see the seller product category
    And User can see the seller product description
    Then There is the Saya Tertarik dan Ingin Nego button
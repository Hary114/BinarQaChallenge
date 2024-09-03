@Product_Detail_Offer
Feature: Product Detail Offer
  To allow User to see the details of a product that's available for offer

  Background: 
    # Login as the seller
    #Given User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Seller create a product
    #When User click on +Jual button
    #And User input Nama Produk field "Baju Kecelup"
    #And User input Harga Produk field "90000"
    #And User select the Kategori "Baju"
    #And User input Deskripsi field "A good t-shirt for man and women"
    #And User upload product image
    #And User click on Terbitkan button
    #Then User redirected to product detail page
    # Seller Logout
    #When User click on person icon on the navbar
    #And User click on Keluar button
    #Then User redirected to product list page
    # Login as the buyer
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy6@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page

  @PDO001 @Positive
  Scenario: User want to see the product details before making an offer
    #When User input Search Product field "Baju Kecelup"
    And User click on "Pisang EMAS LANGKA" product card
    And User redirected to product detail offer page
    And User see the product image
    And User see the product name
    And User see the product category
    And User see the product description
    And User see the seller name
    Then User see the seller city

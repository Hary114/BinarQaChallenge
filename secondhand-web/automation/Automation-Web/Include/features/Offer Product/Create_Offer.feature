@Create_Offer
Feature: Create Offer
  To allow User to make an offer for a product

  Background: 
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Seller create a product
    #When User click on +Jual button
    #And User input Nama Produk field "Baju Metal"
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
    #And User input registered Email "FinalFantasy7@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page

  @CO001 @Positive
  Scenario: Buyer create an offer
    #When User input Search Product field "Pisang EMAS LANGKA"
    #And User click on "Pisang EMAS LANGKA" product card
    #And User redirected to product detail offer page
    And User click on Saya tetarik dan ingin nego button
    And User see the "Masukkan Harga Tawarmu" modal popup
    And User input Harga Tawar field "80000"
    And User click on Kirim button
    And User redirected to product detail offer page
    Then User see button change Menunggu respon penjual

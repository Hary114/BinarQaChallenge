@Product_Detail_Delete
Feature: Product Detail Delete
  To allow User to delete their published or created products

  Background: 
    Given User open "https://secondhand.binaracademy.org/"
    When User click on Masuk button on the navbar
    Then User redirected to "Masuk" page
    And User input registered Username "FinalFantasy6@swiftwind.com"
    And User input registered Password "zWbNCekGNYRcruH"
    When User click on Masuk button
    Then User redirected to product list page
    When User click on +Jual button
    Then User redirected to create product page
    And User input Nama Produk field "Produk di delete"
    And User input Harga Produk field "2000"
    And User select the Kategori "Hobi"
    And User input Deskripsi field "Baru"
    And User upload product image
    When User click on Terbitkan button
    Then User redirected to product detail page

  @PDD001 @Positive
  Scenario: User wants to delete a product
    When User click on Delete button
    Then User redirected "Daftar Jual Saya" page

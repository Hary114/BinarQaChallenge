@Product_List_Semua_Produk_Delete
Feature: Product List Semua Produk Delete

  Background: 

    When User click on Masuk button on the navbar
    And User redirected to "Masuk" page
    And User input registered Email "A12345@gmail.com"
    And User input registered Password "12345"
    And User click on Masuk button
    Then User redirected to product list page
    When User click on burger button on the navbar
    Then User redirected to "Daftar Jual Saya" DJS page

  @PLSPD001 @Positive
  Scenario: User want to delete product as a seller from all product page
    And User click on menu Semua Produk
    When User click on product name Semua Produk "Mobil Mobilan"
    And User redirected to product detail page
    And User click on Delete button
    Then User redirected to "Daftar Jual Saya" DJS page
    And User click on menu Semua Produk
    And User take a screenshot
    

    

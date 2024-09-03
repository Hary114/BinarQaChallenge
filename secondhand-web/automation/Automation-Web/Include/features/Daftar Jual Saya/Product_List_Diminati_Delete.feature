@Product_List_Diminati_Produk_Delete
Feature: Product List Diminati Produk Delete

  Background: 
    When User click on Masuk button on the navbar
    Then User redirected to "Masuk" page
    And User input registered Email "testhary@gmail.com"
    And User input registered Password "abcde12345"
    And User click on Masuk button
    Then User redirected to product list page
   
  @PLDD001 @Positive
  Scenario: User want to delete product as a seller from Diminati page
  	When User click on burger button on the navbar
    Then User redirected to "Daftar Jual Saya" DJS page
    When User click on menu Diminati
    And User click on product name diminati "Pisang23"
    Then User redirected to product detail page
    And User click on Delete button
    Then User redirected to "Daftar Jual Saya" DJS page
    And User click on menu Diminati
    And User take a screenshot

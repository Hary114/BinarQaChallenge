@Preview_Product
Feature: Preview Product
  To see the preview of product before publish it

  Background:  
    #When User click on Masuk button
    #And User redirected to "Masuk" page
    #And User input registered Email "fifi@gmail.com" 
    #And User input registered Password "password" 
    #And User click on Masuk button
    #And User redirected to product list page
    And User click on +Jual button
    Then User redirected to create product page

  @PP001 @Positive
  Scenario: User want to preview the product
    When User input Nama Produk field "Pisang"
    And User input Harga Produk field "10000"
    And User select the Kategori "5" 
    And User input Deskripsi field "buah segar berkualitas" 
    And User upload product image
    And User click on Preview button
    Then User redirected to product preview page
    And There is product image
    And There is product description "buah segar berkualitas" 
    And There is product name "Pisang" 
    And There is product category "Kesehatan" 
    And There is product price "Rp 10.000"
    And There is Terbitkan button
    And There is Edit button
    And There is Delete button

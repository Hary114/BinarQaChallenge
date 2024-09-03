@Create_Product
Feature: Create Product
  To create a new product

  Background: 
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy6@swiftwind.com" 
    #And User input registered Password "zWbNCekGNYRcruH" 
    #And User click on Masuk button
    #Then User redirected to product list page
    And User click on +Jual button
    Then User redirected to create product page

  @CP001 @Positive
  Scenario: User want to create a product with correct input
    When User input Nama Produk field "Pisang EMAS LANGKA" 
    And User input Harga Produk field "10000"
    And User select the Kategori "Kesehatan" 
    And User input Deskripsi field "buah segar berkualitas" 
    And User upload product image
    And User click on Terbitkan button
    Then User redirected to product detail page

  #@CP002 @Negative
  #Scenario: User want to create a product with blank/empty input
    #When User click on Terbitkan button
    #Then There is "Name can't be blank" error message below Nama Produk field
    #And There is "Price can't be blank" error message below Harga Produk field
    #And There is "Category must exist" error message below Kategori dropdown
    #And There is "Description can't be blank" error message below Deskripsi field
#
  #@CP003 @Negative
  #Scenario Outline: User want to add a product with incomplete input
    #When User input Nama Produk field "<Name>"
    #And User input Harga Produk field "<Price>"
    #And User select the Kategori "<Category>"
    #And User input Deskripsi field "<Description>"
    #And User upload product image
    #And User click on Terbitkan button
    #Then There is "<Error Message>" error message below "<Blank Field>" field
#
    #Examples: 
      #| Name        | Price | Category | Description    | Error Message              | Blank Field |
      #|             | 55000 | Baju     | A good product | Name can't be blank        | Name        |
      #| Man T-shirt |       | Baju     | A good product | Price can't be blank       | Price       |
      #| Man T-shirt | 55000 |          | A good product | Category must exist        | Category    |
      #| Man T-shirt | 55000 | Baju     |                | Description can't be blank | Description |

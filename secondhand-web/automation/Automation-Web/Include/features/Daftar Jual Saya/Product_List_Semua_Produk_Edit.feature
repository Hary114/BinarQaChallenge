@Product_List_Semua_Produk_Edit
Feature: Product List Semua Produk Edit

  Background: 
    
    When User click on Masuk button on the navbar
    And User redirected to "Masuk" page
    And User input registered Email "a12345@gmail.com"
    And User input registered Password "12345"
    And User click on Masuk button
    Then User redirected to product list page
    When User click on burger button on the navbar
    Then User redirected to "Daftar Jual Saya" DJS page
    When User click on menu Semua Produk
    When User click on product name Semua Produk "Kulkas New"
    Then User redirected to product detail page
    When User click on Edit button
    Then User redirected to edit product page

  @PLSPE001 @Positive
  Scenario: User wants to edit the submitted product as a seller with complete input the field
    When User input Nama Produk field "Kulkas New 1"
    And User input Harga Produk field "100000"
    And User select the Kategori "Elektronik"
    And User input Deskripsi field "Kulkas terbaru"
    And User upload product image
    And User click on Terbitkan button
    Then User redirected to product detail page

  @PLSPE002 @Negative
  Scenario Outline: User wants to edit the submitted product as a seller with empty input in the name Nama the field
    When User input Nama Produk field "<Name>"
    And User input Harga Produk field "<Price>"
    And User select the Kategori "<Category>"
    And User input Deskripsi field "<Description>"
    And User upload product image
    And User click on Terbitkan button
    Then There is "<Error Message>" error message below "<Blank Field>" field

    Examples: 
      | Name       | Price  | Category   | Description                    | Error Message              | Blank Field |
      |            | 100000 | Elektronik | Type New with magic room & HWS | Name can't be blank        | Name        |
      | Kulkas New |        | Elektronik | Type New with magic room & HWS | Price can't be blank       | Price       |
      | Kulkas New | 100000 |            | Type New with magic room & HWS | Category must exist        | Category    |
      | Kulkas New | 100000 | Elektronik |                                | Description can't be blank | Description |

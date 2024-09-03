@Product_List_Diminati_Edit
Feature: Product List Diminati Edit

  Background: 
    When User click on Masuk button on the navbar
    Then User redirected to "Masuk" page
    And User input registered Email "testhary@gmail.com"
    And User input registered Password "abcde12345"
    And User click on Masuk button
    Then User redirected to product list page
    When User click on burger button on the navbar
    Then User redirected to "Daftar Jual Saya" DJS page
    When User click on menu Diminati
    And User click on product name diminati "TV"
    Then User redirected to product detail page
    And User click on Edit button
    Then User redirected to edit product page

  @PLDE001 @Positive
  Scenario: User wants to edit the Diminati product as a seller with complete input fields
    When User input Nama Produk field "Tv Android"
    And User input Harga Produk field "100000"
    And User select the Kategori "Elektronik"
    And User input Deskripsi field "Tv terbaru"
    And User upload product image
    And User click on Terbitkan button
    Then User redirected to product detail edit diminati page "Tv Android"

  @PLDE002 @Negative
  Scenario Outline: User wants to edit the Diminati product as a seller with incomplete input
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

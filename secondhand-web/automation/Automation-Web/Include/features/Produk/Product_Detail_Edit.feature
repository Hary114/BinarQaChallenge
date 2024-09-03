@Product_Detail_Edit
Feature: Product Detail Edit
  To allow User to edit their published or created products

  Background: 
    Given User open "https://secondhand.binaracademy.org/"
    When User click on Masuk button on the navbar
    Then User redirected to "Masuk" page
    And User input registered Email "FinalFantasy6@swiftwind.com"
    And User input registered Password "zWbNCekGNYRcruH"
    When User click on Masuk button
    Then User redirected to product list page
    When User click on +Jual button
    Then User redirected to create product page
    And User input Nama Produk field "Baju baru"
    And User input Harga Produk field "2000"
    And User select the Kategori "Baju"
    And User input Deskripsi field "Baru"
    And User upload product image
    When User click on Terbitkan button
    Then User redirected to product detail page

  @PDE001 @Positive
  Scenario: User wants to edit a product
    When User click on Edit button
    Then User redirected to edit product page
    And User input Nama Produk field "Baju baru dua"
    And User input Harga Produk field "2500"
    And User select the Kategori "Hobi"
    And User input Deskripsi field "Baru Sekali"
    And User upload product image
    When User click on Terbitkan button
    Then User redirected to product detail page

  #@PDE002 @Positive
  #Scenario Outline: User wants to edit a product
    #When User click on Edit button
    #Then User redirected to edit product page
    #And User input Nama Produk field "<Name>"
    #And User input Harga Produk field "<Price>"
    #And User select the Kategori "<Categories>"
    #And User input Deskripsi field "<Description>"
    #And User upload product image
    #When User click on Terbitkan button
    #Then User redirected to product detail page
#
    #Examples: 
      #| Name          | Price | Categories | Description |
      #| Baju Baru dua |       |            |             |
      #|               |  2500 |            |             |
      #|               |       | Elektronik |             |
      #|               |       |            | Baru Aja    |

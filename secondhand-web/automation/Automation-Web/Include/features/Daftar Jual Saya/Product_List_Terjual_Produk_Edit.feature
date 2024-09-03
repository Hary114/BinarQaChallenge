@Product_List_Terjual_Produk_Edit
Feature: Product List Terjual Produk Edit

  Background: 
    # Login as the seller
    When User click on Masuk button on the navbar
    And User redirected to "Masuk" page
    And User input registered Email "FinalFantasy7@swiftwind.com"
    And User input registered Password "zWbNCekGNYRcruH"
    And User click on Masuk button
    Then User redirected to product list page
    # Seller create a product
    When User click on +Jual button
    And User input Nama Produk field "Baju Ting Tong"
    And User input Harga Produk field "90000"
    And User select the Kategori "Baju"
    And User input Deskripsi field "A good t-shirt for man and women"
    And User upload product image
    And User click on Terbitkan button
    Then User redirected to product detail page
    #Seller Logout
    When User click on person icon on the navbar
    And User click on Keluar button
    Then User redirected to product list page
    # Login as the buyer
    When User click on Masuk button on the navbar
    And User redirected to "Masuk" page
    And User input registered Email "FinalFantasy6@swiftwind.com"
    And User input registered Password "zWbNCekGNYRcruH"
    And User click on Masuk button
    Then User redirected to product list page
    # Buyer create an offer
    When User input Search Product field "Baju Ting Tong"
    And User click on "Baju Ting Tong" product card
    And User redirected to product detail offer page
    And User click on Saya tetarik dan ingin nego button
    And User see the "Masukkan Harga Tawarmu" modal popup
    And User input Harga Tawar field "80000"
    And User click on Kirim button
    Then User redirected to product detail offer page
    #Buyer Logout
    When User click on person icon on the navbar
    And User click on Keluar button
    Then User redirected to product list page
    # Login as the seller
    When User click on Masuk button on the navbar
    And User redirected to "Masuk" page
    And User input registered Email "FinalFantasy7@swiftwind.com"
    And User input registered Password "zWbNCekGNYRcruH"
    And User click on Masuk button
    Then User redirected to product list page
    # User accept the offer
    When User click on the bell icon
    And User click on Lihat semua notifikasi link
    And User redirected to notification list page
    And User click on product name "Baju Ting Tong"
    And User redirected to "Info Penawar" page title
    Then User click on Terima button
    # User want to change the accepted offer to sold
    When User click on Status button
    And User see a popup modal "Perbarui status penjualan produkmu"
    And User click on radio button Berhasil terjual
    And User click on Kirim button
    Then User see product status change into "Berhasil terjual" sold
    # User want to see his sold product list
    When User click on home page button on the navbar
    Then User redirected to product list page
    When User click on burger button on the navbar
    Then User redirected to "Daftar Jual Saya" DJS page
    When User click on menu Terjual
    And User click on product name terjual "Baju Ting Tong"
    And User redirected to product detail page
    And User click on Edit button
    Then User redirected to edit product page

  @PLTPE001 @Positive
  Scenario: User wants to edit the products that were successfully sold with complete input the field
    When User input Nama Produk field "Kulkas Type B"
    And User input Harga Produk field "200000"
    And User select the Kategori "Elektronik"
    And User input Deskripsi field "Kulkas terbaru"
    And User upload product image
    And User click on Terbitkan button
    Then User redirected to product detail page

  @PLTPE002 @Negative
  Scenario Outline: User want to edit the products that were successfully sold with incomplete input
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

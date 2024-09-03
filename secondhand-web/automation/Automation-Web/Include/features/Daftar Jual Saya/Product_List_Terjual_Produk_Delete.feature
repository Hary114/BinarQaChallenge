@Product_List_Terjual_Produk_Delete
Feature: Product List Terjual Produk Delete

  Background: 
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy7@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Seller create a product
    #When User click on +Jual button
    #And User input Nama Produk field "Baju Gambar Pisang"
    #And User input Harga Produk field "90000"
    #And User select the Kategori "Baju"
    #And User input Deskripsi field "A good t-shirt for man and women"
    #And User upload product image
    #And User click on Terbitkan button
    #Then User redirected to product detail page
    #Seller Logout
    #When User click on person icon on the navbar
    #And User click on Keluar button
    #Then User redirected to product list page
    # Login as the buyer
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy6@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Buyer create an offer
    #When User input Search Product field "Baju Gambar Pisang"
    #And User click on "Baju Gambar Pisang" product card
    #And User redirected to product detail offer page
    #And User click on Saya tetarik dan ingin nego button
    #And User see the "Masukkan Harga Tawarmu" modal popup
    #And User input Harga Tawar field "80000"
    #And User click on Kirim button
    #And User redirected to product detail offer page
    #Buyer Logout
    #When User click on person icon on the navbar
    #And User click on Keluar button
    #Then User redirected to product list page
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy7@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page
    # User accept the offer
    #When User click on the bell icon
    #And User click on Lihat semua notifikasi link
    #And User redirected to notification list page
    #And User click on product name "Baju Gambar Pisang"
    #And User redirected to "Info Penawar" page title
    #Then User click on Terima button
    # User want to change the accepted offer to sold
    #When User click on Status button
    #And User see a popup modal "Perbarui status penjualan produkmu"
    #And User click on radio button Berhasil terjual
    #And User click on Kirim button
    #Then User see product status change into "Berhasil terjual" sold
    # User want to see his sold product list
    #When User click on home page button on the navbar
    #Then User redirected to product list page
    #When User click on burger button on the navbar
    #Then User redirected to "Daftar Jual Saya" DJS page

  @PLTPD001 @Positive
  Scenario: User want to delete product as a seller from all product page
  	When User click on home page button on the navbar
  	Then User redirected to product list page
    When User click on burger button on the navbar
    Then User redirected to "Daftar Jual Saya" DJS page
    When User click on menu Terjual
    And User click on product name terjual "Pisang EMAS LANGKA"
    And User redirected to product detail page
    And User click on Delete button
    Then User redirected to "Daftar Jual Saya" DJS page

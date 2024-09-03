@Berhasil_Offer
Feature: Berhasil Offer
  To allow User to accept an offer for a product and then finish it as a sold product

  #Background: 
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy6@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Seller create a product
    #When User click on +Jual button
    #And User input Nama Produk field "Baju JazzJus"
    #And User input Harga Produk field "90000"
    #And User select the Kategori "Baju"
    #And User input Deskripsi field "A good t-shirt for man and women"
    #And User upload product image
    #And User click on Terbitkan button
    #Then User redirected to product detail page
    # Seller Logout
    #When User click on person icon on the navbar
    #And User click on Keluar button
    #Then User redirected to product list page
    # Login as the buyer
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "akun2@gmail.com"
    #And User input registered Password "password"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Buyer create an offer
    #When User input Search Product field "JazzJus"
    #And User click on "JazzJus" product card
    #And User redirected to product detail offer page
    #And User click on Saya tetarik dan ingin nego button
    #And User see the "Masukkan Harga Tawarmu" modal popup
    #And User input Harga Tawar field "80000"
    #And User click on Kirim button
    #And User redirected to product detail offer page
    # Buyer Logout
    #When User click on person icon on the navbar
    #And User click on Keluar button
    #Then User redirected to product list page
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy6@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User click on Masuk button
    #Then User redirected to product list page
    # User accept the offer
    #When User click on the bell icon
    #And User click on Lihat semua notifikasi link
    #And User redirected to notification list page
    #And User click on product name "JazzJus"
    #And User redirected to "Info Penawar" page title
    #Then User click on Terima button

  @BO001 @Positive
  Scenario: User want to change the accepted offer to sold
    When User click on Status button
    And User see a popup modal "Perbarui status penjualan produkmu"
    And User click on radio button Berhasil terjual
    And User click on Kirim button
    Then User see product status change into "Berhasil terjual" sold

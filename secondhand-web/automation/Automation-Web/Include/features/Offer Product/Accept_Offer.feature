@Update_Offer
Feature: Update Offer
  To allow User to accept an offer for a product

  #Background: 
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Seller create a product
    #When User click on +Jual button
    #And User input Nama Produk field "Baju Jazz"
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
    #And User input registered Email "akun3@gmail.com"
    #And User input registered Password "password"
    #And User click on Masuk button
    #Then User redirected to product list page
    # Buyer create an offer
    #When User input Search Product field "Baju Jazz"
    #And User click on "Baju Jazz" product card
    #And User redirected to product detail offer page
    #And User click on Saya tetarik dan ingin nego button
    #And User see the "Masukkan Harga Tawarmu" modal popup
    #And User input Harga Tawar field "80000"
    #And User click on Kirim button
    #Then User redirected to product detail offer page
    #Buyer Logout
    #When User click on person icon on the navbar
    #And User click on Keluar button
    #Then User redirected to product list page
    # Login as the seller
    #When User click on Masuk button on the navbar
    #And User redirected to "Masuk" page
    #And User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User click on Masuk button
    #Then User redirected to product list page

  @AO001 @Positive
  Scenario: User want to accept the offer
    And User click on product name "Pisang EMAS LANGKA"
    And User redirected to "Info Penawar" page title
    And User click on Terima button
    And User see label of product change to "Penawaran produk diterima" on the product subject
    Then User see Status button
    And User see Hubungi di button

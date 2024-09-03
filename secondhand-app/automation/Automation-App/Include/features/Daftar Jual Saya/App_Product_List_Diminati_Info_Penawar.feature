@App_Product_List_Diminati_Info_Penawar
Feature: App Product List Diminati Info Penawar
  User wants to see the Info Penawar page

  #Background: 
    # Login as the seller
    #Given User open Secondhand Binaracademy application
    #And User press on Akun button on the navbar
    #And User redirected to "Akun Saya" page
    #And User press on Masuk button
    #And User redirected to "Masuk" page
    #When User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    #Seller create a product
    #When User press on the + button in the navbar
    #And User is redirected to "Tambah Produk" page
    #And User input Nama Produk field "Eiger Backpack"
    #And User input Harga Produk field "200000"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "Tas Pria"
    #And User input Lokasi field "Jakarta"
    #And User input Deskripsi field "A good bag"
    #And User upload product image in Foto Produk
    #And User press on Terbitkan button
    #Then User redirected to "Daftar Jual Saya" page
    #Seller Logout
    #When User press on the back arrow icon
    #And User redirected to "Akun Saya" page
    #And User press on Keluar button
    #Then User redirected to product list page
    # Login as the buyer
    #When User press on Akun button on the navbar
    #And User redirected to "Akun Saya" page
    #And User press on Masuk button
    #And User redirected to "Masuk" page
    #And User input registered Email "akun2@gmail.com"
    #And User input registered Password "password"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    # Buyer Search for the product
    #When User input "Eiger Backpack" on the Search Product field
    #And The system displays a list of product related to "Eiger Backpack"
    #And User press on the product name "Eiger Backpack"
    #Then User redirected to product detail page
    # Buyer create an offer
    #When User press on Saya Tertarik dan Ingin Nego button
    #And User see a "Masukkan Harga Tawarmu" modal popup
    #And User input Harga Tawar field "100000"
    #And User press on Kirim button
    #And User will see a popup message "Harga tawarmu berhasil dikirim ke penjual"
    #And User press on back arrow icon
    #And User redirected to search page
    #And User press on back arrow icon
    #Then user redirected to product list page
    # Buyer logout
    #When User press on Akun button on the navbar
    #And User redirected to "Akun Saya" page
    #And User press on Keluar button
    #Then User redirected to product list page
    # Seller login to accept offer
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #Then User redirected to "Masuk" page
    #When User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page

  @APLDIP001 @Positive
  Scenario: User want to see the Info Penawar page
    When User press on Daftar Jual Saya button
    And User redirected to "Daftar Jual Saya" DJS page
    And User press on Diminati tab
    And User redirected to "Diminati" diminati tab
    And User press on product with product name "Man T-Shirt4" 
    Then User redirected to the "Info Penawar" page
    And There is buyer profile name
    And There is buyer image profile
    And There is buyer city
    And There is "Produk yang Ditawar" label for the list
    And There is product status "Penawaran produk"
    And There is product name 
    And There is product price
    And There is product bargain price
    And There is product image
    And There is a timestamp

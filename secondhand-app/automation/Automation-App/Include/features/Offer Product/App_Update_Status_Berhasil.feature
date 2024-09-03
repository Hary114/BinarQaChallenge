@App_Update_Status_Berhasil
Feature: App Update Status Berhasil
  To update the accepted offer for a product to sold

  #Background: 
    # Login as the seller
    #Given User open Secondhand Binaracademy application
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #Then User redirected to "Masuk" page
    #When User input registered Email "finalfantasy@swifton.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    #Seller create a product
    #When User press on the + button on the navbar
    #And User redirected to "Tambah Produk" page
    #And User input Nama Produk field "Man T-Shirt Berhasil"
    #And User input Harga Produk field "100000"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "Pakaian Pria"
    #And User input Lokasi field "Jakarta"
    #And User input Deskripsi field "A good t-shirt for man"
    #And User upload product image in Foto Produk
    #And User press on Terbitkan button
    #Then User redirected to "Daftar Jual Saya" page
    #Seller Logout
    #When User press on back arrow icon
    #And User redirected to "Akun Saya" page
    #And User press on Keluar button
    #Then User redirected to product list page
    # Login as the buyer
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #And User redirected to "Masuk" page
    #And User input registered Email "finalfantasy2@swifton.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    # Buyer Search for the product
    #When User press on Beranda button on the navbar
    #And User redirected to product list page
    #And User input "Man T-Shirt Berhasil" on the Search Product field
    #And The system displays a list of product related to "Man T-Shirt Berhasil"
    #And User press on the product name "Man T-Shirt Berhasil"
    #Then User redirected to product detail page
    # Buyer create an offer
    #When User press on Saya Tertarik dan ingin Nego button
    #And User see a "Masukkan Harga Tawarmu" modal popup
    #And User input Harga Tawar field "120000"
    #And User press on Kirim button
    #And User will see a message "Harga tawarmu berhasil dikirim ke penjual"
    #And User press on back arrow icon
    #And User redirected to search page
    #And User press on back arrow icon
    #Then user redirected to product list page
    # Buyer logout
    #When User press on the Akun button on the navbar
    #And User redirected to "Akun Saya" page
    #And User press on Keluar button
    #Then User redirected to product list page
    # Seller login to accept offer
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #Then User redirected to "Masuk" page
    #When User input registered Email "finalfantasy@swifton.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    # Seller wants to see the Info penawar page
    #When User press on Daftar Jual Saya button
    #And User redirected to "Daftar Jual Saya" page
    #And User press on Diminati tab
    #And User redirected to "Diminati" page
    #And User press on product with "Penawaran produk" label
    #Then User redirected to "Info Penawar" page
    #And There is buyer profile name
    #And There is "Produk yang Ditawar" label for the list
    # Seller accept the offer
    #When User press on Terima button
    #And User see "Yeay kamu berhasil mendapat harga yang sesuai" popup modal
    #Then User close the popup modal

  @AUSBer001 @Positive
  Scenario: User wants to update the accepted offer for a product to sold
    When User press on Status button
    And User see "Perbarui status penjualan produkmu" popup status modal
    And User select Berhasil terjual option
    And User press on Simpan button for confirmation
    And User will see a popup message "Status order berhasil diperbarui"
    Then The product status label change into "Berhasil terjual" Berhasil terjual
    When User press on back icon
    Then User redirected to "Daftar Jual Saya" DJS page

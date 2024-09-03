@App_Create_Offer
Feature: App Create Offer
  To allow User to make an offer for a product

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
    #And User input Nama Produk field "Man T-Shirt"
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
    #And User input "Man T-Shirt" on the Search Product field
    #And The system displays a list of product related to "Man T-shirt"
    #And User press on the product name "Man T-shirt"
    #Then User redirected to product detail page

  @ACO001 @Positive
  Scenario: User wants to create an offer for a product
    When User press on Saya Tertarik dan Ingin Nego button
    And User see a "Masukkan Harga Tawarmu" popup modal
    And User input Harga Tawar field "120000"
    And User press on Kirim button
    Then User will see a popup message "Harga tawarmu berhasil dikirim ke penjual"

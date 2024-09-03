@App_Order_list
Feature: App Order List
  As a user
  I want to see a list of products I've bid for

  Background: 
    # Login as the seller
    #Given User open Secondhand Binaracademy application
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #Then User redirected to the "Masuk" page
    #When User input registered Email "testhary@gmail.com"
    #And User input registered Password "abcde12345"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    #Seller create a product
    #When User press on the + button on the navbar
    #And User redirected to "Tambah Produk" page
    #And User input Nama Produk field "celana belang"
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
    #And User press on Masuk button
    #And User redirected to the "Masuk" page
    #And User input registered Email "newaccount@gmail.com"
    #And User input registered Password "NewAccountPassword"
    #And User press on Masuk button
    #And User redirected to the "Akun Saya" page
    # Buyer Search for the product
    #When User press on Beranda button on the navbar
    #Then User redirected to product list page
    #When User input "celana belang" on the Search Product field
    #And The system displays a list of product related to "celana belang"
    #And User press on the product name "celana belang"
    #And User redirected to the product detail page
    #And User press on Saya Tertarik dan Ingin Nego button
    #And User see a "Masukkan Harga Tawarmu" modal popup
    #And User input Harga Tawar field "120000"
    #And User press on Kirim button
    #Then User will see a popup message "Harga tawarmu berhasil dikirim ke penjual"

  @AOL001 @Positive
  Scenario: User want to view Order List
  #	When User press on back arrow icon
  #	And User redirected to search page
  #	And User press on back arrow icon
  #	And User redirected to product list page
  	And User press on Akun button on the navbar
  	And User redirected to "Akun Saya" Akun Saya page
    And User press on Pesanan Saya button
    Then User redirected to "Pesanan Saya" Pesanan Saya page
    And User see Order List
    And There are Status Penawaran Produk
    And There are Product Name
    And There are Harga Tawar

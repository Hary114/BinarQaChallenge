@App_Product_List_Produk_Hapus
Feature: App Product List Produk Hapus
  User wants to delete their own published product from Produk page

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
    #And User redirected to "Tambah Produk" page
    #And User input Nama Produk field "Samsung"
    #And User input Harga Produk field "1500000"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "Handphone dan Aksesoris"
    #And User input Lokasi field "Jakarta"
    #And User input Deskripsi field "Bagus"
    #And User upload product image in Foto Produk
    #And User press on Terbitkan button
    #Then User redirected to "Daftar Jual Saya" page
    #And User will see a popup message "Produk berhasil diterbitkan"

  @APLPH001 @Positive
  Scenario: User wants to delete a product
    When User press on the trashcan icon on a product "Man T-Shirt3"
    And A popup modal "Hapus produk ini?" appear
    And User press on Batalkan button
    And User press on the trashcan icon on a product "Man T-Shirt3"
    And A popup modal "Hapus produk ini?" appear
    And User press on Hapus button
    Then User will see a popup message "Produk berhasil dihapus"

  #@APLPH002 @Positive
  #Scenario: User wants to cancel deleting a product
    #When User press on the trashcan icon on a product
    #And A popup modal "Hapus produk ini?" appear
    #Then User press on Batalkan button

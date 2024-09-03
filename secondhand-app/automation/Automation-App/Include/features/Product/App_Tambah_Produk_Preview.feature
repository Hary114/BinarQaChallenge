@App_Tambah_Produk_Preview
Feature: App Tambah Produk Preview
  To preview when creating a product before publishing it

  #Background: 
    #Given User open Secondhand Binaracademy application
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #Then User redirected to the "Masuk" page
    #When User input registered Email "finalfantasy@swifton.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    #When User press on the + button on the navbar
    #Then User redirected to "Tambah Produk" page

  @ATPP001 @Positive
  Scenario: User want to preview when creating a product
    When User press on the + button on the navbar
    Then User redirected to "Tambah Produk" create product page
    When User input Nama Produk field "Man T-Shirt2"
    And User input Harga Produk field "100000"
    And User press on Kategori dropdown menu
    And User select the Kategori "Pakaian Pria"
    And User input Lokasi field "Jakarta"
    And User input Deskripsi field "A good sports car"
    And User press upload product image in Foto Produk
    And User press icon Galeri
    And User press product image from phone
    And User press on Preview button
    And User redirected to "Tinjau Produk" Tinjau Produk page
    And User can see the product image
    And User can see the product name
    And User can see the product price
    And User can see their name
    And User can see the Category
    Then User can see a Kembali ke Halaman Sebelumnya button
    
  @ATPP002 @Positive
  Scenario: User want to preview when creating a product before publishing it
    When User press on the + button on the navbar
    Then User redirected to "Tambah Produk" create product page
    When User input Nama Produk field "Lamborghini"
    And User input Harga Produk field "100000"
    And User press on Kategori dropdown menu
    And User select the Kategori "Pakaian Pria"
    And User input Lokasi field "Jakarta"
    And User input Deskripsi field "A good sports car"
    And User press upload product image in Foto Produk
    And User press icon Galeri
    And User press product image from phone
    And User press on Preview button
    And User redirected to "Tinjau Produk" Tinjau Produk page
    And User can see the product image
    And User can see the product name
    And User can see the product price
    And User can see their name
    And User can see the Category
    Then User can see a Kembali ke Halaman Sebelumnya button
    When User press on Kembali ke Halaman Sebelumnya button
    And User redirected to "Tambah Produk" create product page
    And User press on Terbitkan button
    And User will see a popup message "Produk berhasil diterbitkan" published
    Then User redirected to "Daftar Jual Saya" DJS page

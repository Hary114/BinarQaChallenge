@App_Tambah_Produk
Feature: App Tambah Produk
  User wants to create a product

  #Background: 
    #Given User open Secondhand Binaracademy application
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" page
    #When User press on Masuk button
    #Then User redirected to the "Masuk" page
    #When User input registered Email "finalfantasy@swifton.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #And User press on Masuk button
    #Then User redirected to the "Akun Saya" page

  @ATP001 @Positive
  Scenario: User want to create a product with correct input from Emulator
  	When User press on the + button on the navbar
    Then User redirected to "Tambah Produk" create product page
    When User input Nama Produk field "Man T-Shirt2"
    And User input Harga Produk field "100000"
    And User press on Kategori dropdown menu
    And User select the Kategori "Pakaian Pria"
    And User input Lokasi field "Jakarta"
    And User input Deskripsi field "A good t-shirt for man"
    And User press upload product image in Foto Produk
    And User press icon Galeri
    And User press product image
    And User press on Terbitkan button
    And User will see a popup message "Produk berhasil diterbitkan" published
    Then User redirected to "Daftar Jual Saya" DJS page
  
  @ATP003 @Positive
  Scenario: User want to create a product with correct input from Android Phone
  	When User press on the + button on the navbar
    Then User redirected to "Tambah Produk" create product page
    When User input Nama Produk field "Man T-Shirt4"
    And User input Harga Produk field "100000"
    And User press on Kategori dropdown menu
    And User select the Kategori "Pakaian Pria"
    And User input Lokasi field "Jakarta"
    And User input Deskripsi field "A good t-shirt for man"
    And User press upload product image in Foto Produk
    And User press icon Galeri
    And User press product image from phone
    And User press on Terbitkan button
    And User will see a popup message "Produk berhasil diterbitkan" published
    Then User redirected to "Daftar Jual Saya" DJS page

  #@ATP002 @Negative @Outline
  #Scenario Outline: User want to add a product with incomplete input
    #When User input Nama Produk field "<Name>"
    #And User input Harga Produk field "<Price>"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "<Category>"
    #And User input Lokasi field "<Location>"
    #And User input Deskripsi field "<Description>"
    #And User upload product image in "<Image>"
    #And User press on Terbitkan button
    #Then There is "<Error Message>" error message below "<Blank Field>" field
#
    #Examples: 
      #| Name        | Price | Category     | Location | Description    | Foto Produk | Error Message                                 | Blank Field |
      #|             | 55000 | Pakaian Pria | Jakarta  | A good product | foto.jpg    | Nama produk tidak boleh kosong                | Name        |
      #| Man T-shirt |       | Pakaian Pria | Jakarta  | A good product | foto.jpg    | Harga tidak boleh kosong                      | Price       |
      #| Man T-shirt | 55000 |              | Jakarta  | A good product | foto.jpg    | Pilih minimal 1 kategori                      | Category    |
      #| Man T-shirt | 55000 | Pakaian Pria |          | A good product | foto.jpg    | Lokasi tidak boleh kosong                     | Location    |
      #| Man T-shirt | 55000 | Pakaian Pria | Jakarta  |                | foto.jpg    | Deskripsi produk tidak boleh kosong           | Description |
      #| Man T-shirt | 55000 | Pakaian Pria | Jakarta  | A good product |             | Silahkan masukkan foto produk terlebih dahulu | Image       |

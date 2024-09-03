@App_Product_List_Produk_Edit
Feature: App Product List Produk Edit
  User wants to edit their own published product from Produk page

  #Background: 
    # Login as the seller
    #Given User open Secondhand Binaracademy application
    #And User press on Akun button on the navbar
    #And User redirected to "Akun Saya" page
    #And User press on Masuk button
    #And User redirected to the "Masuk" page
    #When User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User press on Masuk button
    #Then User redirected to the "Akun Saya" page
    #Seller create a product
    #When User press on the + button in the navbar
    #And User redirected to "Tambah Produk" page
    #And User input Nama Produk field "Nokia"
    #And User input Harga Produk field "1500000"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "Handphone dan Aksesoris"
    #And User input Lokasi field "Jakarta"
    #And User input Deskripsi field "Bagus"
    #And User upload product image in Foto Produk
    #And User press on Terbitkan button
    #Then User redirected to "Daftar Jual Saya" page
    #And User will see a popup message "Produk berhasil diterbitkan"

  @APLPE001 @Positive
  Scenario: User wants to edit a product
  	When User press on Daftar Jual Saya button
    And User press on product with product name "Man T-Shirt2"
    And User redirected to "Ubah Produk" page
    And User input Nama Produk field "Kulkas"
    And User input Harga Produk field "12000"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "Elektronik"
    And User input Lokasi field "Surabaya"
    And User input Deskripsi field "bagus"
    And User press upload product image in Foto Produk
    And User press icon Galeri
    And User press product image from phone
    And User press on Perbarui button
    Then User redirected to "Daftar Jual Saya" page
    And User will see a popup message "Produk berhasil diperbarui"

  #@APLPE002 @Negative @Outline
  #Scenario Outline: User want to Edit a product with incomplete input
    #When User press on the "Chitato" product
    #And User redirected to "Ubah Produk" page
    #And User input Nama Produk field "<Name>"
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
      #| Name  | Price  | Category              | Location | Description    | Image    | Error Message                       | Blank Field |
      #|       | 150000 | Produk dan Kecantikan | Bandung  | A good product | foto.jpg | Nama produk tidak boleh kosong      | Name        |
      #| Serum |        | Produk dan Kecantikan | Bandung  | A good product | foto.jpg | Harga tidak boleh kosong            | Price       |
      #| Serum | 150000 |                       | Bandung  | A good product | foto.jpg | Pilih minimal 1 kategori            | Category    |
      #| Serum | 150000 | Produk dan Kecantikan |          | A good product | foto.jpg | Lokasi tidak boleh kosong           | Location    |
      #| Serum | 150000 | Produk dan Kecantikan | Bandung  |                | foto.jpg | Deskripsi produk tidak boleh kosong | Description |

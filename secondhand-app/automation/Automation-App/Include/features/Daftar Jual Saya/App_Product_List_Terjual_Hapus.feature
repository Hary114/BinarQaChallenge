@App_Product_List_Terjual_Hapus
Feature: App Product List Terjual Hapus
  User wants to delete their own published product from Terjual page

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
    #When User press on the + button on the navbar
    #And User redirected to "Tambah Produk" page
    #And User input Nama Produk field "Tas Dior"
    #And User input Harga Produk field "200000"
    #And User press on Kategori dropdown menu
    #And User select the Kategori "Tas Wanita"
    #And User input Lokasi field "Malang"
    #And User input Deskripsi field "A good bag"
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
    #And User redirected to "Akun Saya" page
    #And User press on Masuk button
    #And User redirected to "Masuk" page
    #And User input registered Email "akun2@gmail.com"
    #And User input registered Password "password"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    # Buyer Search for the product
    #When User press on Beranda button on the navbar
    #And User redirected to product list page
    #And User input "Tas Dior" on the Search Product field
    #And The system displays a list of product related to "Tas Dior"
    #And User press on the product name "Tas Dior"
    #Then User redirected to product detail page
    # Buyer create an offer
    #When User press on Saya Tertarik dan ingin Nego button
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
    # Seller login
    #When User press on Akun button on the navbar
    #And User redirected to "Akun Saya" page
    #And User press on Masuk button
    #And User redirected to "Masuk" page
    #When User input registered Email "fifi@gmail.com"
    #And User input registered Password "password"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" page
    # Seller accept the offer
    #When User press on Daftar Jual Saya button
    #And User redirected to "Daftar Jual Saya" page
    #And User press on Diminati tab
    #And User redirected to "Diminati" page
    #And User press on product with "Penawaran produk" label
    #And User redirected to "Info Penawar" page
    #And User press on Terima button
    #And User see "Yeay kamu berhasil mendapat harga yang sesuai" popup modal
    #Then User close the popup modal
    # Seller update product status
    #When User press on Status button
    #And User see "Perbarui status penjualan produkmu" popup modal
    #And User select "Berhasil terjual" option
    #And User press on Simpan button
    #Then User see a popup message "Status order berhasil diperbarui"
    #And User redirected to "Info Penawar" page
    #And The product status label change into "Berhasil Terjual"
    #And User press on back arrow icon
    #And User redirected to "Diminati" page
    #And User press on Terjual tab
    #And User redirected to "Terjual" page
    #And User see the sold product name

  @APLTH001 @Positive
  Scenario: User wants to delete a product
  	When User press on Terjual tab
  	And User resfresh the Terjual page
    And User redirected to terjual "Terjual" page
    And User press on the trashcan icon on a product "Man T-Shirt4"
    And A popup modal "Hapus produk ini?" appear
    And User press on Batalkan button
    And User press on the trashcan icon on a product "Man T-Shirt4"
    And A popup modal "Hapus produk ini?" appear
    And User press on Hapus button
    Then User will see a popup message "Produk berhasil dihapus"

  #@APLTH002 @Positive
  #Scenario: User wants to cancel deleting a product
    #When User press on the trashcan icon on a product
    #And A popup modal "Hapus produk ini?" appear
    #Then User press on Batalkan button

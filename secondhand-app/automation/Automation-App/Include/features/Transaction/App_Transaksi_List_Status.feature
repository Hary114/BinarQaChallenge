@App_Transaksi_List_Status
Feature: App Transaksi List Status
  To see the transaction status from transaksi page

  Background: 

  #Given User open Secondhand Binaracademy application
  #When User press on Akun button on the navbar
  #And User redirected to "Akun Saya" Akun saya page
  #And User press on Masuk button
  #And User redirected to "Masuk" masuk page
  #And User input registered Email "Ap12345@gmail.com"
  #And User input registered Password "123456"
  #And User press on Masuk button
  #Then User redirected to "Akun Saya" Akun saya page
  @ATLS001 @Positive
  Scenario: User wants to see the transaction status from transaksi page
    When User press on Transaksi button on the navbar
    And User redirected to "Transaksi" transaksi page
    And User see transaksi list
    #And There is status subject Penawaran produk "Dibatalkan" dibatalkan
    #And There is status subject Penawaran produk "Selesai" selesai
    #And User see product name
    #And User see product image
    #And User see product price
    #And User see product price offer
    #Then User see notification timestamp

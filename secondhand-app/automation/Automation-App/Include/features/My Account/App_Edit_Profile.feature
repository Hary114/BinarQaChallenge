@App_Edit_Profile
Feature: App Edit Profile
  As a user
  I want to edit my profile information

  Background:
  #Given User open Secondhand Binaracademy application
  When User press on Akun button on the navbar
  #Then User redirected to "Akun Saya" page
  #When User press on Masuk button
  #Then User redirected to the "Masuk" page
  #When User input registered Email "newaccount@gmail.com"
  #And User input registered Password "NewAccountPassword"
  #And User press on Masuk button
  #Then User redirected to "Akun Saya" page
  
  @AEP001 @Positive @Outline
  Scenario: User want to Edit Profile
    When User press on pencil icon
    And User redirected to "Lengkapi Info Akun" LIA page
    When User press on profile Name
    And The system display a popup modal "Ubah Nama"
    And User input new profile Name "Edited Name"
    And User press on Simpan button
    Then User will see a popup message "Profil berhasil diperbarui"
    And User see new profile Name "Edited Name"
    When User press on profile Phone 
    And The system display a popup modal "Ubah Nomor HP"
    And User input new profile Phone "0987654321"
    And User press on Simpan button
    Then User will see a popup message "Profil berhasil diperbarui"
    And User see new profile Phone "0987654321"
    When User press on profile City
    And The system display a popup modal "Ubah Kota"
    And User input new profile City "Edited City"
    And User press on Simpan button
    Then User will see a popup message "Profil berhasil diperbarui"
    And User see new profile City "Edited City"
    When User press on profile Address
    And The system display a popup modal "Ubah Alamat"
    And User input new profile Address "Edited Address"
    And User press on Simpan button
    Then User will see a popup message "Profil berhasil diperbarui"
    And User see new profile Address "Edited Address"
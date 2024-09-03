@App_Edit_Account_Password
Feature: App Edit Account Password
  As a User
  I want to edit my Password

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

  @AEAP001 @Positive
  Scenario: User want to Edit Password
    When User press on pencil icon
    Then User redirected to "Lengkapi Info Akun" LIA page
    When User press on account Password
    And The system display a popup modal "Ubah Password"
    And User input Kata Sandi Lama field "abcde12345"
    And User input Kata Sandi Baru field "newabcde12345"
    And User input Konfirmasi Kata Sandi field "newabcde12345"
    And User press on Simpan button
    Then User will see a popup message "Kata sandi berhasil diperbarui"

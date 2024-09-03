@App_Edit_Account_Email
Feature: App Edit Account Email
  As a User
  I want to edit my Email

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

  @AEAE001 @Positive
  Scenario: User want to Edit Email
    When User press on pencil icon
    Then User redirected to "Lengkapi Info Akun" LIA page
    When User press on account Email
    And The system display a popup modal "Ubah Email"
    And User input new Email "editedemail@gmail.com"
    And User press on Simpan button
    Then User will see a popup message "Profil berhasil diperbarui"
    And User see new Email "editedemail@gmail.com"

@Edit_Profile
Feature: Edit Profile
  As a User
  I want to edit my profile
  So that I can update my personal information

  Background: 
    #When User click on Masuk button on the navbar
    #Then User redirected to "Masuk" page
    #When User input registered Email "testhary@gmail.com"
    #And User input registered Password "abcde12345"
    #Then User click on Masuk button
    When User click on person icon on the navbar
    And User click on user profile name
    Then User redirected to "Lengkapi Info Akun" LIA page
	
  @EP001 @Positive @SellerEP
  Scenario: User successfully edit their profile
    When User upload profile image file
    And User input Nama field "Seller Account"
    And User select "Solo" from dropdown menu
    And User input Alamat field "Seller address"
    And User input No Handphone field "12345678"
    And User click on Simpan button
    Then User redirected to product list page

  @EP002 @Positive @BuyerEP
  Scenario: User successfully edit their profile
    When User upload profile image file
    And User input Nama field "Buyer Account"
    And User select "Jakarta" from dropdown menu
    And User input Alamat field "Buyer address"
    And User input No Handphone field "123456789"
    And User click on Simpan button
    Then User redirected to product list page

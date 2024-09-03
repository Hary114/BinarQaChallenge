@App_Logout_Account
Feature: App Logout Account
  As a user
  I want to log out of my account
  So that I can ensure my account is secure

  #Background: 
    #Given User open Secondhand Binaracademy application
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" Akun Saya page
    #When User press on Masuk button
    #Then User redirected to "Masuk" Masuk page
    #When User input registered Email "testhary@gmail.com"
    #And User input registered Password "abcde12345"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" Akun Saya page

  @ALA001 @Positive
  Scenario: User want to log out of their account
  	When User press on Akun button on the navbar
  	And User redirected to "Akun Saya" Akun Saya page
    When User press on Keluar button
    Then User redirected to product list page
		When User press on Akun button on the navbar
		And User redirected to "Akun Saya" Akun Saya page
		Then User see "Masuk" button
		
  @ALO002 @Positive
  Scenario: User want to log out of their account from the product detail for offer page
  	When User press on back icon	
    Then User redirected to search page
    When User press on back icon
    Then User redirected to product list page
  	When User press on Akun button on the navbar
  	And User redirected to "Akun Saya" Akun Saya page
    And User press on Keluar button
    Then User redirected to product list page
    
  @ALO003 @Positive
  Scenario: User want to log out of their account from the product daftar jual saya page
  	When User press on back icon
  	And User redirected to "Akun Saya" Akun Saya page
    And User press on Keluar button
    Then User redirected to product list page
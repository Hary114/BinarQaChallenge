@App_Signup_Account
Feature: App Signup Account
  As a potential new user
  I want to sign up for an account
  So that I can access the features available to registered User

  Background: 
    When User press on Akun button on the navbar
    Then User redirected to "Akun Saya" Akun Saya page
    And User press on Masuk button
    When User redirected to "Masuk" Masuk page
    And User press on Daftar link
    Then User redirected to "Daftar" Daftar page

  @ASA001 @Positive
  Scenario: Seller successful Signup with valid information
    When User input Nama field "BinarSeller2"
    And User input Email field "BinarSeller2@gmail.com"
    And User input Password field "password"
    And User input No HP field "123456789"
    And User input Kota field "Solo"
    And User input Alamat field "Jl.Merdeka"
    And User press on Daftar button
    Then User redirected to "Akun Saya" Akun Saya page

  @ASA003 @Positive
  Scenario: Buyer successful Signup with valid information
    When User input Nama field "BinarBuyer2"
    And User input Email field "BinarBuyer2@gmail.com"
    And User input Password field "password"
    And User input No HP field "123456789"
    And User input Kota field "Klaten"
    And User input Alamat field "Jl.Merapi"
    And User press on Daftar button
    Then User redirected to "Akun Saya" Akun Saya page
    
    
  #@ASA002 @Negative @Outline
  #Scenario Outline: User unsuccessful Signup with invalid and unfilled information
    #When User input Nama field "<Nama>"
    #And User input Email field "<Email>"
    #And User input Password "<Password>"
    #And User press on Daftar button
    #Then There is "<Error_Message>" error message below the invalid and unfilled field
#
    #Examples: 
      #| Nama       | Email                | Password           | No HP  | Kota | Alamat  | Error_Message                        |
      #|            | newaccount@gmail.com | NewAccountPassword | 123456 | Solo | Di Solo | Nama tidak boleh kosong              |
      #| NewAccount |                      | NewAccountPassword | 123456 | Solo | Di Solo | Email tidak boleh kosong             |
      #| NewAccount | testhary@gmail.com   | NewAccountPassword | 123456 | Solo | Di Solo | Email sudah digunakan                |
      #| NewAccount | newaccount@gmail.com |                    | 123456 | Solo | Di Solo | Password tidak boleh kosong          |
      #| NewAccount | newaccount@gmail.com |              12345 | 123456 | Solo | Di Solo | Password harus lebih dari 6 karakter |
      #| NewAccount | newaccount@gmail.com | NewAccountPassword |        | Solo | Di Solo | Nomor telepon tidak boleh kosong     |
      #| NewAccount | newaccount@gmail.com | NewAccountPassword | 123456 |      | Di Solo | Kota tidak boleh kosong              |
      #| NewAccount | newaccount@gmail.com | NewAccountPassword | 123456 | Solo |         | Alamat tidak boleh kosong            |

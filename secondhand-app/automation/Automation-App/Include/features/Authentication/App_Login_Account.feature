@App_Login_Account
Feature: App Login Account
  As a registered user
  I want to log into the application
  So that I can access my account and use the features available to logged-in User

  Background: 
    When User press on Akun button on the navbar
    Then User redirected to "Akun Saya" Akun Saya page
    When User press on Masuk button
    Then User redirected to "Masuk" Masuk page

  @ALA001 @Positive
  Scenario: Seller successful Login with valid credentials
    When User input registered Email "BinarSeller2@gmail.com"
    And User input registered Password "password"
    And User press on Masuk button
    Then User redirected to "Akun Saya" Akun Saya page

  @ALA002 @Negative @Outline
  Scenario Outline: User unsuccessful login with unfilled credentials
    When User input registered Email "<Email>"
    And User input registered Password "<Password>"
    And User press on Masuk button
    Then There is "<Error_Message>" error message

    Examples: 
      | Email                | Password           | Error_Message               |
      | newaccount@gmail.com |                    | Password tidak boleh kosong |
      |                      | NewAccountPassword | Email tidak boleh kosong    |
      
  @ALA003 @Positive
  Scenario: Buyer successful Login with valid credentials
    When User input registered Email "BinarBuyer2@gmail.com"
    And User input registered Password "password"
    And User press on Masuk button
    Then User redirected to "Akun Saya" Akun Saya page

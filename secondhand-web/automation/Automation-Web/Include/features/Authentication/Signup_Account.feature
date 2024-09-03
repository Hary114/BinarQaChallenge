@Signup_Account
Feature: Signup Account
  As a potential new User
  I want to sign up for an account
  So that I can access the features available to registered User

  Background: 
    When User click on Masuk button on the navbar
    Then User redirected to "Masuk" page
    When User click on Daftar link
    Then User redirected to "Daftar" daftar page

  @SA001 @Positive @SellerSA
  Scenario: User successful Signup with valid information
    When User input Name "SellerAccount01"
    And User input Email "selleraccount01@gmail.com"
    And User input Password "abcde12345"
    And User click on Daftar button
    Then User redirected to products list page

  @SA002 @Positive @BuyerSA
  Scenario: User successful Signup with valid information
    When User input Name "BuyerAccount01"
    And User input Email "buyeraccount01@gmail.com"
    And User input Password "abcde12345"
    And User click on Daftar button
    Then User redirected to products list page

  @SA003 @Negative
  Scenario Outline: User unsuccessful Signup with invalid and unfilled information
    When User input Name "<Name>"
    And User input Email "<Email>"
    And User input Password "<Password>"
    And User click on Daftar button
    Then There is "<Error>" error message below the invalid or unfilled field

    Examples: 
      | Name       | Email                | Password           | Error                        |
      |            | newaccount@gmail.com | NewAccountPassword | Please fill out this field   |
      | NewAccount |                      | NewAccountPassword | Please fill out this field   |
      | NewAccount | newaccount@gmail.com |                    | Please fill out this field   |
      | NewAccount | testhary@gmail.com   | NewAccountPassword | Email has already been taken |

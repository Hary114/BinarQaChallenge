@Login_Account
Feature: Login Account
  As a registered User
  I want to log into the website
  So that I can access my account and use the features available to logged-in User

  Background: 
    When User click on Masuk button on the navbar
    Then User redirected to "Masuk" page

  @LA001 @Positive @SellerLogin
  Scenario: User successful Login with valid credentials
    When User input registered Email "selleraccount01@gmail.com"
    And User input registered Password "abcde12345"
    And User click on Masuk button
    Then User redirected to product list page

  @LA002 @Positive @BuyerLogin
  Scenario: User successful Login with valid credentials
    When User input registered Email "buyeraccount01@gmail.com"
    And User input registered Password "abcde12345"
    And User click on Masuk button
    Then User redirected to product list page

  @LA003 @Negative
  Scenario Outline: User unsuccessful login with invalid and unfilled credentials
    When User input registered Email "<Email>"
    And User input registered Password "<Password>"
    And User click on Masuk button
    Then There is "<Error>" error message

    Examples: 
      | Email                | Password           | Error                      |
      | newaccount@gmail.com |                    | Please fill out this field |
      |                      | NewAccountPassword | Please fill out this field |
      | newaccount@gmail.com | wrongpassword      | Invalid Email or password  |
      | wrongemail@gmail.com | NewAccountPassword | Invalid Email or password  |

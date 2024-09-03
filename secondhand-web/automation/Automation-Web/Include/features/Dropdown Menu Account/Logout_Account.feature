@Logout_Account
Feature: Logout Account
  As a user
  I want to logout of my account
  So that I can ensure my account is secure

  Background: 
    #When User click on Masuk button on the navbar
    #Then User redirected to "Masuk" page 
    #When User input registered Email "newaccount@gmail.com"
    #And User input registered Password "NewAccountPassword"
    #And User click on Masuk button
    #Then User redirected to product list page

  @LO001 @Positive
  Scenario: User want to log out of their account
    When User click on person icon on the navbar
    And User click on Keluar button
    Then Navbar icon will change into Masuk button

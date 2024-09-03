@Notification_List
Feature: Notification List
  To allow User to see any updates for their products and offers

  Background: 
    #When User click on Masuk button on the navbar
    #Then User redirected to "Masuk" page
    #And User input registered Email "FinalFantasy6@swiftwind.com"
    #And User input registered Password "zWbNCekGNYRcruH"
    #When User click on Masuk button
    #Then User redirected to product list page

  @NL001 @Positive
  Scenario: User wants to see their notification list from bell icon dropdown menu
    When User click on the bell icon
    And User see a dropdown list

  @NL002 @Positive
  Scenario: User wants to see their notification list page from bell icon dropdown menu
    When User click on the bell icon
    Then User see a dropdown list
    When User click on Lihat semua notifikasi link
    And User redirected to notification list page
    Then User see a notification list page

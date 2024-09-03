@App_Notification_List
Feature: App Notification List
  To allow User to see any updates for their products and offers

  #Background: 
    #When User press on Akun button on the navbar
    #Then User redirected to "Akun Saya" Akun Saya page
    #When User press on Masuk button
    #Then User redirected to "Masuk" Masuk page
    #When User input registered Email "Ap12345@gmail.com"
    #And User input registered Password "123456"
    #And User press on Masuk button
    #Then User redirected to "Akun Saya" Akun Saya page   

  @ANL001 @Positive
  Scenario: User wants to see their notification list page from bell icon on the navbar
    When User press on the bell icon on the navbar
    And User redirected to the "Notifikasi" Notifikasi page
    Then User see Notifikasi list
    #And There is notification subject "Berhasil diterbitkan" berhasil diterbitkan
    #And There is notification subject "Penawaran produk" penawaran produk
    #And User see product name
    #And User see product price
    #And User see product price offer
    #Then User see notification timestamp

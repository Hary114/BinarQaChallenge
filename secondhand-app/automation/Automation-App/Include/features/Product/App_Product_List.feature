@App_Product_List
Feature: App Product List
  To see the list of products

  @APLis001 @Positive
  Scenario: User want to see the product list
    When User press on Beranda button on the navbar
    And User redirected to product list page
    Then User can see the product list
    And There are product cards
   
  @APLis002 @Positive
  Scenario: User want to see the product list after tambah produk
    When User press on back icon
    And User redirected to "Akun Saya" Akun Saya page
    When User press on Beranda button on the navbar
    And User redirected to product list page
    Then User can see the product list
    And There are product cards

  @APLis003 @Positive
  Scenario: User want to see the product list after edit profile
    When User press on back icon
    And User press on Beranda button on the navbar
    And User redirected to product list page
    Then User can see the product list
    And There are product cards


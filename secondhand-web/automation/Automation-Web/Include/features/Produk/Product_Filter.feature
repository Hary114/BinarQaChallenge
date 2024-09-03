@Product_Filter
Feature: Product Filter
  To see the list of products that match with the picked category

  #Recommended resolution : 1920 x 1080
  #Cant use scenario outline because of required text locator
  @PF0001 @Positive
  Scenario: User want to see product groupings based on product categories
    When User redirected to product list page
    And User select Hobi button category
    Then The system will display all products that match with "Hobi" category

  @PF0002 @Positive
  Scenario: User want to see product groupings based on product categories
    When User redirected to product list page
    And User select Kendaraan button category
    Then The system will display all products that match with "Kendaraan" category

  @PF0003 @Positive
  Scenario: User want to see product groupings based on product categories
    When User redirected to product list page
    And User select Baju button category
    Then The system will display all products that match with "Baju" category

  @PF0004 @Positive
  Scenario: User want to see product groupings based on product categories
    When User redirected to product list page
    And User select Elektronik button category
    Then The system will display all products that match with "Elektronik" category

  @PF0005 @Positive
  Scenario: User want to see product groupings based on product categories
    When User redirected to product list page
    And User select Kesehatan button category
    Then The system will display all products that match with "Kesehatan" category

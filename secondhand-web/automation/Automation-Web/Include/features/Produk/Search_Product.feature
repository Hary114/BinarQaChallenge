@Search_Product
Feature: Search Product
  As a User
  I want to search for product
  So that I can find items I am interested in

  @SP001 @Positive
  Scenario: User successfully searches for a product
    Given User input Search Product field "Pisang EMAS LANGKA"
    Then The system displays a list of product related to "Pisang EMAS LANGKA"

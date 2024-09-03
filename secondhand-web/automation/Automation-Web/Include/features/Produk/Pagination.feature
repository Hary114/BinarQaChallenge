@Pagination
Feature: Pagination
  To see other product list on different page

  @PA001 @Positive
  Scenario: User want to see other product list on the next page
    When User redirected to product list page
    And User click on Next button
    Then User will see other product list on different page
    And Previous button become active

  @PA002 @Positive
  Scenario: User want to see other product list on the previous page
    Given User open "https://secondhand.binaracademy.org/" 
    When User redirected to product list page
    And User click on Next button
    And User will see other product list on different page
    And Previous button become active
    And User click on Previous button
    Then User will see previous products on the initial page


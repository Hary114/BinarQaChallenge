@Category_List
Feature: Category List
  To see the list of categories

  @CL001 @Positive
  Scenario: User wants to see the category list
    Given User open "https://secondhand.binaracademy.org/"
    When User see the category list "Telusuri Kategori"
    Then There is category filter "Semua Produk"
    And There is category filter "Hobi"
    And There is category filter "Kendaraan"
    And There is category filter "Baju"
    And There is category filter "Elektronik"

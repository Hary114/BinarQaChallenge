@App_Product_Filter @APF
Feature: App Product Filter
  To see the list of products that match with the picked category

  @APF001 @Positive @Outline
  Scenario Outline: User want to see the category list
    When User can press on Kategori "<Category>"
    Then The product list sorted by "<Category>"

    Examples: 
      | Category               |
      | Elektronik             |
      | Komputer dan Aksesoris |

  @APF002 @Positive @Outline1
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 31 832
    And User can press on Kategori "<Category>"
    Then The product list sorted by "<Category>"

    Examples: 
      | Category                |
      | Handphone dan Aksesoris |

  @APF003 @Positive @Outline2
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 650 832
    And User can press on Kategori "<Category>"
    Then The product list sorted by "<Category>"

    Examples: 
      | Category     |
      | Pakaian Pria |
      | Sepatu Pria  |
      | Tas Pria     |

  @APF004 @Positive @Outline3
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 420 832
    And User can press on Kategori "<Category>"
    Then The product list sorted by "<Category>"

    Examples: 
      | Category                 |
      | Aksesoris Fashion        |
      | Kesehatan                |
      | Hobi dan Koleksi         |
      | Makanan dan Minuman      |
      | Perawatan dan Kecantikan |
      | Perlengkapan Rumah       |
      | Pakaian Wanita           |
      | Fashion Muslim           |

  @APF005 @Positive @Outline4
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 575 832
    And User can press on Kategori "<Category>"
    Then The product list sorted by "<Category>"

    Examples: 
      | Category              |
      | Fashion bayi dan Anak |
      | Ibu dan Bayi          |
      | Sepatu Wanita         |
      | Tas Wanita            |
      | Otomotif              |
      | Olahraga dan Outdoor  |
      | Buku dan Alat Tulis   |
      | Voucher               |
      | Souvenir dan Pesta    |
      | Fotografi             |

@App_Category_List @APL
Feature: App Category List
  To see the list of category

  @ACL001 @Positive @Outline
  Scenario Outline: User want to see the category list
    When User can press on Kategori "<Category>"

    Examples: 
      | Category               |
      | Elektronik             |
      | Komputer dan Aksesoris |

  @ACL002 @Positive @Outline1
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 31 832
    And User can press on Kategori "<Category>"

    Examples: 
      | Category                |
      | Handphone dan Aksesoris |

  @ACL003 @Positive @Outline2
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 650 832
    And User can press on Kategori "<Category>"

    Examples: 
      | Category                 |
      | Pakaian Pria             |
      | Sepatu Pria              |
      | Tas Pria                 |
      
 @ACL004 @Positive @Outline3
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 420 832
    And User can press on Kategori "<Category>"

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
      
      
      
   @ACL005 @Positive @Outline4
  Scenario Outline: User want to see the category list
    When User swipe the category list 950 832 575 832
    And User can press on Kategori "<Category>"

    Examples: 
      | Category                 | 
      | Fashion bayi dan Anak    |    
      | Ibu dan Bayi             |
      | Sepatu Wanita            |
      | Tas Wanita               |
      | Otomotif                 |
      | Olahraga dan Outdoor     |
      | Buku dan Alat Tulis      |
      | Voucher                  |
      | Souvenir dan Pesta       |
      | Fotografi                |

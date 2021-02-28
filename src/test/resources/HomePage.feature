Feature: HomePage Functionalities

  As an user
  I want to open Ebay website
  So that I can buy any products

  @IndividualProduct
  Scenario: search Individual product
    Given user is on ebay homepage
    When user types shoes in serach box
    And user click on search button
    Then user should able to see all shoes products

   @MultiProducts
  Scenario Outline: Search multiproducts
    Given user is on ebay homepage
    When user types "<products>" in search box
    And user click on search button
    Then  user should able to see respective products related to search
    Examples:
    | products      |
    | Mens Jeckets  |
    | Laptop        |
    | watches       |

     @DailyDeals
  Scenario: search daily deals
    Given user is on ebay homepage
    When user click on daily deals from homepage
    Then user should able to see all daily deals products

    @MyEbayAutoDropdownList
  Scenario: Select one item from My Ebay auto dropdown list
      Given user is on ebay homepage
      When user click one of the item from the my ebay auto dropdown list
      Then user should able to see the page related to searched

    @Sport&LeisureAutoDropdownList
  Scenario: select a category from the Sport&Leisure auto dropdown list
    Given user is on ebay homepage
    When user click one of the category from the Sport&Leisure auto dropdown list
    Then user should able to see the related products page
Feature: Shoes ResultPage Functionalities

  As an user
  I want to search shoes on Ebay website
  So that I can buy any shoes

  Background:
    Given user is on ebay homepage
    When user types shoes in serach box
    And user click on search button
    Then user should able to see all shoes products

    @ShoeSizeCheckbox
  Scenario: select shoes size checkbox
    Given user is on shoes Resultpage of Ebay website
    When user select one of the shoes size
    Then user able to see all shoes products related selected sizes

    @ShoesPriceRanges
  Scenario: Check shoes price range
    Given user is on shoes Resultpage of Ebay website
    When user select any price range checkbox
    Then user should able to see all shoes within that price ranges

    @ItemLocation
  Scenario: Check Item Location Option
    Given user is on shoes Resultpage of Ebay website
    When user is select any item location
    Then user should able to see the products from selected location option only
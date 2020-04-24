Feature: This is my Appium testing feature File

  Scenario Outline: End to end testing
    Given customer checked in to the application by providing "<Country>""<Name>"

    When customer selects shoes from
      | shoe1 | Air Jordan 4 Retro  |
      | shoe2 | Air Jordan 1 Mid SE |
      | shoe3 | Nike Blazer Mid '77 |
      | shoe4 | Converse All Star   |
      | shoe5 | Air Jordan 9 Retro  |
      | shoe6 | Jordan 6 Rings      |
      | shoe7 | Jordan Lift Off     |
      | shoe8 | PG 3                |
      | shoe9 | Nike SFB Jungle     |
    Then total price must be validated 1123.91
    Examples:
      | Country   | Name  |
      | Argentina | Ariet |



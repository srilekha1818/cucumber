#Author: srilekhakavuri18@gmail.com
Feature: Amazon add to cart Functionalities

  @TS1
  Scenario: Add to cart user
    Given I landed on Amazon Page
    When Enter username and password "ram","1234"
    Then "Incorrect email or password." message is displayed

  @AmazonaddtoCart
  Scenario Outline: by using data indirectly
    Given I landed on Amazon add to cart
    When Logged in with username "<name>" and password "<password>"
    Then added to cart

    Examples: 
      | name                  | password  |
      | rahulshetty@gmail.com | Iamking@0 |

  @TS3
  Scenario Outline: by using data table
    Given I landed on cart page
    When Logged in with username "<name>" and password "<password>"
    Then added to cart

    Examples: 
      | name              | password |
      | 1234@gmail.com    |     1256 |
      | abcd123@gmail.com |    45567 |

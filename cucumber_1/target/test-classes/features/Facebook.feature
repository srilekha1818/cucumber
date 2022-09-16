#Author: srilekhakavuri1@gmail.com
Feature: Facebook Functionalities

  @TS1
  Scenario: Facebook Login Functionalities
    Given Navigate to Facebook
    When Enter username and password "ram","pass"
    Then validate the login function

  @TS2
  Scenario Outline: Facebook Login Functionalities
    Given Navigate To Facebook login page
    When Enter username and password "<Username>","<Password>"
    Then validate the login function

    Examples: 
      | Username | Password |
      | dorababu |  1233444 |

  @TS3
  Scenario Outline: by using data table
    Given I navigated to the facebook login page
    When Logged in with username "<name>" and password "<password>"
    Then validate the login function with more then one credentials

    Examples: 
      | name              | password |
      | 1234@gmail.com    |     1256 |
      | abcd123@gmail.com |    45567 |

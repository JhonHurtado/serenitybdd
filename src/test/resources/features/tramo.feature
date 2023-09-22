Feature: Log in in the web site Tramo

  Scenario Outline: Login in the web site Tramo
    Given I am on the Tramo home page
    When Enter your credencials <User> and <Password>
    And cick on the button Login
    Then check log in
    Examples:
      | User             | Password |
      | carlos@gmail.com | 123456   |
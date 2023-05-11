Feature:  Web table app login functionality
  Agile story :User should be able to login  with correct credential


  @login
  Scenario: Positive login scenario
    Given user is on the Web Table app login page
    When user enter correct username
    And  user enter correct password
    And user clicks to login button
    Then user should see orders word in the URL


  @login

  Scenario: Positive login scenario
    Given user is on the Web Table app login page
    When user enters "Test" and "Tester"
    And user clicks to login button
    Then user should see "orders" word in the URL

  @login

  Scenario: Positive login scenario
    Given user is on the Web Table app login page
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    And user clicks to login button
    Then user should see "orders" word in the URL





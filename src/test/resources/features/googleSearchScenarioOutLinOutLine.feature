Feature: Google search functionality with Scenario OutLine
  User Story: As a user, when I am on the google page
  I should be able to search whatever I want and see relevant information

  @ScenariOutline
  Scenario Outline:Google search testing with Scenario Outline

    Given user is on the google page
    When user searches for "<country>" capital
    Then user should see "<capital>" in the result


    Examples:
      | country      | capital          |
      | Usa          | Washington, D.C. |
      | Turkey       | Ankara           |
      | Morocco      | Rabat            |
      | Turkmenistan | Ashgabat         |
      | Ukraine      | Kyiv             |

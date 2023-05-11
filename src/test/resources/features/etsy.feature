Feature:Etsy search functionality

  @1
  Scenario: Etsy Title Verification
    Given  User is on the Etsy homepage
    Then User should see title is as expected.

  #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
@2
  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given  User is on the Etsy homepage
    When  User types Wooden Spoon in the search box
    And   User clicks search button
    Then  User sees Wooden Spoon is in the title

@3
  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given  User is on the Etsy homepage
    When  User types "Wooden Spoon" in the search box
    And   User clicks search button
    Then  User sees "Wooden spoon - Etsy" is in the title
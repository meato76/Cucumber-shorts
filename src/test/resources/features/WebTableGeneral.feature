Feature:  Some of the general functionality verification

@z1
  Scenario: Dropdown option verification
    Given user is already in logging webTable page
    When user is on the order page
    Then user sees below options under product dropdown

      | MoneyCog   |
      | Familybea  |
      | Screenable |


  Scenario: Payment information verification
   Given user is already in logging webTable page
   When user is on the order page
   #Then user sees Visa as enabled payment option
   # Then user sees MasterCard as enabled payment option
    #Then user sees American Express as enabled payment option


  @order
  Scenario: order placement
    Given user is already in logging webTable page
    When user is on the order page
    And user enters quantity "2"
    Then user clicks to the calculate button
    And user enters customer name "John Doe"
    And user enters street "7th Street"
    And user enters city "New York"
    And user enters state "New York"
    And user enters zip "99999"
    And user select payment option "American Express"
    And user enters credit card number"111222233334444"
    And user enters expiration date "07/24"
    And user clicks to process order button
    Then user should see "John Doe" in the first row of the web table

  @Wip
  Scenario Outline: order placement
    Given user is already in logging webTable page
    When user is on the order page
    And user enters quantity "<quantity>"
    Then user clicks to the calculate button
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user select payment option "<paymentType>"
    And user enters credit card number"<cardNumber>"
    And user enters expiration date "<expDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table


    Examples:
      | quantity | customerName | street | city | state | zip   | paymentType | cardNumber       | expDate | expectedName |
      | 3        | John Doe     | 7th st | NY   | NY    | 33333 | Visa        | 1111222233334444 | 08/23   | John Doe     |
      | 3        | John one     | 7th st | NY   | NY    | 33333 | Visa        | 1111222233334444 | 08/23   | John one     |
      | 3        | John Doe     | 7th st | NY   | NY    | 33333 | Visa        | 1111222233334444 | 08/23   | John Doe     |
      | 3        | Mustapha Laa | 7th st | NY   | NY    | 33333 | Visa        | 1111222233334444 | 08/23   | Mustapha Laa |
      | 3        | John Doe     | 7th st | NY   | NY    | 33333 | Visa        | 1111222233334444 | 08/23   | John Doe     |
      | 3        | John Doe     | 7th st | NY   | NY    | 33333 | Visa        | 1111222233334444 | 08/23   | John Doe     |


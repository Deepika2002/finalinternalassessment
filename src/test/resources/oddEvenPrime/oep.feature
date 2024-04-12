Feature: OddEvenPrime Game Play

Scenario: Play the OEP to get ODDPRIME
    Given I create a OEP Game Play object
    When I play the game with number 3
    Then The result is ODD and PRIME

Scenario: Play the OEP to Even
    Given I create a OEP Game Play object
    When I play the game with number 4
    Then The result is "EVEN"

Scenario: Play the OEP to ODD
    Given I create a OEP Game Play object
    When I play the game with number 15
    Then The result is ODD

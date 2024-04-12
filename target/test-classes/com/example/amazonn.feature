Feature: Searching different products after login

Scenario Outline: Searching different products after login with email
    Given I am on the Login page URL "https://www.amazon.in/"
    Then I click on sign in button and wait for sign in page
    When I enter username as "<username>"
    And I Click on Continue button
    And I enter password as "<password>"
    And click on login button
    Then I am logged in
    And I search different "<products>" from the search bar

Examples:
    | username     | password   | products  |
    | +917075259383  | jagadeesh | laptops   |
    | +917075259383  | jagadeesh | pendrive  |
    | +917075259383  | jagadeesh| led tv    |

Scenario Outline: Searching different products after login with phone number
    Given I am on the Login page URL "https://www.amazon.in/"
    Then I click on sign in button and wait for sign in page
    When I enter username as "<phone_number>"
    And I Click on Continue button
    And I enter password as "<password>"
    And click on login button
    Then I am logged in
    And I search different "<products>" from the search bar

Examples:
    | phone_number    | password   | products  |
    | +917075259383   | jagadeesh | laptops   |
    | +917075259383   | jagadeesh | pendrive  |
   
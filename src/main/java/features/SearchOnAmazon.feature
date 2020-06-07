Feature: Search product on amazon searchBox
  As a customer i want to search product on Amazon.com to purchase

  Background:
    Given I am at amazon Home Page

  @SmokeTest
  Scenario: Search product
    And I Enter Hand Sanitizer in search input field
    When I Click search button
    Then I should see Hand Sanitizer


  @Regression
  Scenario: Search product
    And I Enter Hand Sanitizer in search input field
    When I Click search button
    Then I should see Hand Sanitizer




  @SmokeTest
  Scenario: Search product using Parameter
    And I Enter "Hand Sanitizer" in search input field
    When I Click search button
    Then I should see "\"Hand Sanitizer\""



  @pending
  Scenario: Search product using Parameter
    And I Enter Items in search input field
      | Hand Sanitizer     |
      | T shirt            |
      | Hand soap          |
      | I Phone 11 Pro Max |
    When I Click search button
    Then I should see Expected Items
      | "Hand Sanitizer"     |
      | "T shirt"            |
      | "Hand soap"          |
      | "I Phone 11 Pro Max" |


  @pending
  Scenario Outline: Search product using Parameter
    And I Enter "<Items>" in search input field
    When I Click search button
    Then I should see "<ExpectedItems>"

    Examples:
      | Items              | ExpectedItems        |
      | Hand Sanitizer     | "Hand Sanitizer"     |
      | T shirt            | "T shirt"            |
      | Hand soap          | "Hand soap"          |
      | I Phone 11 Pro Max | "I Phone 11 Pro Max" |


  @pending
  Scenario: Search product using Parameter
    And I Enter "Hand Sanitizer" in search input field
    When I Click search button
    Then I should see "Hand Sanitizer"







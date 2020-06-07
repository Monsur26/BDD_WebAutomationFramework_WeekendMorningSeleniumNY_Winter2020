Feature: Search product on amazon searchBox
  As a customer i want to search product on Amazon.com to purchase




  Scenario: Search product
    Given I am at amazon Home Page
    And I Enter Hand Sanitizer in search input field
    When I Click search button
    Then I should see Hand Sanitizer

#  Scenario: Search product using Parameter
#    Given I am at amazon Home Page
#    And I Enter "Hand Sanitizer" in search input field
#    When I Click search button
#    Then I should see "Hand Sanitizer"














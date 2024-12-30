Feature: Navigate flipkart

  Scenario: Navigate to flipkart two search Page
    Given I am on the flipkart web page search
    When I enter shoe in the search bar and click on submit button
    Then I should see shoe page
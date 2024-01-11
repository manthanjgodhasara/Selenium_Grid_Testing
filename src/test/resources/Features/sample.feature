Feature: Sample Feature

  @tag1
  Scenario: Verify Google Title
    Given I open the Google website
    Then the title1 should be "Google"

  @tag2
  Scenario: Verify Bing Title
    Given I open the Bing website
    Then the title2 should be "Bing"
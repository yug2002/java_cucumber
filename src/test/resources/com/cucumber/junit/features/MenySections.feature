Feature: As a user I want to get ability to use menu section
  @smoke
  Scenario Outline: Docs section should contain appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "<title>" link
    Then page with title "<title>" is displayed
    Examples:
      |title         |
      |Gherkin Syntax|
      |Installation  |
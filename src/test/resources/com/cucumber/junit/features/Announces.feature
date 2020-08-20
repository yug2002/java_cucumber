Feature: As a user I want to get ability to use Search page
  @smoke
  Scenario Outline: Search page works correctly
    Given the user opens Cucumber website
    When the user clicks on the search link
    And the user type text "Announcing" in the search input field
    And the user click on the "Blog" link in the left menu
    And the user choose first item in the search results with pattern "Open Source"
    Then the user move to Announce page with title "<Article name>"
    Examples:
      |Article name                |
      |Announcing cucumber-electron|


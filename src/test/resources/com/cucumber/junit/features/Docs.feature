Feature: As a user I want to get ability to use Docs page
  @smoke
  Scenario: Docs section should contain appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "Installation" link
    Then there are 11 items in the left menu
    And left menu contains following links
    |Installation                |
    |Guides                      |
    |Professional Services       |
    |Cucumber                    |
    |Gherkin Syntax              |
    |Behaviour-Driven Development|
    |Community                   |
    |Sponsors                    |
    |Tools                       |
    |Team                        |
    |Terminology                 |


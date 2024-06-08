Feature: Smoke Test Suite

  @tag1
  Scenario: Check that application in up and running
    Given I have credentials to login to webapp
    When I open webapp
    And I login using my credentials
    Then I should be able to login
Feature: Login to Gmail account

  Scenario: Login to Gmail
    Given I navigate to gmail URL
    And Enter my username and press next
    And Enter my password and press next
    Then I should see my email
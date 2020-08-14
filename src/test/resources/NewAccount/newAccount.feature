Feature: Create new account on Adactin

  @test
    Scenario: Create a new account
    Given I go to Adactin URL
    When I select 'New User Register Here'
    And I input correct details
    And I solve the Captcha
    Then I should create a new account
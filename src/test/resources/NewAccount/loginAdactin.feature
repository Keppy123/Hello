Feature: Login to Adactin Website

  Scenario: Login to Adactin
    Given I go to Adactin website
    When I log in with Username & Password
    And I press Login
    Then I should see the booking screen

  Scenario: Book a hotel
    Given I log into Adactin
    When I fill in the search form
    And Click search
    And I select the hotel and press continue
    And I fill in account details and press book now
    Then I should see Booking Confirmation
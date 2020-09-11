Feature: Drivers profile

  As a taxi driver
  I want to personalize data in my profile
  So that I can attract more clients

  Scenario: Taxi driver should be able to upload photo
    Given I'm singed in as taxi driver
    When I add photo of my car in my profile
    Then Passengers will see the photo

  Scenario: Passing arguments to test methods
    Given I am "Krzysiek"
    When I am 25 years old
    Then I have 2.5 polish zloty in my pocket

  Scenario: Pass once again new argument
    Given I have "phone"
